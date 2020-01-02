/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.patrones.nullobject;

/**
 *
 * @author Supaada-q214
 */
public class NullShape implements Shape {
// no sides

    @Override
    public double area() {
        return 0.0d;
    }

    @Override
    public double perimeter() {
        return 0.0d;
    }

    @Override
    public void draw() {
        System.out.println("Null object can't be draw");
    }

    @Override
    public boolean isNull() {
        return true;
    }
}
