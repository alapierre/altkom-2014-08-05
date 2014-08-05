/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.bookstore.model;

/**
 *
 * @author Piotr Wajcowicz
 */
public class Order {
    
    private int orderId;
    //obiekt kontrahenta
    private enum orderStatus { REALIZACJA, GOTOWE, PLATNOSC, WYSLANE, ZAKONCZONE };
    //obiekt zamowionych produktów
    private String deliveryAddress;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
    
    
            
}
