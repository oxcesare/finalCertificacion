/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.security;

import java.util.stream.Stream;

/**
 *
 * @author Supaada-q214
 */
public class Test2 {

    public static void main(String[] args) {
        Stream.of(1, 2, 3)
                .parallel()
                .map(i -> {
                    System.out.println(Thread.currentThread() + "\ti=" + i);
                    return i;
                })
                .sequential()
                .forEach(i -> System.out.println(Thread.currentThread() + "\ti=" + i));
    }

}
