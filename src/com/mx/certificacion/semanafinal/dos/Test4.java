/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semanafinal.dos;

import java.util.stream.DoubleStream;

/**
 *
 * @author Supaada-q214
 */
public class Test4 {

    public static void main(String[] args) {
        DoubleStream is = DoubleStream.of(0, 2, 4); //1 
        double sum = is.filter( i->i%2 != 0 ).sum(); //2 
        System.out.println(sum); //3
    }
}
