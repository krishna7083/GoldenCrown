package com.tameofthrones.helpers;

import java.util.HashMap;
import java.util.Map;

import com.tameofthrones.entity.KingdomDetails;

/**
 * This is the class to return the preloaded attributed with 
 * kingdome data loaded in the same.
 * @author Krushna Oza
 */

public class KingdomFactors {

    private static final String SPACE = "Space";
    private static final String LAND = "Land";
    private static final String WATER = "Water";
    private static final String ICE = "Ice";
    private static final String AIR = "Air";
    private static final String FIRE = "Fire";

    public static Map<String, KingdomDetails> kingdomPreLoadedMap = new HashMap<
        String, KingdomDetails> () { {

            put("SPACE", new KingdomDetails(SPACE, "gorilla"));
            put("LAND", new KingdomDetails(LAND, "panda"));
            put("WATER", new KingdomDetails(WATER, "octopus"));
            put("ICE", new KingdomDetails(ICE, "mammoth"));
            put("AIR", new KingdomDetails(AIR, "owl"));
            put("FIRE", new KingdomDetails(FIRE, "dragon"));

        }

        };

}