/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semanafinal.seis;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Supaada-q214
 */
public class Test7 {

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(2, 4, 6, 9); //1 
        Predicate<Integer> check = (Integer i) -> {     System.out.println("Checking");   
        return i == 4;
        }};
    
        Predicate even = (Integer i)-> i%2==0;  //3 
                values.stream().filter(check).filter(even).count(); //4
    }

}
