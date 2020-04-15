/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certification.semanafinal.quince;

import java.util.*;

/**
 *
 * @author Supaada-q214
 * 
 * TreeSet no se puede porque aunque hereada de Collections por considerarse
 * la implementación de una interface de coleccion, TreeSet requiere de dos elementos 
 * como parametros.
 * <String,valor>
 * 
 * 
 */
public class Test5 {
    
    public static void main(String[] args) {
        Collection<String> a = new ArrayDeque<>();
        Collection<String> b = new TreeSet<>();
                
    }
}
