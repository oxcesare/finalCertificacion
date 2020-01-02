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
public class Circle implements Shape {
    // sides

    private final double radius;

    public Circle() {
        this(1.0d);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        // Area = π r^2
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        // Perimeter = 2πr
        return 2 * Math.PI * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle with area: " + area() + " and perimeter: " + perimeter());
    }

    @Override
    public boolean isNull() {
        return false;
    }
}
