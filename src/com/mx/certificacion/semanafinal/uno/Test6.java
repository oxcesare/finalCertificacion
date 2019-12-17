/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semanafinal.uno;

import java.time.Duration;
import java.time.Period;

/**
 *
 * @author Supaada-q214
 * 
 * Duration counts in terms of hours, minutes, and seconds. 
 * Therefore, days are converted into hours. That is why the first println prints PT24H and not PT1D.

A Duration of 0 is printed as 0S and a Period of 0 is printed as 0D.
 */
public class Test6 {

    public static void main(String[] args) {
        Duration d = Duration.ofDays(1);
        System.out.println(d);
        d = Duration.ofMinutes(0);
        System.out.println(d);
        Period p = Period.ofMonths(0);
        System.out.println(p);
    }
}
