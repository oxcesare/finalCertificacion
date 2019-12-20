/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semanafinal.seis;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Supaada-q214
 */
public class Test9 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Peter", "Paul", "Pascal");
        Optional<String> ops = names.stream().parallel()
.allMatch(name -> name != null).filter(name -> name.length() > 6).findAny();
        System.out.println(ops);
    }
}
