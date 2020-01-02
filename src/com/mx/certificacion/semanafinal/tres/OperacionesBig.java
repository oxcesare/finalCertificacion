/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semanafinal.tres;

import java.math.BigDecimal;

/**
 *
 * @author Supaada-q214
 */
public class OperacionesBig {
    
    public static void main(String[] args) {
        
        BigDecimal uno = new BigDecimal(5.00);
        BigDecimal dos = new BigDecimal(5.00);
        
        System.out.println(uno.add(dos));
        
        System.out.println(uno.subtract(dos));
        
        System.out.println(uno.multiply(dos));
    }
    
}
