package com.tameofthrones;

import java.util.List;
import java.util.Map;

import com.tameofthrones.entity.KingdomDetails;
import com.tameofthrones.entity.KingdomInputField;
import com.tameofthrones.helpers.KingdomFactors;
import com.tameofthrones.operations.DataProcessing;
import com.tameofthrones.service.KingdomServiceImpl;
import com.tameofthrones.view.DisplayKingdomWonByShan;

/** 
 * This is the main application file which will call the
 * others classes in order to load the data into the map
 * process it using process method , call to service class
 * for calculating the result, and finally call view mclass 
 * to display the result.
 * @author Krushna Oza
 */

public class TameOfThronesApplication {

    public static void main(String args[]) {
        
        String pathFile = args[0];

        // get the input file processed data
        List<KingdomInputField> listOfKingdomeInputFields =
            DataProcessing.processInputData(pathFile);

        // get the prealoaded data
        Map<String, KingdomDetails> kingdomPreLoadedMap = 
            KingdomFactors.kingdomPreLoadedMap;

        // calling the service class method to processes the above both data
        List<String> listOfKingdomWonByShan = KingdomServiceImpl.getObject().calculateKingdomWinnner(
            kingdomPreLoadedMap,listOfKingdomeInputFields);

        
        // calling the display method to show the result
        DisplayKingdomWonByShan.displayResult(listOfKingdomWonByShan);

    }    
    
}
