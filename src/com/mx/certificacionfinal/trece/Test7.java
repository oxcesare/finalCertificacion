/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacionfinal.trece;

import java.util.ArrayList;

/**
 *
 * @author Supaada-q214
 */
public class Test7 {
    public static void main(String[] args) {
        ArrayList ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(2);
        ints.parallelStream().distinct().peek(
                System.out::print).count();
    }
}
