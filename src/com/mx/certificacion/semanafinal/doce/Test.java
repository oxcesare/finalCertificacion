/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semanafinal.doce;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Supaada-q214
 */
public class Test {

    public static void main(String[] args) {
        List<Item> l = Arrays.asList(new Item(1, "Screw"),
                new Item(2, "Nail"), new Item(3, "Bolt"));
        l.stream().map((i)->i.getName()).sorted()
                .forEach(System.out::print);
    }
}
