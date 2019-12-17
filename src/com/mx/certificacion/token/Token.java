/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.token;

/**
 *
 * @author Supaada-q214
 */
public class Token {
 
    public static void main(String[] args) {
        String llave ="9A2DF55C5FF903";
        String usuario ="1001000101011111110010011111010011010001010101100101110001010111";
        
        Token token = new Token();
        //System.out.println("Token"+ " " + token.desencripta(usuario, llave));
        
        
        
        System.out.println(""+token.encripta("CESAR1981", llave));
        
    }
    
     public String desencripta(String s, String s1)
    {
        String s2 = "";
        int ai[] = new int[64];
        int ai3[] = new int[64];
        int ai5[][] = new int[17][48];
        int ai6[][] = new int[17][32];
        int ai7[][] = new int[17][32];
        int ai2[] = DesCajas.stringToHex(s1);
        int i = 0;
        for(int j = 0; j < 64; j++){
            if((j + 1) % 8 != 0)
            {
                if(ai2[i] == -1)
                {
                   return s2;
                }
                ai3[j] = ai2[i++];
            } else
            {
                ai3[j] = 0;
            }
        }

        int ai4[][] = DesCajas.genKey(ai3);
        int k = ai4.length;
        for(int l = 0; l < ai4.length; l++){
            ai5[--k] = ai4[l];
        }

        int ai1[] = DesCajas.cipherToBin(s);
        ai1 = DesCajas.initialPermutation(ai1);
        for(int i1 = 0; i1 < 64; i1++){
            if(i1 < 32){
                ai6[0][i1] = ai1[i1];
            }else{
                ai7[0][i1 - 32] = ai1[i1];
            }
        }

        for(int j1 = 0; j1 < 16; j1++)
        {
            ai7[j1 + 1] = DesCajas.xor32(DesCajas.func(ai7[j1], ai5[j1]), ai6[j1]);
            ai6[j1 + 1] = ai7[j1];
        }

        for(int k1 = 0; k1 < 64; k1++){
            if(k1 < 32){
                ai[k1] = ai7[16][k1];
            }else{
                ai[k1] = ai6[16][k1 - 32];
            }
        }

        ai1 = DesCajas.inverseInitialPermutation(ai);
        s2 = DesCajas.binToString(ai1);
        return s2;
    }
    
     public String encripta(String s, String s1)
    {
        int ai2[] = new int[64];
        int ai4[][] = new int[17][48];
        int ai5[][] = new int[17][32];
        int ai6[][] = new int[17][32];
        int ai7[] = DesCajas.stringToBin(s);
        int ai1[] = DesCajas.stringToHex(s1);
        int i = 0;
        for(int j = 0; j < 64; j++){
            if((j + 1) % 8 != 0)
            {
                if(ai1[i] == -1)
                {
                   
                    return "";
                }
                ai2[j] = ai1[i++];
            } else
            {
                ai2[j] = 0;
            }
        }

        int ai3[][] = DesCajas.genKey(ai2);
        int k = ai3.length;
        for(int l = 0; l < ai3.length; l++){
            ai4[--k] = ai3[l];
        }

        ai7 = DesCajas.initialPermutation(ai7);
        for(int i1 = 0; i1 < 64; i1++){
            if(i1 < 32){
                ai5[0][i1] = ai7[i1];
            }else{
                ai6[0][i1 - 32] = ai7[i1];
            }
        }
        for(int j1 = 0; j1 < 16; j1++)
        {
            ai6[j1 + 1] = DesCajas.xor32(DesCajas.func(ai6[j1], ai3[j1 + 1]), ai5[j1]);
            ai5[j1 + 1] = ai6[j1];
        }

        for(int k1 = 0; k1 < 64; k1++){
            if(k1 < 32){
                ai7[k1] = ai6[16][k1];
            }else{
                ai7[k1] = ai5[16][k1 - 32];
            }
        }

        int ai[] = DesCajas.inverseInitialPermutation(ai7);
        return printArray(ai);
    }
     
     public String printArray(int ai[])
    {
    	StringBuilder s = new StringBuilder();
        for(int i = 0; i < ai.length; i++){
            s.append(ai[i]);
        }
        return s.toString();
    }
    
}
