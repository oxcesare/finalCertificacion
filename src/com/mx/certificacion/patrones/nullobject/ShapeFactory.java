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
public class ShapeFactory {

    public static Shape createShape(String shapeType) {
        Shape shape = null;
        if ("Circle".equalsIgnoreCase(shapeType)) {
            shape = new Circle();
        } else if ("Rectangle".equalsIgnoreCase(shapeType)) {
            shape = new Rectangle();
        } else if ("Triangle".equalsIgnoreCase(shapeType)) {
            shape = new Triangle();
        } else {
            shape = new NullShape();
        }
        return shape;
    }
}
