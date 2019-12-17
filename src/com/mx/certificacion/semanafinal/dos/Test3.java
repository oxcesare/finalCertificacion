/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semanafinal.dos;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

/**
 *
 * @author Supaada-q214
 * 
 * Uso de parallel de stream
 * 
 * y permite ejecutar varias operaciones paralelamente
 * 
 * AllMatch es una operacion intermedia que recibe una interface funcional 
 * y que se aplica a un Stream en especifico 
 */
public class Test3 {

    public static void main(String[] args) {
        AtomicInteger ai = new AtomicInteger();
        Stream<String> stream = Stream.of("old", "king", "cole", "was", "a", "merry", "old", "soul").parallel();
        stream.filter(e -> {
            ai.incrementAndGet();
            return e.contains("o");
       }).allMatch(x -> x.indexOf("o") > 0);
        System.out.println("AI = " + ai);
    }
    
    
    public static void metodosAtomicInteger(){
         AtomicInteger ai = new AtomicInteger(5);
         ai.addAndGet(0);
         ai.decrementAndGet();
         ai.getAndAdd(0);
         ai.getAndIncrement();
    }

}
