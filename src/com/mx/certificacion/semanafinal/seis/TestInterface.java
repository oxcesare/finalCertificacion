/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semanafinal.seis;

import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author Supaada-q214
 * 
 * Los metodos sobreescitos no pueden lanzar 
 * SQLException, 
 */
public class TestInterface implements I1,I2{

    @Override
    public void m1() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
