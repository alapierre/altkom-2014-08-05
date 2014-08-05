/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.bookstore.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Piotr Wajcowicz
 */
public class Invoice {
    /**
     * Invoice number
     */
    private int invoceId;
    
    /**
     * Invoice date
     */
    private Date invoiceDate;
    
    /**
     * Worker information
     */
    private Person worker;
    
    /**
     * Client information 
     */
    private Person client;
    
    /**
     * List of ordered products
     */
    private List<DocItem> orderedProducts = new ArrayList<>();
    
    public int getInvoceId() {
        return invoceId;
    }

    public void setInvoceId(int invoceId) {
        this.invoceId = invoceId;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }
}
