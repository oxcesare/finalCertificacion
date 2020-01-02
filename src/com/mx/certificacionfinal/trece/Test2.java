/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacionfinal.trece;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Supaada-q214
 */
public class Test2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2015, 10, 10);
        date = date.withMonth(1);
        System.out.println(date);
    }
}
