package com.trustedbank.idverified;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.io.FileInputStream;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class IdVerifyClient {

    private static final Log log = LogFactory.getLog(IdVerifyClient.class); 
    private static Properties defaultProps = new Properties();
    
    private static String idSvcUser; 
    private static String idSvcPassword;
    private static String idSvcUrl;
    
    private static URL i_url;
    private static URL c_url;
    
    
    private static IdVerifyClient idClient = null;
    
    public static IdVerifyClient getInstance() {
        try {
        	FileInputStream in = new FileInputStream("/home/trustedbank/trustedBank.properties");
        	defaultProps.load(in);
        	in.close();
        } catch (Exception e) {
            log.error("VIPClient() Exception: " + e);
            return null;
        }
                
        idSvcUser = defaultProps.getProperty("com.idologylive.id");
        idSvcPassword = defaultProps.getProperty("com.idologylive.password");
        idSvcUrl = defaultProps.getProperty("com.idologylive.url");
        
    	if (idClient == null) {
            idClient = new IdVerifyClient(idSvcUrl);
        }
        return idClient;            
    }
    
    private IdVerifyClient(String svcUrl) {
    	try {
			i_url = new URL(idSvcUrl+"api/idiq.svc");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	try {
			c_url = new URL(idSvcUrl+"api/idliveq-answers.svc");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public String runIdQuestions(String response, String[] answers)
    {

        try
        {
            // Container for the request parameters.
            Map<String, String> params = new HashMap<String, String>();

            params.put("username", idSvcUser);
            params.put("password", idSvcPassword);

            // Now that we've got a response, let's extract the questions and
            // send back the answers. This code uses the XPath support built
            // into JAXP.
            XPath xpath = XPathFactory.newInstance().newXPath();

            String expression = "//id-number";

            NodeList nodeList = (NodeList)xpath.evaluate(expression, new InputSource(new StringReader(response.toString())),
                XPathConstants.NODESET);

            for (int i = 0; i < nodeList.getLength(); i++)
            {
                params.put("idNumber", nodeList.item(i).getTextContent());
            }

            expression = "//question";

            nodeList = (NodeList)xpath.evaluate(expression, new InputSource(new StringReader(response.toString())),
                XPathConstants.NODESET);

            for (int i = 0; i < nodeList.getLength(); i++)
            {

                Node node = nodeList.item(i);

                String type = null;

                for (int j = 0; j < node.getChildNodes().getLength(); j++)
                {
                    Node questionChild = node.getChildNodes().item(j);

                    if (questionChild.getNodeType() != Node.ELEMENT_NODE)
                    {
                        continue;
                    }

                    if (questionChild.getNodeName().equals("type"))
                    {
                        type = questionChild.getTextContent();
                    }
                }
                params.put("question" + (i + 1) + "Type", type);
                params.put("question" + (i + 1) + "Answer", answers[i]);
            }

            URL url = new URL("https://web.idologylive.com/api/idliveq-answers.svc");
            URLConnection connection = url.openConnection();

            // Put the connection in write mode and get the output stream
            connection.setDoOutput(true);
            OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());

            // Encode the parameters so they can be sent to the server.
            StringBuffer post = new StringBuffer();
            for (String key : params.keySet())
            {
                post.append(key);
                post.append("=");
                post.append(URLEncoder.encode(params.get(key), "UTF-8"));
                post.append("&");
            }

            // Remove the extra trailing ampersand, not necessary, but why not?
            String request = post.substring(0, post.length() - 1);
            log.debug("IdVerifyClient.answerQuestions request: " +request);
            //System.out.println(request);

            out.write(request);
            out.close();

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuffer result = new StringBuffer();

            while ((inputLine = in.readLine()) != null)
            {
            	result.append(inputLine);
            	// Just for show
            	log.debug("IdVerifyClient.answerQuestions response: " +inputLine);
                //System.out.println(inputLine);
            }
            return result.toString();
        }
        catch (XPathExpressionException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;
    }

    public String runId(String[] nPair, String[] vPair)
    {
        try
        {
            URLConnection connection = i_url.openConnection();

            // Put the connection in write mode and get the output stream
            connection.setDoOutput(true);
            OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());

            // Set the parameters for the request.
            Map<String, String> params = new HashMap<String, String>();
            
            params.put("username", idSvcUser);
            params.put("password", idSvcPassword);
            
            for (int i = 0; i < nPair.length; i++)
            {
            	params.put(nPair[i], vPair[i]);
            }
            
            // Encode the parameters so they can be sent to the server.
            StringBuffer post = new StringBuffer();
            for (String key : params.keySet())
            {
                post.append(key);
                post.append("=");
                post.append(URLEncoder.encode(params.get(key), "UTF-8"));
                post.append("&");
            }

            // Remove the extra trailing ampersand, not necessary, but why not?
            String request = post.substring(0, post.length() - 1);
            log.debug("IdVerifyClient.runId request: " +request);
            
            out.write(request);
            out.close();

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            StringBuffer response = new StringBuffer();
            String inputLine = null;

            while ((inputLine = in.readLine()) != null)
            {
                response.append(inputLine);

                // Just for show
                log.debug("IdVerifyClient.runId response: " +inputLine);
            }

            return response.toString();

        }
        catch (MalformedURLException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;

    }
    
}
