/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.bookstore.model;

/**
 * Describes individual client
 * 
 * @author Radek Kozak
 */
public class IndividualClient extends Client {

    private Person person;

    public Person getPerson() {
        return person;
    }

    @Override
    public InvoiceInfo getInvoiceInfo() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public IndividualClient(Person person) {
        this.person = person;
    }
    
}
