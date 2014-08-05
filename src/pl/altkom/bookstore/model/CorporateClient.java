/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.bookstore.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Describes corporate client
 * @author Radek Kozak
 */
public class CorporateClient extends Client {
    
    private List<Person> persons = new ArrayList<Person>();
    
    public void addPerson(Person p) {
        persons.add(p);
    }

    public CorporateClient() {
        setType(ClientType.CORPORATE);
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
        Person person = null;
       
        for (Person p: persons) {
            if(p.getPeselNumber() == pesel) {
                person = p;
                break;
            }
        }
        
        return person;
    }
    
    
    @Override
    public InvoiceInfo getInvoiceInfo() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
