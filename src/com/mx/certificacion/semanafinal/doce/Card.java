/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semanafinal.doce;

/**
 *
 * @author Supaada-q214
 */
public enum Card {

    HEART, CLUB, SPADE, DIAMOND;

}

class testEnum {
    
    public static void main(String[] args) {
        for(Card c : Card.values()) System.out.print(c+" ");
    }

}
