/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semanafinal.uno.reglas.generales;

/**
 *
 * Al extender de Thread podemos sobreEscribir el metodo run ()
 *
 * @author Supaada-q214
 */
public class TestClassExampleThread extends Thread {

    private static int threadcounter = 0;

    public void run() {
        threadcounter++;
        System.out.println(threadcounter);
    }

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 10; i++) {
            synchronized (TestClass.class) {
                new TestClass().start();
            }
        }
    }

}
