/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semanafinal.dos;

import java.nio.file.Path;
import java.nio.file.Paths;


/**
 *
 * @author Supaada-q214
 */
public class Test2 {
    
    public static void main(String[] args) {
        Path p1 = Paths.get("");
        Path p2 = Paths.get("");
        Path p3 = p1.resolve(p2); //Tiene preferencia el segundo path sobre el primero
        Path p4 = p1.normalize();// elimina path redundante.
        Path p5 = p1.relativize(p2); //Construye un solo path final a partir de otro.
    }
    
}
