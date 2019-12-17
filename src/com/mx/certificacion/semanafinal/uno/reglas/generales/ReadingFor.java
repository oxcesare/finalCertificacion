/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semanafinal.uno.reglas.generales;

import java.io.*;

/**
 *
 * @author Supaada-q214
 */
public class ReadingFor {

    public static void main(String[] args) {
        String s;

        try {
            FileReader file = new FileReader("archivo.txt");
            BufferedReader bf = new BufferedReader(file);
            while ((s = bf.readLine()) != null) {
                System.out.println(s);
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
