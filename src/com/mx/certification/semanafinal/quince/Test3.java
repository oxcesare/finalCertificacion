/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certification.semanafinal.quince;

import java.util.*;
import java.util.stream.*;


/**
 *
 * @author Supaada-q214
 * 
 * Tipos Incompatibles,
 * 
 * Aqui se tiene que revisar correctamente que tipo de operacion es la que estamos
 * realizando y donde es que la queremos almacenar. 
 * 
 * Donde se encuentra el filtro esta mal  ya que regresa un OptionalInt 
 * y no se puede almacenar dentro de un Optional 
 */
public class Test3 {
    
    
    public static void main(String[] args) {
        IntStream st = IntStream.of(5,7,8,9,1,3);
        Optional  op = st.filter(x -> x<0).findFirst();
    }
    
}
