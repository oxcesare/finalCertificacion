/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacionfinal.trece;

/**
 *
 * @author Supaada-q214
 */
public class ExampleOrder {

    public ExampleOrder() {
        System.out.println("Sin argumentos");
    }

    public ExampleOrder(String parametro) {
        System.out.println("Con argumentos");
    }
    
    
    public ExampleOrder(String x1, String x2) {
        System.out.println("Con 2 argumentos");
    }
    
    public static void main(String[] args) {
        ExampleOrder ex = new ExampleOrder("","");
    }

}
