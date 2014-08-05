/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.bookstore.model;

/**
 * Describes corporate client
 * @author Radek Kozak
 */
public class CorporateClient extends Client {
    
    private Person persons[];
    
    @Override
    public InvoiceInfo getInvoiceInfo() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
