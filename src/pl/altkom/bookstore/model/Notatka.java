/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.bookstore.model;

import java.util.Date;

/**
 *
 * @author Marcin Kępa <your.name at your.org>
 */
public class Notatka {
   /* notatka z kontaktu z klientem
    *
    * tytuł
    * data notatki
    * treść
    * kto sporządził
    */
    public String tytul;
    
    public Date data;
    
    public String trescNotatki;
    
    public String autorNotatki;

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTrescNotatki() {
        return trescNotatki;
    }

    public void setTrescNotatki(String trescNotatki) {
        this.trescNotatki = trescNotatki;
    }

    public String getAutorNotatki() {
        return autorNotatki;
    }

    public void setAutorNotatki(String autorNotatki) {
        this.autorNotatki = autorNotatki;
    }
    
    
    
}
