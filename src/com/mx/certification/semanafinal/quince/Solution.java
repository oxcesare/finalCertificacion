/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certification.semanafinal.quince;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author Supaada-q214
 */
public class Solution {
    // Complete the compareTriplets function below.

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        /* defino mis contadores */
        int alicia =0;
        int bob =0;
        
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < a.size(); i++) {
              if(a.get(i)>b.get(i)){
                  alicia++;    
                  
              }else if (a.get(i)<b.get(i)){
                  bob++;
              }else{
                  
              }
        }
        
        result.add(alicia);
        result.add(bob);
        
        return result;
        
    }

    public static void main(String[] args) throws IOException {
        
        /*
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        */
        
        List<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(6);
        a.add(7);
        
        List<Integer> b = new ArrayList<>();
        b.add(3);
        b.add(6);
        b.add(10);

        
        List<Integer> result = compareTriplets(a, b);

        result.stream().forEach(System.out::println);
        
        
    }
}
