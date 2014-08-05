/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.bookstore.model;

import java.util.Date;

/**
 * Trader VO
 * 
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
public class Person {
   
    private String firstName;
     
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String lastName;
    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private int peselNumber;
    
    public int getPeselNumber() {
        return peselNumber;
    }

    public void setPeselNumber(int peselNumber) {
        this.peselNumber = peselNumber;
    }

    private Date dateOfBirth;
    
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    private Kontakt contact;
    
    public Kontakt getContact() {
        return contact;
    }

    public void setContact(Kontakt contact) {
        this.contact = contact;
    }

    private DeliveryAddress address;
    
    public DeliveryAddress getAddress() {
        return address;
    }

    public void setAddress(DeliveryAddress address) {
        this.address = address;
    }
}
