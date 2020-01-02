/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacionfinal.trece;

import java.util.function.IntSupplier;

/**
 *
 * @author Supaada-q214
 */
public class Test4 {
    
    public static void main(String[] args) {
        IntSupplier in = () -> Integer.compare(1,2);
        System.out.println(get(in));
    }
    
    
    public static int get(IntSupplier t){
        return t.getAsInt();
    }
}
