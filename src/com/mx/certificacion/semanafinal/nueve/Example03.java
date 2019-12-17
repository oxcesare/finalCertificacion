/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semanafinal.nueve;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;


/**
 *
 * @author Supaada-q214
 */
public class Example03 {
    
     public static void main(String[] args) throws IOException {
        // declare a list that will contain all of the files
	// inside of the readme.txt file
	List<String> lines = Collections.emptyList();
	// provoke an exception
	lines = Files.readAllLines(Paths.get("readme.txt"));
	// you will never see this print
	Iterator<String> iterator = lines.iterator();
	while (iterator.hasNext())
	    System.out.println(iterator.next());
    }
    
}
