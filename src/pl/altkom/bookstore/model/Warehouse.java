/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.bookstore.model;

/**
 *
 * @author Daniel Marczydło <your.name at your.org>
 */
public class Warehouse {

    /**
     * Obiekt produktu na stanie magazynowym
     */
    private Product product;
    /**
     * Numer magazynu na ktorym znajduje sie dany produkt (umozliwia posiadanie
     * wielu magazynow)
     */
    private int numberWarehouse;
    /**
     * Ilosc dostepnego towaru
     */
    private double number;
    /**
     * Ewentualna osoba kontaktowa dla magazynu (Pan Mgr)
     */
    private Kontakt contactPerson;

    public void setNumberWarehouse(int numberWarehouse) {
        this.numberWarehouse = numberWarehouse;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public int getNumberWarehouse() {
        return numberWarehouse;
    }

    public double getNumber() {
        return number;
    }

}
