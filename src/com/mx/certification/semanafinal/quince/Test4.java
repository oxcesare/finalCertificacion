/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certification.semanafinal.quince;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Supaada-q214
 */
public class Test4 {

    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2016, Month.FEBRUARY, 29);
        ld = ld.withYear(2020);
        System.out.println(ld);
    }
}
