/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.security;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Supaada-q214
 */
public class Exercise2 {

    public static void main(String[] args) {
        String url = "https://www.packtpub.com/application-development/mastering-java-9";
        String regex = "(http[s])(?:://)([w]{0,3}\\.?[a-zA-Z]+\\.[a-zA-Z]{2,3})(?:[/])(.*)";
        System.out.println(regex);
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(url);
        boolean foundMatches = matcher.find();
        if (foundMatches) {
            String protocol = matcher.group(1);
            String domain = matcher.group(2);
            String path = matcher.group(3);
            System.out.println("Protocol: " + protocol);
            System.out.println("domain: " + domain);
            System.out.println("Path: " + path);
        }
    }
}
