/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semanafinal.cinco;

import java.util.Arrays;

/**
 *
 * @author Supaada-q214
 */
public class TestBinayResearch {

    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 6};

        TestBinayResearch search = new TestBinayResearch();
        int t = search.binarySearch(numbers, 3);
        System.out.println("t" + " " + t);
    }

    public int binarySearch(int[] numbers, int number) {
        Arrays.sort(numbers);
        int x = Arrays.binarySearch(numbers, number);

        return x;
    }
}
