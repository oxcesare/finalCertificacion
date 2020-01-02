/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacionfinal.trece;

/**
 *
 * @author Supaada-q214
 * 
 * Como esta la interface x2 en el mismo paquete
 * si se alcanza a consumir dentro de de la clase Test8
 * y se puede invocar al metodo correspondiente.
 * 
 * En esta caso imprime el valor que regresa el metodo 
 * X2 
 * 
 * El metodo print no esta correctamente sobreescrito 
 * en la interface X2. 
 */
public class Test8 {

    public static void main(String[] args) {
        System.out.println(x2.print());
    }
}

interface x1 {

    public static void print() {
        System.out.println("In1");
    }
}

interface x2 extends x1 {

    static String print() {
        return "In2";
    }
}
