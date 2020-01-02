/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacionfinal.trece;


import java.time.*;

/**
 *
 * @author Supaada-q214
 */
public class TestPeriod {
    
    public static void main(String[] args) {
        Period p = Period.ofDays(12).multipliedBy(3);
        System.out.println(p.negated());
    }
    
}
