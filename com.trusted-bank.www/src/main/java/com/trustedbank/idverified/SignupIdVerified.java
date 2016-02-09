package com.trustedbank.idverified;

import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import wicket.PageParameters;

import com.trustedbank.BasePage;
import com.trustedbank.LoginSidebarPanel;
import com.trustedbank.account.SignUpPanel;
import com.trustedbank.account.SignupFailed;
import com.trustedbank.store.StorageException;
import com.trustedbank.store.TokenStorage;

public class SignupIdVerified extends BasePage {
	
	private NodeList evaluateExpr(String response, String expression) {
		// This code uses the XPath support built into JAXP.
        XPath xpath = XPathFactory.newInstance().newXPath();
		NodeList nodeList = null;
		
		try {
			nodeList = (NodeList)xpath.evaluate(expression, 
					new InputSource(new StringReader(response.toString())), 
					XPathConstants.NODESET);
		} catch (XPathExpressionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return nodeList;
	}
	
	private boolean isError (String response) {
		// Now that we've got a response, let's extract the result and
        // continue only if a successful id was returned. 
		// for now all error conditions and id not found are treated the same way
        NodeList nodeList = null;
        Node node = null;

        // look for plain error	
        nodeList = evaluateExpr(response,"//error");
        
		if ( nodeList.getLength() != 0 ) {
        	getTrustedBankSession().resetIdInit();
           	return true;
		}
		
		//look for idliveq-error
		nodeList = evaluateExpr(response,"//idliveq-error");
		
		if ( nodeList.getLength() != 0 ) {
        	getTrustedBankSession().resetIdInit();
           	return true;
		}
		
		// look for iq-summary-result = fail
        nodeList = evaluateExpr(response,"//iq-summary-result");
		
		for (int i = 0; i < nodeList.getLength(); i++)
        {
            node = nodeList.item(i);
            if (node.getTextContent().equals("fail")) {
            	getTrustedBankSession().resetIdInit();
            	return true;
            }
        }
		
		// look key = id.failure     
		nodeList = evaluateExpr(response,"//summary-result");

		for (int i = 0; i < nodeList.getLength(); i++)
        {
            node = nodeList.item(i);
            for (int j = 0; j < node.getChildNodes().getLength(); j++)
            {
                Node questionChild = node.getChildNodes().item(j);

                if (questionChild.getNodeType() != Node.ELEMENT_NODE)
                {
                    continue;
                }                    
                if (questionChild.getNodeName().equals("key"))
                {
                	if (questionChild.getTextContent().equals("id.failure")) {
                		getTrustedBankSession().resetIdInit();
                    	return true;	
                	}
                	continue;
                }
            }
        }
		return false;
	}
	
	public SignupIdVerified() {
		add(new LoginSidebarPanel("loginSidebarPanel"));
		
		if (!getTrustedBankSession().getIdInit()) {
			add(new IdQuestionsPanel("signUpPanel")
			{
				public boolean verifyIdAnswers(String firstName, String lastName, String address, String city, String state, String zip, String ssn, String yob) {
					getTrustedBankSession().setIdInit();
					String nPair[] = {"firstName","lastName","address","city","state","zip","ssnLast4","dobYear"};
					String vPair[] = {firstName,lastName,address,city,state,zip,ssn,yob};
					
					IdVerifyClient idClient = IdVerifyClient.getInstance();
					String idResponse = idClient.runId(nPair, vPair);
					
					if (!isError(idResponse)) {
						getTrustedBankSession().setIdResponse(idResponse);
						return true;	
					} else {
						return false;
					}        
				}
			});
		} else {
			if (!getTrustedBankSession().getIdChallenge()){
				Map<String, String> params = new HashMap<String, String>();
				
				String idResponse = getTrustedBankSession().getIdResponse();
				
				// Now that we've got a response, let's extract the result and
	            // continue only if a successful id was returned. 
				// for now error conditions and id not found are treated the same way
				// This code uses the XPath support built into JAXP.
	            XPath xpath = XPathFactory.newInstance().newXPath();
	            
	            // look for questions now
	            String expression = "//question";
	         
	            NodeList nodeList = null;
	            
				try {
					nodeList = (NodeList)xpath.evaluate(expression, new InputSource(new StringReader(idResponse.toString())),
					        XPathConstants.NODESET);
				} catch (XPathExpressionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	            
	            for (int i = 0; i < nodeList.getLength(); i++)
	            {
	                Node node = nodeList.item(i);
	                //String question = null;
	                //String answer = null;
                    int aCnt = 1;      
	                for (int j = 0; j < node.getChildNodes().getLength(); j++)
	                {
	                    Node questionChild = node.getChildNodes().item(j);


	                    if (questionChild.getNodeType() != Node.ELEMENT_NODE)
	                    {
	                        continue;
	                    }
	                    
	                    if (questionChild.getNodeName().equals("prompt"))
	                    {
	                        params.put("Question "+(i+1),questionChild.getTextContent());	                    	
	                    }
	                    
	                    if (questionChild.getNodeName().equals("type"))
	                    {
	                    	continue;
	                    }
	                    
	                    if (questionChild.getNodeName().equals("answer"))
	                    {
	                    	params.put("Answer "+(i+1)+" "+aCnt,questionChild.getTextContent());
	                    	aCnt++;
	                    }
	                }
	            }
	            
				String[] myFirstAnswers = { params.get("Answer 1 1"),
						params.get("Answer 1 2"),
						params.get("Answer 1 3"),
						params.get("Answer 1 4"),
						params.get("Answer 1 5")};
				
				String[] mySecondAnswers = { params.get("Answer 2 1"),
						params.get("Answer 2 2"),
						params.get("Answer 2 3"),
						params.get("Answer 2 4"),
						params.get("Answer 2 5")};
				
				String[] myThirdAnswers = { params.get("Answer 3 1"),
						params.get("Answer 3 2"),
						params.get("Answer 3 3"),
						params.get("Answer 3 4"),
						params.get("Answer 3 5")};
										
				add(new IdChallengePanel("signUpPanel", 
					params.get("Question 1"), myFirstAnswers, 
					params.get("Question 2"), mySecondAnswers,
					params.get("Question 3"), myThirdAnswers) {
				public boolean verifyIdChallenge(String firstIdAnswer, 
						String secondIdAnswer, 
						String thirdIdAnswer) {
					
					String myAnswers[] = {firstIdAnswer,secondIdAnswer,thirdIdAnswer};				
					IdVerifyClient idClient = IdVerifyClient.getInstance();
					String idQuestionsResponse = idClient.runIdQuestions(getTrustedBankSession().getIdResponse(), myAnswers);
					
					if (!isError(idQuestionsResponse)) {
						getTrustedBankSession().setIdChallenge();
						return true;	
					} else {
						return false;
					}
				}
				public void resetId() {
					getTrustedBankSession().resetIdInit();
					getTrustedBankSession().resetIdChallenge();
				}
			});
			} else {
				add(new SignUpPanel("signUpPanel") {
					public boolean signup(String username, String password) {
						TokenStorage store = getTokenStore();
						try
						{
							store.addAccount(username, password);
						}
						catch (StorageException se)
						{
							se.printStackTrace();
							return false;
						}
						getTrustedBankSession().resetIdInit();
						getTrustedBankSession().resetIdChallenge();
						return getTrustedBankSession().authenticate(username, password);
						}	
					public void resetId() {
						getTrustedBankSession().resetIdInit();
						getTrustedBankSession().resetIdChallenge();
					}
					});	
			}
		}
	}	
}
