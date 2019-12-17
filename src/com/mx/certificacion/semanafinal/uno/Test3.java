/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semanafinal.uno;

/**
 *
 * @author Supaada-q214
 */
public class Test3 {
    public static void main(String[] args) {
        
        System.out.println("java.time contiene las clases ");
        
        System.out.println("or date, time, date and time combined, time zones, "
                + "         instants, duration, and clocks are immutable and thread-safe");
        
        
        
        
        System.out.println("An instance of java.time.Instant represents time elapsed since Java epoch.");
        
        System.out.println("Duration does not convert hours into days. i.e. 25 hours "
                + "will remain as 25 hours instead of 1 day and 1 hour.");
        
        
        System.out.println("Para conocer la diferencia entre horas");
        /* NO existe diferencia ya que localDate siempre suma una hora al ZoneDateTime*/
        System.out.println("long x = ChronoUnit.HOURS.between(zd1, zd2);");
    }
}
