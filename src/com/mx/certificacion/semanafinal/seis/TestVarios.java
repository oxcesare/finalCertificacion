/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semanafinal.seis;

/**
 *
 * @author Supaada-q214
 *
 * Regla 1 : no se pueden sobrescribir metodos abstractos
 */
class Bowler implements Player<Guitar> {

    public void play(Guitar o) {
    }
}

class Game {
}

class Cricket extends Game {
}

class Instrument {
}

class Guitar extends Instrument {
}

interface Player<E> {

    void play(E e);
}

interface GamePlayer<E extends Game> extends Player<E> {
}

interface MusicPlayer<E extends Instrument> extends Player {
}

public class TestVarios {

    public static void main(String[] args) {

    }

}
