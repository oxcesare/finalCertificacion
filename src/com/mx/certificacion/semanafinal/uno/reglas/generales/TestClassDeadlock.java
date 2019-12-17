/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semanafinal.uno.reglas.generales;

/**
 *
 * 
 * The above code may result in a deadlock 
 * and so nothing can be said for sure about the output.
 * 
 * @author Supaada-q214
 */
public class TestClassDeadlock {

    static StringBuffer sb1 = new StringBuffer();
    static StringBuffer sb2 = new StringBuffer();

    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run() {
                synchronized (sb1) {
                    sb1.append("X");
                    synchronized (sb2) {
                        sb2.append("Y");
                    }
                }
                System.out.println(sb1);
            }
        }).start();
        new Thread(new Runnable() {
            public void run() {
                synchronized (sb2) {
                    sb2.append("Y");
                    synchronized (sb1) {
                        sb1.append("X");
                    }
                }
                System.out.println(sb2);
            }
        }).start();
    }

}
