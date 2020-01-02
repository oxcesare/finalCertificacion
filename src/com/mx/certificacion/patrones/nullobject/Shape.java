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
public interface Shape {
    
    
    double area();
    double perimeter();
    void draw();
    // nice to have method to indicate null object
    boolean isNull();
    
}
