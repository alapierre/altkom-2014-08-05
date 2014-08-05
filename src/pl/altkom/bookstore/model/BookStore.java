/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.bookstore.model;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
public class BookStore {

    private List<Client> clients = new ArrayList<>();

    public static void main(String[] args) {

        main: while (true) {
            System.out.println("Aplikacja BookStore - wybierz opcję");

            BookStore b = new BookStore();

            b.showOptions();

            Scanner keyboard = new Scanner(System.in);

            int selected = b.readFromKeyboard(keyboard);

            switch (selected) {
                case 1:
                    Client client = b.wczytajDaneKlientaZKlawiatury(keyboard);
                    b.clients.add(client);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    break main;
                    //System.exit(0);
                default:
                    System.out.println("błędny wybór");
            }
        }

    }

    public Client wczytajDaneKlientaZKlawiatury(Scanner sc) {

        System.out.println("Jaki typ klienta:");
        System.out.println("1. Firmowy");
        System.out.println("2. Indywidualny");
        System.out.println("inna wartość = powrót");

        int res = readFromKeyboard(sc);
        switch (res) {
            case 1:
                return readCorporate(sc);
            case 2:
                return readIndywidual(sc);
            default:
                return null;
        }
    }

    private void showOptions() {

        System.out.println("1 - dodaj klienta");
        System.out.println("2 - lista klientów");
        System.out.println("3 - dodaj produkt");
        System.out.println("4 - lista produktów");

        
        System.out.println("0 - koniec");
    }

    private int readFromKeyboard(Scanner keyboard) {
        while (!keyboard.hasNextInt()) {
            System.out.println("błędny wybór " + keyboard.next());
        }
        return keyboard.nextInt();
    }

    private Client readCorporate(Scanner sc) {

        System.out.println("Nazwa");

        CorporateClient client = new CorporateClient();
        client.setName(sc.next());

        System.out.println("Podaj NIP");
        client.setVatId(sc.next());

        return client;

    }

    private Client readIndywidual(Scanner sc) {

        Person p = new Person();

        System.out.println("Podaj imię");
        p.setFirstName(sc.next());

        System.out.println("Podaj nazwisko");

        p.setLastName(sc.next());

        System.out.println("Podaj PESEL");
        p.setPeselNumber(sc.nextInt());

        IndividualClient client = new IndividualClient(p);

        return client;
    }

}
