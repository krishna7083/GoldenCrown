package com.tameofthrones.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.tameofthrones.entity.Kingdom;
import com.tameofthrones.entity.KingdomDetails;
import com.tameofthrones.entity.KingdomInputField;

import org.junit.Test;

/**
 * This is the Test class to test KingdomServiceImplementation logic
 * @author Krushna Oza
 */

public class KingdomServiceImplTest {


    @Test
    public void testKingdomServiceImpl() {

        Map<String, KingdomDetails> kingdomPreLoadedMap = getKingdomPreloadedMap();

        List<KingdomInputField> listOfKingdomeInputFields = getListOfKingdomInputFeilds();

        List<String> listOfWinnerKingdom = KingdomServiceImpl.getObject().calculateKingdomWinnner(kingdomPreLoadedMap,
            listOfKingdomeInputFields);

        assertNotNull(listOfKingdomeInputFields.get(0));
        assertEquals(4, listOfWinnerKingdom.size());
        assertEquals("LAND", listOfWinnerKingdom.get(2));
        assertEquals("ICE", listOfWinnerKingdom.get(3));

    }

    private List<KingdomInputField> getListOfKingdomInputFeilds() {

        List<KingdomInputField> listOfKingdomInputFields = new ArrayList<KingdomInputField>();

        KingdomInputField kingdomInputField1 = new KingdomInputField(new Kingdom("AIR"), "ROZO");
        KingdomInputField kingdomInputField2 = new KingdomInputField(new Kingdom("LAND"), "FAIJWJSOOFAMAU");
        KingdomInputField kingdomInputField3 = new KingdomInputField(new Kingdom("ICE"), "STHSTSTVSASOS");
        
        listOfKingdomInputFields.add(kingdomInputField1);
        listOfKingdomInputFields.add(kingdomInputField2);
        listOfKingdomInputFields.add(kingdomInputField3);

        return listOfKingdomInputFields;


    }


    private Map<String, KingdomDetails> getKingdomPreloadedMap() {

        Map<String, KingdomDetails> kingdomPreLoadedMap = new HashMap<
        String, KingdomDetails> () { {

            put("SPACE", new KingdomDetails("Space", "gorilla"));
            put("LAND", new KingdomDetails("Land", "panda"));
            put("WATER", new KingdomDetails("water", "octopus"));
            put("ICE", new KingdomDetails("Ice", "mammoth"));
            put("AIR", new KingdomDetails("Air", "owl"));
            put("FIRE", new KingdomDetails("Fire", "dragon"));

        }

        };
        return kingdomPreLoadedMap;
  
    }
    
        
}
