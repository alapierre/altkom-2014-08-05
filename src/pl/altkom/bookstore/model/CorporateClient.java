/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.bookstore.model;

import java.util.HashMap;
import java.util.Map;
/**
 * Describes corporate client
 * @author Radek Kozak
 */
public class CorporateClient extends Client {
    
    private String name;
    private String vatId;
    
    private Map<Integer, Person> persons;
    
    public void addPerson(Person p) {
        
        int pesel = p.getPeselNumber();
        
        if(!persons.containsKey(pesel)) {
            persons.put(pesel, p);
        }
    }

    public CorporateClient() {
        setType(ClientType.CORPORATE);
        this.persons = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVatId() {
        return vatId;
    }

    public void setVatId(String vatId) {
        this.vatId = vatId;
    }
    
    
    /**
     * Search for given person by the pesel number
     * 
     * @param pesel Pesel number
     * 
     * @see pl.altkom.bookstore.model.Person
     * @return Person 
     */
    public Person getPersonByPesel(int pesel) {
        return persons.get(pesel);
    }
    
    
    @Override
    public InvoiceInfo getInvoiceInfo() {
        return new InvoiceInfo(name, vatId);
    }
    
}
