package com.tameofthrones.view;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * This is the class to display the result 
 * i.e. all the kingdom wins by king Shan
 * Also if there would not be any kingdom win by Shan in that case
 * result would be printed as None.
 * @author Krushna Oza
 */
public class DisplayKingdomWonByShan {

    /**
     * 
     * @param listOfKingdomWonByShan
     */
    public static void displayResult(List<String> listOfKingdomWonByShan) {
        
        Set<String> setOfList = new LinkedHashSet<String>(listOfKingdomWonByShan);

        if(setOfList.size()>3) {
            for(String str: setOfList) {
                System.out.print(str+" ");
            }
        }
        else {
            System.out.println("NONE");
        }
   
    }
    
}
