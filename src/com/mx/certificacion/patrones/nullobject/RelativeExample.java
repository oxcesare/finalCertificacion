/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.patrones.nullobject;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Supaada-q214
 *
 * Genera un nuevo Path resolviendo entre el path dado.
 */
public class RelativeExample {

    public static void main(String[] args) {
        Path p1 = Paths.get("x\\y\\w");
        Path p2 = Paths.get("z");
        Path p3 = p1.relativize(p2);
        System.out.println(p3);
        
        System.out.println("*********************************");
        exampleMethodNormalize();
        
    }

    /**
     * Metodo normalize quita lo redundante dado un path.
     */
    public static void exampleMethodNormalize() {
        Path p1 = Paths.get("c:\\personal\\.\\photos\\..\\readme.txt");
        Path p2 = p1.normalize();
        System.out.println(p2);
    }

}
