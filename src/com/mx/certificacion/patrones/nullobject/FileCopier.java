/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.patrones.nullobject;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author Supaada-q214
 */
public class FileCopier {

    public static void copy1(Path p1, Path p2) throws Exception {
        Files.copy(p1, p2, StandardCopyOption.COPY_ATTRIBUTES, StandardCopyOption.REPLACE_EXISTING);
    }

    public static void main(String[] args) throws Exception {
        Path p1 = Paths.get("c:\\temp\\test1.txt");
        Path p2 = Paths.get("c:\\temp\\test2.txt");
        
        if(Files.isSameFile(p1, p2)){
            
        }
        
    }
}
