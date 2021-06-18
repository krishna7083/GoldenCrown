package com.tameofthrones.operations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.tameofthrones.entity.KingdomInputField;
import com.tameofthrones.entity.Kingdom;

/**
 * This is the Class having method of to read the file, 
 * and map the data to the KingdomDetail Pojo class
 * and return the list of the same.
 * @author Krushna Oza
 * @methods processInputData
 */


public class DataProcessing {

    public static List<KingdomInputField> processInputData(String pathFile) {

        List<KingdomInputField> listOfKingdomeInputFields = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(pathFile))) {

            String reader;

            while((reader = br.readLine())!= null ) {

                // reading the input arguments line by line
                List<String> inputElements = Arrays.asList(reader.split(" "));

                String message = "";
                for(int i=1; i<inputElements.size(); i++) {
                    message = message.concat(inputElements.get(i));
                }
                
                KingdomInputField kingdomInputField = new KingdomInputField(new Kingdom(inputElements.get(0)),
                message);

                // adding the formed object to the list of it..

                listOfKingdomeInputFields.add(kingdomInputField);


            }

        } catch (IOException exceptionMessage) {

            // catching the exception and logging it
            exceptionMessage.printStackTrace();
        }

        return listOfKingdomeInputFields;  // returning the list of input arguments

    }


    
}
