/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor - test.
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

    private String lastName;

    private int peselNumber;

    private Date dateOfBirth;

    private Kontakt contact;

    private Address address;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPeselNumber() {
        return peselNumber;
    }

    public void setPeselNumber(int peselNumber) {
        this.peselNumber = peselNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Kontakt getContact() {
        return contact;
    }

    public void setContact(Kontakt contact) {
        this.contact = contact;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
