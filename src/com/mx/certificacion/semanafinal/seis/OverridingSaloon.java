/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semanafinal.seis;

/**
 *
 * @author Supaada-q214
 */
abstract class Saloon {

    protected int m1() {
        return 0;
    }
}

public class OverridingSaloon extends Saloon {

    int m1() {
        return 1;
    }
}
