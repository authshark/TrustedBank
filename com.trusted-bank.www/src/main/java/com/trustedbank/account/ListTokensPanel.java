package com.trustedbank.account;

import java.util.Iterator;
import java.util.List;

import wicket.AttributeModifier;
import wicket.Component;
import wicket.extensions.markup.html.repeater.RepeatingView;
import wicket.markup.html.WebMarkupContainer;
import wicket.markup.html.basic.Label;
import wicket.markup.html.link.Link;
import wicket.markup.html.panel.Panel;
import wicket.model.AbstractReadOnlyModel;

import com.trustedbank.TrustedBankApplication;
import com.trustedbank.TrustedBankSession;
import com.trustedbank.VIPClient;
import com.trustedbank.store.TokenStorage;

public class ListTokensPanel extends Panel {

	public ListTokensPanel(final String id, List tokenIds, List smsIds, List smsTmpIds, List voiceTmpIds, List smsTxnIds, List voiceTxnIds) {
		super(id);
		// credentials
		RepeatingView repeating = new RepeatingView("repeating");
		add(repeating);
		// temporary access
		RepeatingView tmpRepeating = new RepeatingView("tmpRepeating");
		add(tmpRepeating);
		// transaction
		RepeatingView txnRepeating = new RepeatingView("txnRepeating");
		add(txnRepeating);

		int index = 0;
		if (!tokenIds.isEmpty()){
			Iterator it = tokenIds.iterator();
			while (it.hasNext()) {
				WebMarkupContainer item = new WebMarkupContainer(repeating.newChildId());
				repeating.add(item);
				String tokenId = (String) it.next();

				item.add(new ActionPanel("actions", tokenId, "OTP"));
				item.add(new Label("type", "OTP"));
				item.add(new Label("tokenId", tokenId));

				final int idx = index;
				item.add(new AttributeModifier("class", true, new AbstractReadOnlyModel() {
					public Object getObject(Component component) {
						return (idx % 2 == 1) ? "gentable-even"
								: "gentable-odd";
					}
				}));
				index++;
			}	
		}

		index = 0;
		if (!smsIds.isEmpty()){
			Iterator its = smsIds.iterator();
			while (its.hasNext()) {
				WebMarkupContainer item = new WebMarkupContainer(repeating.newChildId());
				repeating.add(item);
				String smsId = (String) its.next();

				item.add(new ActionPanel("actions", smsId, "SMS"));
				item.add(new Label("type", "SMS"));
				item.add(new Label("tokenId", smsId));

				final int idx = index;
				item.add(new AttributeModifier("class", true, new AbstractReadOnlyModel() {
					public Object getObject(Component component) {
						return (idx % 2 == 1) ? "gentable-even"
								: "gentable-odd";
					}
				}));

				index++;
			}	
		}

		index = 0;
		if (!smsTmpIds.isEmpty()){
			Iterator itt = smsTmpIds.iterator();
			while (itt.hasNext()) {
				WebMarkupContainer item = new WebMarkupContainer(tmpRepeating.newChildId());
				tmpRepeating.add(item);
				String tmpId = (String) itt.next();

				item.add(new ActionPanel("tmpActions", tmpId, "TMP_SMS"));
				item.add(new Label("tmpType", "SMS"));
				item.add(new Label("tmpId", tmpId));

				final int idx = index;
				item.add(new AttributeModifier("class", true, new AbstractReadOnlyModel() {
					public Object getObject(Component component) {
						return (idx % 2 == 1) ? "gentable-even"
								: "gentable-odd";
					}
				}));
				index++;
			}	
		}

		index = 0;        
		if (!voiceTmpIds.isEmpty()){
			Iterator itv = voiceTmpIds.iterator(); 
			while (itv.hasNext()) {
				WebMarkupContainer item = new WebMarkupContainer(tmpRepeating.newChildId());
				tmpRepeating.add(item);
				String tmpId = (String) itv.next();

				item.add(new ActionPanel("tmpActions", tmpId, "TMP_Voice"));
				item.add(new Label("tmpType", "Voice"));
				item.add(new Label("tmpId", tmpId));

				final int idx = index;
				item.add(new AttributeModifier("class", true, new AbstractReadOnlyModel() {
					public Object getObject(Component component) {
						return (idx % 2 == 1) ? "gentable-even"
								: "gentable-odd";
					}
				}));
				index++;
			}	
		}

		index = 0;
		if (!smsTxnIds.isEmpty()){
			Iterator itxs = smsTxnIds.iterator();
			while (itxs.hasNext()) {
				WebMarkupContainer item = new WebMarkupContainer(txnRepeating.newChildId());
				txnRepeating.add(item);
				String txnId = (String) itxs.next();

				item.add(new ActionPanel("txnActions", txnId, "TXN_SMS"));
				item.add(new Label("txnType","SMS"));
				item.add(new Label("txnId",txnId));

				final int idx = index;
				item.add(new AttributeModifier("class", true, new AbstractReadOnlyModel() {
					public Object getObject(Component component) {
						return (idx % 2 == 1) ? "gentable-even"
								: "gentable-odd";
					}
				}));
				index++;
			}
		}

		index = 0;        
		if (!voiceTxnIds.isEmpty()){
			Iterator itxv = voiceTxnIds.iterator();
			while (itxv.hasNext()) {
				WebMarkupContainer item = new WebMarkupContainer(txnRepeating.newChildId());
				txnRepeating.add(item);
				String txnId = (String) itxv.next();

				item.add(new ActionPanel("txnActions", txnId, "TXN_Voice"));
				item.add(new Label("txnType","Voice"));
				item.add(new Label("txnId",txnId));

				final int idx = index;
				item.add(new AttributeModifier("class", true, new AbstractReadOnlyModel() {
					public Object getObject(Component component) {
						return (idx % 2 == 1) ? "gentable-even"
								: "gentable-odd";
					}
				}));
				index++;
			}
		}
	}

	class ActionPanel extends Panel {
		public ActionPanel(String id, final String tokenId, final String type) {
			super(id);
			add(new Link("delete") {
				public void onClick() {
					String username = ((TrustedBankSession) getSession()).getUser();
					TokenStorage storage = ((TrustedBankApplication) getApplication()).getTokenStore();

					if (type.equals("OTP")){
						storage.deleteTokenId(username, tokenId);	
						VIPClient vipclient = VIPClient.getInstance();
						try {
							vipclient.DeactivateToken(tokenId, type); 

						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} else if (type.equals("SMS")){
						storage.deleteSMSId(username, tokenId);
						//TODO add de-register here
					} else if (type.equals("TMP_SMS")){
						storage.deleteTMPId(username, tokenId, "SMS");
					} else if (type.equals("TMP_Voice")){
						storage.deleteTMPId(username, tokenId, "Voice");
					} else if (type.equals("TXN_SMS")){
						storage.deleteTXNId(username, tokenId, "SMS");
					} else if (type.equals("TXN_Voice")){
						storage.deleteTXNId(username, tokenId, "Voice");
					}                              
					setResponsePage(Profile.class);
				}
			});
		}
	}
}
