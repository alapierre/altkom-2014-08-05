/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.bookstore.model;

import java.util.Scanner;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
public class BookStore {
    
    public static void main(String[] args) {
        
        System.out.println("Aplikacja BookStore - wybierz opcję");
        
        BookStore b = new BookStore();
        
        b.showOptions();
        
        Scanner keyboard = new Scanner(System.in);
        
    }

    private void showOptions() {
        
        System.out.println("1 - dodaj klienta");
        System.out.println("2 - lista klientów");
        
    }
    
}
