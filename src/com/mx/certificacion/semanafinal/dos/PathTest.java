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
public class PathTest {

    public static void main(String[] args) {
        Path p1 = Paths.get("c:\\code\\java\\PathTest.java");
        System.out.println(p1.getName(3).toString());
    }

}
