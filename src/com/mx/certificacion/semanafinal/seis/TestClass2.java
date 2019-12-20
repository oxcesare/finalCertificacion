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
public class TestClass2 {

    public static void main(String[] args) {
        // put declaration here        
        //Map m = new TreeMap();
        Map<Object,Object> m = new TreeMap<Object, Object>();
        m.put("1", new ArrayList());    //1       
        m.put(1, new Object());    //2       
        m.put(1.0, "Hello");     //3      
        System.out.println(m);
    }
}
