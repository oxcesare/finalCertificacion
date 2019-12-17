/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semanafinal.nueve;

import java.util.*;

/**
 *
 * @author Supaada-q214
 */
public class Example14 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("No");
        list.add("matter");
        list.add("what");
        list.add("you");
        list.add("do");
        System.out.println(list);
        list.subList(2, 4).clear();
        System.out.println(list);
    }
}
