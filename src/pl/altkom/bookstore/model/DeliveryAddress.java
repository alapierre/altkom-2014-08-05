/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.bookstore.model;

/**
 *
 * @author Administrator
 */
public class DeliveryAddress {
    private String address;
    private String deliveryPerson;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDeliveryPerson() {
        return deliveryPerson;
    }

    public void setDeliveryPerson(String deliveryPerson) {
        this.deliveryPerson = deliveryPerson;
    }
}
