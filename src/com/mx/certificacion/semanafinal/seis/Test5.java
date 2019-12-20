/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semanafinal.seis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Supaada-q214
 */
public class Test5  implements Comparable<Object>{

    String isbn;
    String title;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    
    
    public Test5(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public int compareTo(Test5 b) {
        return this.isbn.compareTo(b.isbn);
    }

    public static List<Test5> getBooksByAuthor(String x) {

        List<Test5> list = new ArrayList<>();

        return list;

    }

    public static void main(String[] args) {
        List<Test5> books = getBooksByAuthor("Ludlum");
        Collections.sort(books, (b1, b2) -> b1.getTitle().compareTo(b2.getTitle())); //1 
        Collections.sort(books); //Los elementos de Collections deben de implementar comparable y su metodo 
                                 //compareTo
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
