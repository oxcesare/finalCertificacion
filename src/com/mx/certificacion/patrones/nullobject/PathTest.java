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
 */
public class PathTest {

    static Path p1 = Paths.get("c:\\main\\project\\Starter.java");

    public static String getRoot() {
        String root = p1.getRoot().toString();
        return root;
    }

    public static void main(String[] args) {
        System.out.println(getRoot());
    }
}
