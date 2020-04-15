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
public class PathTest {

    static Path p1 = Paths.get("c:\\a\\b\\c");

    public static String getValue() {
        String x = p1.getName(1).toString();
        String y = p1.subpath(1, 2).toString();
        return x + " : " + y;
    }

    public static void main(String[] args) {
        System.out.println(getValue());
    }
}
