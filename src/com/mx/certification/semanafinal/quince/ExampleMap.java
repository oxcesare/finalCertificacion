/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certification.semanafinal.quince;

import java.util.*;

/**
 *
 * @author Supaada-q214
 *
 * Determinar que características tiene un HashMap y un LinkedHashMap
 */
public class ExampleMap<T> {

    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("1", "Valor 1");
        map.put("2", "Valor 2");
        map.put("3", "Valor 3");

        List<Object> list = new ArrayList<>();
        list.add("a");
        list.add(5);

        List<?> listTwo = new ArrayList<Number>();

        Map<String, String> map2 = new Hashtable<>();

        Set<Integer> setExample = new TreeSet<>();

        Map<String, String> map3 = new TreeMap<>();
        
        /**
         * Hay 3 tipos de Bounds
         */
        List<?> uno = new ArrayList<String>();
        
        List<? extends String> dos = new ArrayList<>();
        
        List<? super Number> tres = new ArrayList<Number>();
        tres.add(Integer.MAX_VALUE);
        tres.add(1);
        tres.add(10L);
        tres.add(4.3F);
        int f=5;
        Queue<String> t = new ArrayDeque<>(f);
        
        /**
         * peek retorna el elemento que esta a la cabeza.
         */
        t.peek();

        
    }

    public static <T> ExampleMap<T> ship(T t) {
        return new ExampleMap<T>();
    }

}
