/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semanafinal.nueve;

/**
 *
 * @author Supaada-q214
 */
public class Example11 {

    public static void main(String args[]) {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (Exception e) {
             System.out.println("Exception: this should be a NullPointerException");
            throw new RuntimeException();
        }
    }
}
