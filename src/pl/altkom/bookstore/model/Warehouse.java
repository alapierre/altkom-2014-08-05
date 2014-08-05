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
    
    private Product product;
    
    //Adress object
    private int numberWarehouse;
    private double number;

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
