/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semanafinal.doce;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Supaada-q214
 */
public class Test5 {

    public static void main(String[] args) {
        Path p1 = Paths.get("x\\y");
        Path p2 = Paths.get("z");
        Path p3 = p1.relativize(p2);
        System.out.println(p3);
        
        /*  */
        
        /* almacena sus objetos de manera dinamica  */
        List<String> a = new ArrayList<>();
        a.remove(new Object());
        
        /* Usa una doble lista para almacenar sus elementos */
        List<String> b = new LinkedList<>();
        b.remove(new Object());
        
        
    }

}
