/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semanafinal.once;

import java.util.function.BiConsumer;

/**
 *
 * @author Supaada-q214
 */
public class TestBiconsumer {

    public static void main(String[] args) {

        String x = "Aesar";
        Double d = 10.00D;

        BiConsumer<String, Double> func = (a, b) -> {
            if (a.startsWith("A")) {
                System.out.println(b);
            }
        };

        func.accept(x, d);
        
    }

}
