/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semanafinal.doce;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Supaada-q214
 * 
 * anyMatch and allMatch recieve how to parameters as a Predicate function
 */
public class Test3 {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(11, 11, 22, 33, 33, 55, 66);
        boolean t = ls.stream().noneMatch(x->x%11>0);
        System.out.println("t"+t);
        
        boolean d = ls.stream().distinct().anyMatch(x->x==11);
        System.out.println("d"+d);
        
        boolean c = ls.stream().distinct().allMatch(11);
        
    }
}
