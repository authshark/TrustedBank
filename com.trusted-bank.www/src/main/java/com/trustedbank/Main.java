package com.trustedbank;

import com.trustedbank.transaction.TransferPanel;

public class Main extends PrivatePage {
	public Main() {
		add(new TransferPanel("transferPanel")
		{
			public boolean callVerifyTxn(String fromAccount, String toAccount, String amount) {
				if (!getTrustedBankSession().sendTxnVerify(fromAccount, toAccount, amount)) {
					return false;
				} else {
					return true;
				}
			}
			public boolean pushVerifyTxn(String fromAccount, String toAccount, String amount) {
				if (!getTrustedBankSession().sendPushTxnVerify(fromAccount, toAccount, amount)) {
					return false;
				} else {
					return true;
				}
			}
		});		
	}
}
