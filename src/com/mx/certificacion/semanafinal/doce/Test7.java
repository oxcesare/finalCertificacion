/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semanafinal.doce;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Supaada-q214
 */
public class Test7 {

    public static void main(String[] args) {
        List<Integer> str = Arrays.asList(1, 2, 3, 4);
        str.stream().filter(x -> {
            System.out.print(x + " ");
            return x > 2;
        });
    }
}
