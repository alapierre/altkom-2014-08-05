/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.bookstore.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Piotr Wajcowicz
 */
public class Order {

    /**
     * An order status
     */
    public enum OrderStatus {

        REALIZACJA, GOTOWE, PLATNOSC, WYSLANE, ZAKONCZONE
    };

    /**
     * Order number
     */
    private int orderId;
    //obiekt kontrahenta

    private OrderStatus status;

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addProduct(Product product, int volume) {

    }

    /**
     * List of ordered products
     */
    private List<DocItem> orderedProducts = new ArrayList<>();

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
