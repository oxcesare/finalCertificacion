/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semanafinal.seis;

import java.util.*;

/**
 *
 * @author Supaada-q214
 */
public class Test6 {

    public static void main(String[] args) {
        NavigableMap<String, String> mymap = new TreeMap<String, String>();
        mymap.put("a", "apple");
        mymap.put("b", "boy");
        mymap.put("c", "cat");
        mymap.put("aa", "apple1");
        mymap.put("bb", "boy1");
        mymap.put("cc", "cat1");

        mymap.pollLastEntry(); //LINE 1  // mymap.put("cc", "cat1");      
        mymap.pollFirstEntry(); //LINE 2    // mymap.put("a", "apple");      

        System.out.printf("The mymap:%s", mymap);

        NavigableMap<String, String> tailmap = mymap.tailMap("bb", false); //LINE 3

        System.out.printf("The tailmap:%s", tailmap);

        System.out.println(tailmap.pollFirstEntry()); //LINE 4        
        System.out.println(mymap.size()); //LINE 5

    }
}
