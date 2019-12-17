/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semanafinal.uno.reglas.threads;

/**
 *
 * @author Supaada-q214
 * 
 * 
 */
public class ReglasThreads {
    
    public static void main(String[] args) {
        reglaUno();
        System.out.println("**********************");
        reglaDos();
    }
    
    public static void reglaUno(){
        System.out.println("Se puede crear el numero de threads (hilos)"
                + "de acuerdo a las necesidades requeridas");
        
        System.out.println("Hay dos formas de crear hilos, thread y Runnable");
    }
    
    public static void reglaDos(){
        System.out.println("A synchronized method "
                + "cannot be executed simultaneously by more than one thread on the same object.");
    }
    
    public static void reglaTres (){
        System.out.println("Which of the following"
                + " statements are correct regarding synchronization and locks?");
        System.out.println("******");
        System.out.println("A thread exclusively owns the intrinsic lock between the time it has acquired the lock and released the lock.");
        System.out.println("A thread can acquire a lock on the class.");
        
        
    }
    
    
    
}
