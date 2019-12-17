/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.token;


import java.text.DecimalFormat;
import java.text.NumberFormat;


/**
 *
 * @author Supaada-q214
 */
public class DesCajas {

    private static final String FORMATO_OCHO_DIGITOS = "00000000";

    private static final String FORMATO_CUATRO_DIGITOS = "0000";

    private static final NumberFormat OCHO_DIGITOS = new DecimalFormat(
            FORMATO_OCHO_DIGITOS);

    private static final NumberFormat CUATRO_DIGITOS = new DecimalFormat(
            FORMATO_CUATRO_DIGITOS);

    private static final int[] ARREGLO_PERMUTACION;

    static {
        ARREGLO_PERMUTACION = new int[]{58, 50, 42, 34, 26, 18, 10, 2, 60,
            52, 44, 36, 28, 20, 12, 4, 62, 54, 46, 38, 30, 22, 14, 6, 64,
            56, 48, 40, 32, 24, 16, 8, 57, 49, 41, 33, 25, 17, 9, 1, 59,
            51, 43, 35, 27, 19, 11, 3, 61, 53, 45, 37, 29, 21, 13, 5, 63,
            55, 47, 39, 31, 23, 15, 7};
    }

    private DesCajas() {
        super();
    }

    public static String fromBinary(int ai[], int pos) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            builder.append(String.valueOf(ai[i + 8 * pos]));
        }
        char part = (char) Integer.parseInt(builder.toString(), 2);
        return String.valueOf(part);
    }

    public static String binToString(int ai[]) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            builder.append(fromBinary(ai, i));
        }
        return builder.toString();
    }

    public static int[][] genKey(int ai[]) {
        int ai1[] = {57, 49, 41, 33, 25, 17, 9, 1, 58, 50, 42, 34, 26, 18, 10,
            2, 59, 51, 43, 35, 27, 19, 11, 3, 60, 52, 44, 36, 63, 55, 47,
            39, 31, 23, 15, 7, 62, 54, 46, 38, 30, 22, 14, 6, 61, 53, 45,
            37, 29, 21, 13, 5, 28, 20, 12, 4};
        int ai2[] = {1, 1, 2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 1};
        int ai3[] = {14, 17, 11, 24, 1, 5, 3, 28, 15, 6, 21, 10, 23, 19, 12,
            4, 26, 8, 16, 7, 27, 20, 13, 2, 41, 52, 31, 37, 47, 55, 30, 40,
            51, 45, 33, 48, 44, 49, 39, 56, 34, 53, 46, 42, 50, 36, 29, 32};
        int ai4[] = new int[56];
        int ai5[][] = new int[17][28];
        int ai6[][] = new int[17][28];
        int ai7[][] = new int[17][48];
        for (int i = 0; i < 56; i++) {
            ai4[i] = ai[ai1[i] - 1];
        }

        for (int j = 0; j < 48; j++) {
            ai7[0][j] = ai4[ai3[j] - 1];
        }

        for (int k = 0; k < 56; k++) {
            if (k < 28) {
                ai5[0][k] = ai4[k];
            } else {
                ai6[0][k - 28] = ai4[k];
            }
        }

        for (int l = 1; l < 17; l++) {
            ai5[l] = leftShift(ai5[l - 1], ai2[l - 1]);
            ai6[l] = leftShift(ai6[l - 1], ai2[l - 1]);
            for (int i1 = 0; i1 < 56; i1++) {
                if (i1 < 28) {
                    ai4[i1] = ai5[l][i1];
                } else {
                    ai4[i1] = ai6[l][i1 - 28];
                }
            }
            for (int j1 = 0; j1 < 48; j1++) {
                ai7[l][j1] = ai4[ai3[j1] - 1];
            }

        }

        return ai7;
    }

    public static int[] initialPermutation(int ai[]) {
        int ai1[] = new int[64];
        int ai2[] = ARREGLO_PERMUTACION;
        for (int i = 0; i < 64; i++) {
            ai1[i] = ai[ai2[i] - 1];
        }

        return ai1;
    }

    public static int[] inverseInitialPermutation(int ai[]) {
        int ai1[] = new int[64];
        int ai2[] = ARREGLO_PERMUTACION;
        for (int i = 0; i < 64; i++) {
            ai1[ai2[i] - 1] = ai[i];
        }

        return ai1;
    }

    public static int[] cipherToBin(String s) {
        int ai[] = new int[64];
        for (int i = 0; i < 64; i++) {
            ai[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }

        return ai;
    }

    public static int[] stringToBin(String s) {
        char chars[] = s.toCharArray();
        int ai[] = new int[8 * chars.length];
        for (int i = 0; i < chars.length; i++) {
            String binarie = toBinarie(chars[i]);
            int val = chars[i];
            if (val <= 32 && val >= 122) {
                binarie = "11111111";
            }
            toArrayBinary(ai, i, binarie);
        }
        return ai;
    }

    private static String toBinarie(char c) {
        String binary = Integer.toBinaryString(c);
        int repBin = Integer.parseInt(binary);
        return OCHO_DIGITOS.format(repBin);
    }

    private static void toArrayBinary(int[] ai, int pos, String binarie) {
        char bins[] = binarie.toCharArray();
        for (int i = 0; i < bins.length; i++) {
            ai[i + 8 * pos] = Integer.parseInt(String.valueOf(bins[i]));
        }
    }

    public static int[] stringToHex(String s) {
        String upperS = s.toUpperCase();
        char[] chars = upperS.toCharArray();
        int[] ai = new int[4 * chars.length];
        for (int i = 0; i < chars.length; i++) {
            int hex = Integer.parseInt(String.valueOf(chars[i]), 16);
            if (hex >= 0 && hex <= 15) {
                String bin = toHexadecimal(hex);
                toArrayHexBin(ai, i, bin);
            } else {
                defaultArrayHexBin(ai, i);
            }
        }
        return ai;
    }

    private static String toHexadecimal(int hex) {
        String binary = Integer.toBinaryString(hex);
        int repBin = Integer.parseInt(binary);
        return CUATRO_DIGITOS.format(repBin);
    }

    private static void toArrayHexBin(int[] ai, int pos, String binarie) {
        char bins[] = binarie.toCharArray();
        for (int i = 0; i < bins.length; i++) {
            ai[i + 4 * pos] = Integer.parseInt(String.valueOf(bins[i]));
        }
    }

    private static void defaultArrayHexBin(int[] ai, int pos) {
        for (int i = 0; i < 4; i++) {
            ai[i + 4 * pos] = -1;
        }
    }

    public static int[] func(int ai[], int ai1[]) {
        int ai2[] = new int[48];
        int ai3[] = {32, 1, 2, 3, 4, 5, 4, 5, 6, 7, 8, 9, 8, 9, 10, 11, 12,
            13, 12, 13, 14, 15, 16, 17, 16, 17, 18, 19, 20, 21, 20, 21, 22,
            23, 24, 25, 24, 25, 26, 27, 28, 29, 28, 29, 30, 31, 32, 1};
        int ai4[] = {16, 7, 20, 21, 29, 12, 28, 17, 1, 15, 23, 26, 5, 18, 31,
            10, 2, 8, 24, 14, 32, 27, 3, 9, 19, 13, 30, 6, 22, 11, 4, 25};
        int ai5[][] = new int[8][6];
        int ai7[] = new int[32];
        int ai8[] = new int[32];
        for (int i = 0; i < 48; i++) {
            ai2[i] = ai[ai3[i] - 1];
        }

        for (int j = 0; j < 8; j++) {
            for (int k = 0; k < 6; k++) {
                ai5[j][k] = xor1(ai2[j * 6 + k], ai1[j * 6 + k]);
            }

        }

        int ai6[][] = sbox(ai5);
        for (int l = 0; l < 8; l++) {
            for (int i1 = 0; i1 < 4; i1++) {
                ai7[l * 4 + i1] = ai6[l][i1];
            }
        }

        for (int j1 = 0; j1 < 32; j1++) {
            ai8[j1] = ai7[ai4[j1] - 1];
        }

        return ai8;
    }

    public static int[] leftShift(int ai[], int i) {
        int ai1[] = new int[28];
        for (int j = ai.length - 1; j >= 0; j--) {
            if (j - i >= 0) {
                ai1[j - i] = ai[j];
            }
        }

        int k = 0;
        for (int l = ai.length - 1; l >= ai.length - i; l--) {
            ai1[l] = ai[k++];
        }

        return ai1;
    }

    public static int[][] sbox(int ai[][]) {
        int ai1[][] = new int[8][4];
        int ai2[][][] = {
            {
                {14, 4, 13, 1, 2, 15, 11, 8, 3, 10, 6, 12, 5, 9, 0, 7},
                {0, 15, 7, 4, 14, 2, 13, 1, 10, 6, 12, 11, 9, 5, 3, 8},
                {4, 1, 14, 8, 13, 6, 2, 11, 15, 12, 9, 7, 3, 10, 5, 0},
                {15, 12, 8, 2, 4, 9, 1, 7, 5, 11, 3, 14, 10, 0, 6, 13}},
            {
                {15, 1, 8, 14, 6, 11, 3, 4, 9, 7, 2, 13, 12, 0, 5, 10},
                {3, 13, 4, 7, 15, 2, 8, 14, 12, 0, 1, 10, 6, 9, 11, 5},
                {0, 14, 7, 11, 10, 4, 13, 1, 5, 8, 12, 6, 9, 3, 2, 15},
                {13, 8, 10, 1, 3, 15, 4, 2, 11, 6, 7, 12, 0, 5, 14, 9}},
            {
                {10, 0, 9, 14, 6, 3, 15, 5, 1, 13, 12, 7, 11, 4, 2, 8},
                {13, 7, 0, 9, 3, 4, 6, 10, 2, 8, 5, 14, 12, 11, 15, 1},
                {13, 6, 4, 9, 8, 15, 3, 0, 11, 1, 2, 12, 5, 10, 14, 7},
                {1, 10, 13, 0, 6, 9, 8, 7, 4, 15, 14, 3, 11, 5, 2, 12}},
            {
                {7, 13, 14, 3, 0, 6, 9, 10, 1, 2, 8, 5, 11, 12, 4, 15},
                {13, 8, 11, 5, 6, 15, 0, 3, 4, 7, 2, 12, 1, 10, 14, 9},
                {10, 6, 9, 0, 12, 11, 7, 13, 15, 1, 3, 14, 5, 2, 8, 4},
                {3, 15, 0, 6, 10, 1, 13, 8, 9, 4, 5, 11, 12, 7, 2, 14}},
            {
                {2, 12, 4, 1, 7, 10, 11, 6, 8, 5, 3, 15, 13, 0, 14, 9},
                {14, 11, 2, 12, 4, 7, 13, 1, 5, 0, 15, 10, 3, 9, 8, 6},
                {4, 2, 1, 11, 10, 13, 7, 8, 15, 9, 12, 5, 6, 3, 0, 14},
                {11, 8, 12, 7, 1, 14, 2, 13, 6, 15, 0, 9, 10, 4, 5, 3}},
            {
                {12, 1, 10, 15, 9, 2, 6, 8, 0, 13, 3, 4, 14, 7, 5, 11},
                {10, 15, 4, 2, 7, 12, 9, 5, 6, 1, 13, 14, 0, 11, 3, 8},
                {9, 14, 15, 5, 2, 8, 12, 3, 7, 0, 4, 10, 1, 13, 11, 6},
                {4, 3, 2, 12, 9, 5, 15, 10, 11, 14, 1, 7, 6, 0, 8, 13}},
            {
                {4, 11, 2, 14, 15, 0, 8, 13, 3, 12, 9, 7, 5, 10, 6, 1},
                {13, 0, 11, 7, 4, 9, 1, 10, 14, 3, 5, 12, 2, 15, 8, 6},
                {1, 4, 11, 13, 12, 3, 7, 14, 10, 15, 6, 8, 0, 5, 9, 2},
                {6, 11, 13, 8, 1, 4, 10, 7, 9, 5, 0, 15, 14, 2, 3, 12}},
            {
                {13, 2, 8, 4, 6, 15, 11, 1, 10, 9, 3, 14, 5, 0, 12, 7},
                {1, 15, 13, 8, 10, 3, 7, 4, 12, 5, 6, 11, 0, 14, 9, 2},
                {7, 11, 4, 1, 9, 12, 14, 2, 0, 6, 10, 13, 15, 3, 5, 8},
                {2, 1, 14, 7, 4, 10, 8, 13, 15, 12, 9, 0, 3, 5, 6, 11}}};
        int ai3[] = new int[8];
        int ai4[] = new int[8];
        int ai5[] = new int[8];
        for (int i = 0; i < 8; i++) {

            String s3 = ai[i][0] + "" + ai[i][5];
            ai3[i] = Integer.parseInt(s3, 2);

            String s4 = ai[i][1] + "" + ai[i][2] + "" + ai[i][3] + ""
                    + ai[i][4];
            ai4[i] = Integer.parseInt(s4, 2);

            ai5[i] = ai2[i][ai3[i]][ai4[i]];
        }

        for (int j = 0; j < 8; j++) {
            Integer valor = ai5[j];
            String binarie = Integer.toBinaryString(valor);
            valor = Integer.parseInt(binarie);
            binarie = CUATRO_DIGITOS.format(valor);
            for (int i = 0; i < 4; i++) {
                ai1[j][i] = Integer.valueOf(binarie.substring(i, i + 1));
            }
        }

        return ai1;
    }

    public static int xor1(int i, int j) {
        int k = 0;
        if (i != j) {
            k = 1;
        }
        return k;
    }

    public static int[] xor32(int ai[], int ai1[]) {
        int ai2[] = new int[32];
        for (int i = 0; i < 32; i++) {
            ai2[i] = xor1(ai[i], ai1[i]);
        }

        return ai2;
    }
}
