package com.tameofthrones.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * This is the class for kindome name
 * @author Krushna Oza
 */

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Kingdom {
    
    private String kingdomeName;
}