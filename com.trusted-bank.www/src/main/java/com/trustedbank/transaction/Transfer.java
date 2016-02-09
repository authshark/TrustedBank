package com.trustedbank.transaction;

import com.trustedbank.*;
import com.trustedbank.push.TransferPushConfirmPanel;

public class Transfer extends PrivatePage {
	public Transfer() {
		if (!getTrustedBankSession().isTxnToBeVerified()) {			
			add(new TransferPanel("transferPanel")
			{
				@Override
				public boolean callVerifyTxn(String fromAccount, String toAccount, String amount) {
					if (!getTrustedBankSession().sendTxnVerify(fromAccount, toAccount, amount)) {
						return false;
					} else {
						return true;
					}
				}
				@Override
				public boolean pushVerifyTxn(String fromAccount, String toAccount, String amount) {
					if (!getTrustedBankSession().sendPushTxnVerify(fromAccount, toAccount, amount)) {
						return false;
					} else {
						return true;
					}
				}
			});
		} else if (!getTrustedBankSession().isTxnConfirmed()){
			if (!getTrustedBankSession().isTxnPush()) { //only if we want to implement an intermediary Panel for Push 
				add(new TransferConfirmPanel("transferPanel", 
						getTrustedBankSession().getTxnFromAcct(), 
						getTrustedBankSession().getTxnToAcct(),
						getTrustedBankSession().getTxnAmount(),
						getTrustedBankSession().getTxnOTP()){
							public void setTxnConfirm() {
									getTrustedBankSession().setTxnConfirmed();
							}
						}
					);
			} else {
				add(new TransferPushConfirmPanel("transferPanel",
						getTrustedBankSession().getTxnFromAcct(), 
						getTrustedBankSession().getTxnToAcct(),
						getTrustedBankSession().getTxnAmount()){
							public void setTxnConfirm() {
								getTrustedBankSession().setTxnConfirmed();
							}
						}
				);
			}
		} else {
			if (!getTrustedBankSession().isTxnAnswered()) {
				add( new TransferVerifiedPanel("transferPanel",false) {
					@Override
					public void resetTxnDetails() {
						getTrustedBankSession().resetTxnDetails();
					}
				});
			} else {
				add (new TransferVerifiedPanel("transferPanel",true){
					@Override
					public void resetTxnDetails() {
						getTrustedBankSession().resetTxnDetails();
					}
				});
			}	
		}
	}
}
