package com.tameofthrones.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * This is the Pojo class to hold the input
 * @author Krushna Oza
 */

@Getter
@Setter
@Builder
@AllArgsConstructor
public class KingdomInputField {

    private Kingdom kingdome;
    private String message;
    
}
