/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semanafinal.uno;

/**
 *
 * @author Supaada-q214
 * 
 * Recordar que un Thread o un Runnable 
 * Es inpredecible el resultado.
 * 
 * A manera que se ejectuta se van mostrando diferentes resultados.
 * 
 */
public class TestClass implements Runnable {

    volatile int x;

    public void run() {
        x = 5;
    }

    public static void main(String[] args) {
        TestClass tc = new TestClass();
        tc.x = 10;
        new Thread(tc).start(); // 1     
        System.out.println(tc.x);  
    } 
} 
