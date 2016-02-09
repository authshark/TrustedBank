package com.trustedbank.store;

import java.util.Iterator;
import java.util.List;

public class TokenStorageTest {
	
    public static void main(String[] args) {

        TokenStorage storage = new TokenStorageEmbeddedDBImpl();
        storage.startup();
        
        String userId = "alin";
        String pwd = "password";
        
        try
        {
        	storage.addAccount(userId, pwd);
        }
        catch (StorageException se)
        {
        	se.printStackTrace();
        }

       
        if (storage.authenticate(userId, pwd))
        	System.out.println("User \"" + userId + "\" has been authenticated succesfully!");
        else 
        	System.out.println("User \"" + userId + "\" has NOT been authenticated!");
       
        //add new tokens here
        String tokenId = "ALIN00000001";
      	System.out.println("Adding uid \"" + userId + "\" with token \"" + tokenId + "\".");
       	storage.addTokenId(userId, tokenId);
                        
        List tokenIds;
        List userIds = storage.getAllUserIdWithTokenId();
        Iterator uids = userIds.iterator();
        while (uids.hasNext()){
        	String uid = (String) uids.next();
        	System.out.println("This list is for the user \"" + uid + "\".");
        	tokenIds = storage.getTokenIdFromUserId(uid);
        	Iterator tids = tokenIds.iterator();
        	while (tids.hasNext()){
        		String tid = (String) tids.next();
        		System.out.println("Got uid \"" + uid + "\" and tid \"" + tid + "\".");
        	}
        }
        
        // remove tokens here
        tokenId = "ALING0000002";
        System.out.println("Removing tokenID \"" + tokenId + "\" from user \"" + userId + "\".");
        storage.deleteTokenId(userId, tokenId);
        
        // upgrade/downgrade schema here
        /*
        try {
			storage.upgrade(0);
		} catch (StorageException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
        System.out.println("Current db version is v." + String.valueOf(storage.getDbVersion()));
  /*      
        String tokenId = "ALNG000D1ED8";
        storage.addTokenId("erodriguez", tokenId);
        tokenId = "ALNG000D1ED9";
        storage.addTokenId("erodriguez", tokenId);

        List tokenIds = storage.getTidFromUid("alin");
        Iterator ids = tokenIds.iterator();
        while (ids.hasNext()){
            String id = (String) ids.next();
            System.out.println("1:  Got token ID " + id);
        }

      //  tokenId = "VSSTSE000001";
      //  storage.deleteTokenId("alin", tokenId);

        tokenIds = storage.getTidFromUid("erodriguez");
        ids = tokenIds.iterator();
        while (ids.hasNext()){
            String id = (String) ids.next();
            System.out.println("2:  Got token ID " + id);
        }
*/
        storage.shutdown();
    }
}
