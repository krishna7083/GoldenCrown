package com.tameofthrones.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * This is the reponse pojo class to build the response object of the result
 * @author Krushna Oza
 */

@Getter
@Setter
@AllArgsConstructor
public class kingdomResponse {

    List<String> responseEntity;
    
}
