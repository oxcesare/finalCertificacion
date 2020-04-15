/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certification.semanafinal.diecisies;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 *
 * @author Supaada-q214
 */
public class ExampleOfRelative {

    public static void main(String[] args) throws IOException {
        Path p1 = Paths.get("photos/goa");
        Path p2 = Paths.get("/index.html");
        Path p3 = p1.relativize(p2);
        System.out.println(p3);
        
        Stream<Path> lines = Files.list(p3);
        
        BufferedReader bfr = new BufferedReader(new FileReader("test.txt"));
        System.out.println(bfr.readLine());
        
    }
}
