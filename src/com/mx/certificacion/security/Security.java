/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.security;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Supaada-q214
 */
public class Security {

    public static void main(String[] args) {
        try {
            String plaintext = "My secret message";
            String algorithm = "RSA";
            KeyPair keyPair = KeyPairGenerator.getInstance(algorithm).generateKeyPair();
            System.out.println(keyPair.getPublic());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

}
