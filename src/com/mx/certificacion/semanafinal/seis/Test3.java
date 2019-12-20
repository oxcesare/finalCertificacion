/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semanafinal.seis;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Supaada-q214
 */
public class Test3  {

    static String[] sa = { "d", "bbb", "aaaa" ,"a","f"};
     
    public static void main(String[] args) {
        
        int r = Arrays.binarySearch(sa, "bbb");        
        System.out.println("r"+" "+ r);
        
    }

    
}
