/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certification.semanafinal.quince;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.*;

/**
 *
 * @author Supaada-q214
 */
public class Compete {
    
    public static void main(String[] args) {
        
        int [] t = {2,3,1,4,5};
        Stream<Integer> f = Stream.of(2,3,1,4,5);
        //Comparator<Integer> c = (a,b) -> a-b;
        f.sorted().forEach(System.out::println);
    }
    
}
