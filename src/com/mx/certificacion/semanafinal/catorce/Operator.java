/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semanafinal.catorce;

/**
 *
 * @author Supaada-q214
 *
 * Podemos declarar dentro de un CASE una operacion o metodo
 *
 * y también se puede invocar otro método desde un CASE.
 */
enum Operator {
    ADD,
    SUBTRACT,
    MULTIPLY,
    DIVIDE;
}

class EnumWithoutDefinedFunctions {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        Operator operator = Operator.DIVIDE;
        int result = 0;
        switch (operator) {
            case ADD:
                result = num1 + num2;
                break;
            case SUBTRACT:
                result = num1 - num2;
                break;
            case MULTIPLY:
                result = num1 * num2;
                break;
            case DIVIDE:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Can't divide by zero.");
                }
                break;
        }
        System.out.println("result: " + result);
    }
}
