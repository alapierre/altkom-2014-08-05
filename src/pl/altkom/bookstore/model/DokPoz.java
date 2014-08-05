/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.bookstore.model;

/**
 *
 * @author rmi
 */
public class DokPoz {
    
    //Towar - Index (nazwa, opis, jednostka, stawka VAT)
    private Product productName;
    private String adnotacje;
    private double iloscZam;
    //Towar - jednostka
    private Product productUnit;
    private double cenaNetto;
    private double cenaBrutto;
    //Towar - stawka VAT
    private Product productVat;
    private double wartoscVAT;
    private double rabat;
    private String dataDostawy;
    
    
    public void setDokPoz (Product productName, String adnotacje, double iloscZam,
                            Product productUnit, double cenaNetto, double cenaBrutto, 
                            Product productVat, double wartoscVAT, double rabat, String dataDostawy) {
        
        this.productName = productName;
        this.adnotacje = adnotacje;
        this.iloscZam = iloscZam;
        this.productUnit = productUnit;
        this.cenaNetto = cenaNetto;
        this.cenaBrutto = cenaBrutto;
        this.productVat = productVat;
        this.wartoscVAT = wartoscVAT;
        this.rabat = rabat;
        this.dataDostawy = dataDostawy;
    }

    @Override
    public String toString() {
        return "DokPoz{" + "productName=" + productName + ", adnotacje=" + adnotacje + ", iloscZam=" + iloscZam + ", productUnit=" + productUnit + ", cenaNetto=" + cenaNetto + ", cenaBrutto=" + cenaBrutto + ", productVat=" + productVat + ", wartoscVAT=" + wartoscVAT + ", rabat=" + rabat + ", dataDostawy=" + dataDostawy + '}';
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

    public String getDataDostawy() {
        return dataDostawy;
    }


    
}


