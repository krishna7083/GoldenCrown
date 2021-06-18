package com.tameofthrones.service;

import java.util.List;
import java.util.Map;

import com.tameofthrones.entity.KingdomDetails;
import com.tameofthrones.entity.KingdomInputField;

/**
 * This is the interface who has a method for getting the all kingdom list which 
 * had been won by Shan.
 * @author Krushna Oza
 */

public interface KingdomService {

    List<String> calculateKingdomWinnner(Map<String, KingdomDetails> kingdomPreLoadedMap
        ,List<KingdomInputField> kingdomInputFields);
    
}
