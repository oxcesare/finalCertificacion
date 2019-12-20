/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semanafinal.seis;

/**
 *
 * @author Supaada-q214
 */
public class Onion {

    private String data = "skin";

    private class Layer extends Onion {

        String data = "thegoodpart";

        public String getData() {
            return data;
        }
    }

    public String getData() {
        return new Layer().getData();
    }

    public static void main(String[] args) {
        Onion o = new Onion();
        System.out.println(o.getData());
    }
}
