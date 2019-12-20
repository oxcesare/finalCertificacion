/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semanafinal.seis;

/**
 *
 * @author Supaada-q214
 */
class Book {

    protected final int pages = 100;

    final void mA() {
        System.out.println("In B.mA " + pages);
    }
}

class Encyclopedia extends Book {

    private int pages = 200; //1   

    void mB() {
        System.out.println("In E.mB " + pages);
    }

    void mA() { //2    No se puede sobrescribir porque es final el metodo de la clase padre
        System.out.println("In E.mA " + pages);
    }
}

public class TestClass {

    public static void main(String[] args) {
        Book o1 = new Encyclopedia(); //3    
        Book o2 = new Book();
        o1.mA(); //4  
        o1.mB(); //5 No se encuentra el metodo mB
        o2.mA();
    }
}
