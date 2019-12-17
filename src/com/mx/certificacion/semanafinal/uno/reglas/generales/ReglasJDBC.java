/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semanafinal.uno.reglas.generales;

/**
 *
 * @author Supaada-q214
 * 
 * Clases para reglas JBDBC
 */
public class ReglasJDBC {
    
    
    public static void main(String[] args) {
        reglasJDBCUno();
    }
    
    public static void reglasJDBCUno(){
        
        System.out.println("You want to use a third party JDBC driver for a database. Which of the following "
                + "actions must you take to retrieve a Connection using that driver in your JDBC program?");
        
        System.out.println("Put the driver jar in the class path.");
        
        System.out.println("Retrieve a connection using DriverManager.getConnection.");
        
    }
    
    public static void reglaJDBCDos(){
        System.out.println("Starting JDBC 4.0, "
                + "the JDBC Driver class is not required to be loaded explicitly in the code any more.");
    }
    
    
    public static void reglaJDBCTres(){
        
        System.out.println("Given that a code fragment has just created a JDBC Connection and has executed an "
                + "update statement, which of the following statements is correct?");
        
        
        
        System.out.println("Changes to the database will be committed right after "
                + "the update statement has completed execution.");
        
        
        System.out.println("A Connection is always in auto-commit mode when it is created. "
                + " As per the problem statement, an update was fired without explicitly disabling the auto-commit mode, "
                + "the changes will be "
                + "committed right after the update statement has finished execution.");
        
        
        
        
    }
    
}
