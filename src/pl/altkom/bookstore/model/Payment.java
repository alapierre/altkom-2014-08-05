/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package pl.altkom.bookstore.model;

import java.util.Date;

/**
 *
 * @author Daniel Marczydło <your.name at your.org>
 */
public class Payment {
    /**
     * Data platnosci jako Date
     */
    private Date paymentDate;
    /**
     * Termin platnosci jako Date
     */
    private Date paymentTerm;
    /**
     * Status platnosci jesli false - platnosc nie zostala zrealizowana
     */
    private boolean status;
    /**
     * Kwota platnosci 
     */
    private double price;
    /**
     * Zaleglosc, gdy pelna kwota nie zostala zrealizowana
     */
    private double arrearage;
   /**
    * Obiekt faktury do ktorej odnosi sie platnosc
    */
    private Invoice invoice;

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public void setPaymentTerm(Date paymentTerm) {
        this.paymentTerm = paymentTerm;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setArrearage(double arrearage) {
        this.arrearage = arrearage;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public Date getPaymentTerm() {
        return paymentTerm;
    }

    public boolean isStatus() {
        return status;
    }

    public double getPrice() {
        return price;
    }

    public double getArrearage() {
        return arrearage;
    }
    
}
