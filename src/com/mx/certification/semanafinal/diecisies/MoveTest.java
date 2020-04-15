/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certification.semanafinal.diecisies;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author Supaada-q214
 */
public class MoveTest {

    public static void main(String[] args) throws IOException {
        Path p1 = Paths.get("c:\\pathtest\\a.java");
        Path p2 = Paths.get("c:\\pathtest\\dir2\\a.java");
        Files.move(p1, p2, StandardCopyOption.ATOMIC_MOVE);
        Files.delete(p1);
        System.out.println(p1.toFile().exists() + " " + p2.toFile().exists());
    }
}
