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
    String firstName;
    String lastName;
    int peselNumber;
    Date dateOfBirth;
    Kontakt contact;
    DeliveryAddress address;
}
