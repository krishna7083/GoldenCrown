package com.tameofthrones.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.tameofthrones.entity.KingdomDetails;
import com.tameofthrones.entity.KingdomInputField;

/**
 * This is the class which implement the interface KingdomService
 * @author Krushna Oza
 * @Interface KingdomService
 */

public class KingdomServiceImpl implements KingdomService {

    private static final String ALPHABETS = "abcdefghijklmnopqrstuvwxyz";

    private static KingdomService kingdomeservice = new KingdomServiceImpl();

    // No argument constructor
    KingdomServiceImpl() {

    }

    public static KingdomService getObject() {
        return kingdomeservice;
    }


    /**
     * This is the method which calculate the kingdom which can be won by Shan
     * @methodname calculateKingdomWinner
     * @param kingdomPreloadedMap,kingdomInputFields
     * @return listofAllValidAndWinnerKingdom -> String
     */
    @Override
    public List<String> calculateKingdomWinnner(Map<String, KingdomDetails> kingdomPreLoadedMap
    ,List<KingdomInputField> kingdomInputFields) {

        List<String> listOfAllValidAndWinnerKingdom = new ArrayList<>();

        /* Kingdom of Space always be included in the list, as he want to win all kingdom and
         we are making a list of all kingdome which Shan wins and SPACE is alrady included in the same */
        listOfAllValidAndWinnerKingdom.add("SPACE"); 

        // process every input arguments one by one
        for(int i=0; i<kingdomInputFields.size(); i++) {

            // extracting enblem value
            String enblem = kingdomPreLoadedMap.get(kingdomInputFields.get(i).getKingdome().getKingdomeName()).getKingdomeemblem();

            /* we knows that Shan sending the message in the form of encryption, but we know 
            which method he had used for the same, so we need to decrypt the first */

            String decryptedFormatOfMessage = getdecryptedFormat(
                enblem.length(),kingdomInputFields.get(i).getMessage());
            
            /* Now we are having a decrypted Message, need to check on the basis of the message
            whether Shan can win the respective Kingdom or not. */
            
            boolean isWinnableKingdom = checkWinnablekingdom(
                enblem,decryptedFormatOfMessage);

            if(isWinnableKingdom) {
                listOfAllValidAndWinnerKingdom.add(kingdomInputFields.get(i).getKingdome().getKingdomeName());
            }


        }

        return listOfAllValidAndWinnerKingdom;

    }

    /**
     * 
     * @param key
     * @param message
     * @return decryptedMessage of type String
     */
    private static String getdecryptedFormat(int key, String message) {

        String decryptedMessage = "";

        message = message.toLowerCase();

        for(int i=0; i<message.length(); i++) {
            int charPosition = ALPHABETS.indexOf(message.charAt(i));
            int operationalKey = (charPosition - key) % 26 ;
            if(operationalKey < 0) {
                operationalKey = ALPHABETS.length() + operationalKey;
            }
            decryptedMessage += ALPHABETS.charAt(operationalKey);
        }

        return decryptedMessage;
    }

    /**
     * 
     * @param enblem
     * @param decryptedMessage
     * @return flag variable of type boolean
     */
    private static boolean checkWinnablekingdom(String enblem, String decryptedMessage) {

        boolean flag = true;

        // making a frequency array of decryptedMessage String
        HashMap<Character,Integer> frequencyHashMap = 
            new HashMap<Character,Integer>();

        for(char c: decryptedMessage.toCharArray()) {

            if(frequencyHashMap.containsKey(c)) {
                frequencyHashMap.put(c,frequencyHashMap.get(c)+1);
            }
            else {
                frequencyHashMap.put(c,1);
            }
        }

        for(char ch: enblem.toCharArray()) {

            if(frequencyHashMap.containsKey(ch)) {
                if(frequencyHashMap.get(ch)>=1) {

                    frequencyHashMap.put(ch,frequencyHashMap.get(ch)-1);
                }
                else {
                    return false;
                }
            }
            else {
                return false;
            }
        }

        return flag;
    }

}
