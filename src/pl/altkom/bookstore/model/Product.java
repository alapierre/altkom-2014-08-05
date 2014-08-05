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
public class Product {
    
    /**
     * Product unique ID
     */
    private int productId;
    
    /**
     * Name of product
     */
    private String productName;
    
    /**
     * Product price
     */
    private double productPrice;
    
    /**
     * Discount number
     */
    private double discount;
    
    /**
     * How many of this product are available
     */
    private int productCount;
    
    /**
     * Name of the manufacturer
     */
    private String productManufacturer;
    
    /**
     * Vat value 
     */
    private double productVat;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public String getProductManufacturer() {
        return productManufacturer;
    }

    public void setProductManufacturer(String productManufacturer) {
        this.productManufacturer = productManufacturer;
    }

    public double getProductVat() {
        return productVat;
    }

    public void setProductVat(double productVat) {
        this.productVat = productVat;
    }
}
