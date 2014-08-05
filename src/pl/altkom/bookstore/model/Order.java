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
    
    /**
     * Order number
     */
    private int orderId;
    //obiekt kontrahenta
    
    /**
     * An order status
     */
    private enum orderStatus { REALIZACJA, GOTOWE, PLATNOSC, WYSLANE, ZAKONCZONE };
    
    /**
     * List of ordered products
     */
    private Product[] orderedProducts;
    
    /**
     * Full delivery address
     */
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
