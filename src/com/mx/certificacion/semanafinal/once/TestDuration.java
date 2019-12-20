/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semanafinal.once;

import java.time.Duration;
import java.time.Period;

/**
 *
 * @author Supaada-q214
 */
public class TestDuration {

    public static void main(String[] args) {
        Duration d = Duration.ofHours(25);
        System.out.println(d);
        Period p = Period.ofDays(1);
        System.out.println(p);
    }
}
