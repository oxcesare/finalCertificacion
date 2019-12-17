/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semanafinal.uno;

import java.util.function.Function;

/**
 *
 * @author Supaada-q214
 */
public class Example {
    
    private String firstName = "Cesar";
    
    /**
     * Implementacion de una clase anonima dentro de un metodo declarado en Java 
     */
    public void anotherExample (){
        Function<String,String> addSurname = new Function<String,String>(){
            @Override
            public String apply(String t) {
                 return firstName +  " " + t;
            }
            
        };
    }    
}
