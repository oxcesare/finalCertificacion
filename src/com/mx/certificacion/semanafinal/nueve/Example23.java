/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semanafinal.nueve;

import java.util.*;

/**
 *
 * @author Supaada-q214
 */
public class Example23 {

    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("OS", "Ubuntu Linux");
        properties.put("version", "18.04");
        properties.put("language", "English (UK)");
        String oldValue = (String) properties.setProperty("language", "German");
        if (oldValue != null) {
            System.out.println("modified the language property");
        }
        properties.list(System.out);
    }

}
