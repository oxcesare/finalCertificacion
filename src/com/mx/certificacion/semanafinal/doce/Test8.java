/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semanafinal.doce;

import java.util.stream.Stream;

/**
 *
 * @author Supaada-q214
 */
public class Test8 {

    public static void main(String[] args) {
        Stream<String> names = Stream.of("Sarah Adams", "Suzy Pinnell", "Paul Basgall");
        Stream<String> firstNames = names.map(e->e.split(" ")[0]).forEach(o);
    }
}
