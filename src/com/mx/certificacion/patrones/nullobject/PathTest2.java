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
public class PathTest2 {

    static Path p1 = Paths.get("c:\\finance\\data\\reports\\daily\\pnl.txt");

    public static void main(String[] args) {
        System.out.println(p1.subpath(0, 2));
    }

}
