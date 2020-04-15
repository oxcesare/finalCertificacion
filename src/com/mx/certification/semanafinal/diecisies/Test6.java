/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certification.semanafinal.diecisies;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Supaada-q214
 */
public class Test6 {
    
    public static void main(String[] args) {
            Path p1 = Paths.get("c:\\..\\temp\\test.txt");    
            System.out.println(p1.normalize().toUri());
    }
}
