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
    public Product productName;
    
    private String adnotacje;
    private double iloscZam;
    //Towar - jednostka
    public Product productUnit;
    private double cenaNetto;
    private double cenaBrutto;
    //Towar - stawka VAT
    public Product productVat;
    
    private double wartoscVAT;
    private double rabat;
    private String dataDostawy;
    
    
    public void setDokPoz(String adnotacje, double iloscZam, double cenaNetto, double cenaBrutto, double wartoscVAT, double rabat, String dataDostawy) {
        this.adnotacje = adnotacje;
        this.iloscZam = iloscZam;
        this.cenaNetto = cenaNetto;
        this.cenaBrutto = cenaBrutto;
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


