/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.security;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

/**
 *
 * @author Supaada-q214
 */
public class Test {

    public static void main(String[] args) {
        exampleFour();
    }

    public void exampleLamba() {
        Stream<Object> objectStream = Stream.of(new Object());

        List<String> stringList = null;
        Stream<String> stringStream = stringList.stream();
    }

    public void exampleLambdaTwo() {
        List<Integer> items = Stream.of(6, 3, 8, 12, 3, 9).collect(Collectors.toList());
    }

    /**
     * Version improve of exampleTwo
     */
    public static void exampleOne() {
        List<Integer> items = Stream.of(6, 3, 8, 12, 3, 9).collect(ArrayList::new, List::add, List::addAll);
        System.out.println(items);
    }

    public void exampleTwo() {
        List<Integer> items = Stream.of(6, 3, 8, 12, 3, 9).collect(
                () -> {
                    return new ArrayList<Integer>();
                },
                (list, i) -> {
                    list.add(i);
                },
                (list, elements) -> {
                    list.addAll(elements);
                });
        System.out.println(items);
    }

    public static void exampleThree() {
        Stream.of(1, 3, 6, 4, 5, 2)
                .sorted()
                .forEach((i) -> {
                    System.out.print(i);
                });
    }

    public static void exampleFour() {
        long sum = Stream.of(new MyItem(1), new MyItem(2), new MyItem(3))
                 .peek((item) -> {
                    item.value = 1;
                })
                .mapToInt((item) -> {
                    return item.value;
                })
                .sum();
        System.out.println(sum);
    }
}
