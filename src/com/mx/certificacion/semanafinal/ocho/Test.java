/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semanafinal.ocho;

/**
 *
 * @author Supaada-q214
 */
public class Test {

    public static void main(String[] args) {

        String palabra = "apple";
        String[] vocales = {"a", "e", "i", "o", "u",};
        int e = 0;

        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            String d = String.valueOf(c);

            if (d.equals(vocales[0]) || d.equals(vocales[1]) || d.equals(vocales[2])
                    || d.equals(vocales[3]) || d.equals(vocales[4])) {
                e++;
            }
        }

        if (e > 1) {
            System.out.println("Tiene mas de una vocal");

            for (int i = 0; i < palabra.length() - 1; i++) {
                char c = palabra.charAt(i);
                String d = String.valueOf(c);
                System.out.println("NO adelantado"+" " + d);

                char q = palabra.charAt(i + 1);
                String a = String.valueOf(q);
                System.out.println("Adelantado"+" " + a);

                boolean esVocal = isVocal(d);

                if (esVocal) {
                    if (d.equals(a)) {
                        System.out.println("Es la misma vocal");
                    } else {
                        System.out.println("No son la misma vocal, Intercambiar");
                    }
                }else{
                    
                }
            }

        } else {
            System.out.println("No aplica porque tiene menos de una vocal o cero vocales");
        }
    }

    public static boolean isVocal(String d) {

        String[] vocales = {"a", "e", "i", "o", "u",};

        if (d.equals(vocales[0]) || d.equals(vocales[1]) || d.equals(vocales[2])
                || d.equals(vocales[3]) || d.equals(vocales[4])) {
            return true;
        } else {
            return false;
        }

    }

}
