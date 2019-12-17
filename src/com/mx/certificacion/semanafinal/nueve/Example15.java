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
public class Example15 {

    public static void main(String[] args) {
        try {
            Object x = new Integer(0);
            System.out.println((String) x);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
