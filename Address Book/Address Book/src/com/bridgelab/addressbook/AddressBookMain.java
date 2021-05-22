package com.bridgelab.addressbook;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class AddressBookMain {

    public static void main(String[] args) {

        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWelcome to Address Book Program\n");
        addressBook.displayContact();
        int selectOperation = 0;
        while (selectOperation != 4) {
            System.out.println("\nEnter\nCreating Contact: 1\nEditing Contact: 2\nDeleting Contact: 3\nExit: 4");
            selectOperation = sc.nextInt();
            sc.nextLine();
            switch (selectOperation) {

                case 1:
                    System.out.println("\nEnter Details\n");
                    System.out.print("\nFirst Name: ");
                    String firstName = sc.nextLine();
                    System.out.print("\nLast Name: ");
                    String lastName = sc.nextLine();
                    System.out.print("\nAddress: ");
                    String address = sc.nextLine();
                    System.out.print("\nCity: ");
                    String city = sc.nextLine();
                    System.out.print("\nState: ");
                    String state = sc.nextLine();
                    System.out.print("\nZip: ");
                    String zip = sc.nextLine();
                    System.out.print("\nPhone Number: ");
                    String phoneNumber = sc.nextLine();
                    System.out.print("\nEmail: ");
                    String email = sc.nextLine();
                    addressBook.createContact(firstName, lastName, address, city, state, zip, phoneNumber, email);
                    break;
                case 2:
                    addressBook.editContact(String firstname);
                    break;
                case 3:
                    addressBook.deleteContact();
                    break;
                default:
                    System.out.println("\n");
                    break;
            }
        }

    }

}

class AddressBook {
    static ArrayList<ConcurrentHashMap<String, String>> contactBook = new ArrayList<ConcurrentHashMap<String, String>>();

    public void createContact(String firstname, String lastname, String address, String city, String state, String zip,
            String phoneNumber, String email) {
        ConcurrentHashMap<String, String> contact = new ConcurrentHashMap<String, String>();
        contact.put("firstname", firstname);
        contact.put("lasttname", lastname);
        contact.put("address", address);
        contact.put("city", city);
        contact.put("state", state);
        contact.put("zip", zip);
        contact.put("phoneNumber", phoneNumber);
        contact.put("email", email);
        contactBook.add(contact);
        displayContact();
    }

    public void editContact(String firstname) {
        
        displayContact();
    }

    public void deleteContact() {
        displayContact();
    }

    public void displayContact() {
        System.out.println(contactBook);
    }
}
