/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semanafinal.cuatro;

import java.time.LocalDate;
import java.util.Optional;

/**
 *
 * @author Supaada-q214
 */
public class Test2 {

    public static void main(String[] args) {
        Test test = new Test();
        test.setM("M");
        test.setN("N");
        test.setO(0);
        
        Test test2 = null;
        
        boolean res = validateNull(test, test);
        
        System.out.println("Resultado Aplicando Optional" + " " + res);
        
        
        LocalDate date1 = LocalDate.of(2015, 12, 27);
        date1.lengthOfMonth();
        
        
    }
    
    
    public static <T> Boolean validateNull(Object T, Object toValue) {

        boolean loValidateNull;

        Optional<T> loObjectValidate = (Optional<T>) Optional.ofNullable(toValue);

        if (loObjectValidate.isPresent()) {
            loValidateNull = true;
        } else {
            loValidateNull = false;
        }

        return loValidateNull;

    }
}
