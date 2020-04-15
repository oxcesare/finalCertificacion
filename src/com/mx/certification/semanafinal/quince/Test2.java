/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certification.semanafinal.quince;

import java.util.*;

/**
 *
 * @author Supaada-q214
 * 
 * List ordena de acuerdo a su orden natural 
 */
public class Test2 {
    
    public static void main(String[] args) {
        List<String> ints = new ArrayList();
        ints.add("A");
        ints.add("C");
        ints.add("D");
        ints.add("E");
        
        ints.add(1,"B");
        ints.set(4,"F");
        
        System.out.println(ints);
        
    }
    
}
