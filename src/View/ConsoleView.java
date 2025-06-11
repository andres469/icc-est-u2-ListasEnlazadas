package View;

import Controller.ContactManager;
import Models.Contact;

import java.util.Scanner;

public class ConsoleView {
    private ContactManager manager;
    private Scanner scanner;

    public ConsoleView() {
        manager = new ContactManager();
        scanner = new Scanner(System.in);
    }

    public void showMenu() {
        int option;

        do {
            System.out.println("\n--- Contact Manager ---");
            System.out.println("1. Add contact");
            System.out.println("2. Find contact");
            System.out.println("3. Delete contact");
            System.out.println("4. Show all contacts");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            scanner.nextLine(); // limpia el buffer

            switch (option) {
                case 1:
                    addContact();
                    break;
                case 2:
                    findContact();
                    break;
                case 3:
                    deleteContact();
                    break;
                case 4:
                    showAllContacts();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option.");
            }

        } while (option != 5);
    }

    private void addContact() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone: ");
        String phone = scanner.nextLine();
        Contact<String, String> contact = new Contact<>(name, phone);
        manager.addContact(contact);
        System.out.println("Contact added.");
    }

    private void findContact() {
        System.out.print("Enter name to search: ");
        String name = scanner.nextLine();
        Contact<?, ?> found = manager.findContactByName(name);
        if (found != null) {
            System.out.println("Found: " + found);
        } else {
            System.out.println("Contact not found.");
        }
    }

    private void deleteContact() {
        System.out.print("Enter name to delete: ");
        String name = scanner.nextLine();
        if (manager.deleteContactByName(name)) {
            System.out.println("Contact deleted.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    private void showAllContacts() {
        manager.printContacts();
    }
}
