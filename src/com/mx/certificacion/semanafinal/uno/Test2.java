/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semanafinal.uno;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

/**
 *
 * @author Supaada-q214
 * 
 * Periodo imprime con el formato -1D
 * 
 * y Duration imprime con el formato PT8H910M
 * 
 * Perido calcula: años,meses y dias 
 * 
 * Mientras que duration calcula, hora, minutos y segundos
 */
public class Test2 {

    public static void main(String[] args) {
        Period p = Period.between(LocalDate.now(), LocalDate.of(2015, Month.SEPTEMBER, 1));
        System.out.println(p);
        Duration d = Duration.between(LocalDateTime.now(), LocalDateTime.of(2015, Month.SEPTEMBER, 2, 10, 10));
        System.out.println(d);
    }
}
