/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.bookstore.model;

/**
 * Describes Client
 * 
 * @author Radek Kozak
 */
public abstract class Client {
    
    private ClientType type;

    public ClientType getType() {
        return type;
    }

    public void setType(ClientType type) {
        this.type = type;
    }
    
    /**
     * 
     * All info required for generating invoice
     * 
     * @see pl.altkom.bookstore.model.InvoiceInfo
     * 
     * @return InvoiceInfo
     */
    public abstract InvoiceInfo getInvoiceInfo();
    
}
