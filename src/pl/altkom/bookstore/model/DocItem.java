/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.bookstore.model;

import java.util.Date;

/**
 *
 * @author rmi
 */
public class DocItem {
    
    //Towar - Index (nazwa, opis, jednostka, stawka VAT)
    private Product product;
    private String adnotacje;
    private double iloscZam;
    private double cenaNetto;
    private double cenaBrutto;
    private double wartoscVAT;
    private double rabat;
    private Date dataDostawy;

    public DocItem(Product product, String adnotacje, double iloscZam, double cenaNetto, double cenaBrutto, double wartoscVAT, double rabat, Date dataDostawy) {
        this.product = product;
        this.adnotacje = adnotacje;
        this.iloscZam = iloscZam;
        this.cenaNetto = cenaNetto;
        this.cenaBrutto = cenaBrutto;
        this.wartoscVAT = wartoscVAT;
        this.rabat = rabat;
        this.dataDostawy = dataDostawy;
    }

   
    public DocItem() {
    }
    
    public String getAdnotacje() {
        return adnotacje;
    
    }
    public double getIloscZam() {
        return iloscZam;
    }

    public double getCenaNetto() {
        return cenaNetto;
    }

    public double getCenaBrutto() {
        return cenaBrutto;
    }

    public double getWartoscVAT() {
        return wartoscVAT;
    }

    public double getRabat() {
        return rabat;
    }

    public Date getDataDostawy() {
        return dataDostawy;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "DocItem{" + "product=" + product + ", adnotacje=" + adnotacje + ", iloscZam=" + iloscZam + ", cenaNetto=" + cenaNetto + ", cenaBrutto=" + cenaBrutto + ", wartoscVAT=" + wartoscVAT + ", rabat=" + rabat + ", dataDostawy=" + dataDostawy + '}';
    }

    
    
}


