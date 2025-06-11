package Controller;

import Models.Contact;
import Models.LinkedList;
import Models.Node;

public class ContactManager {
    private LinkedList<Contact<?, ?>> contacts;

    public ContactManager() {
        contacts = new LinkedList<>();
    }

    public void addContact(Contact<?, ?> contact) {
        contacts.agregarAlFinal(contact);
    }

    public Contact<?, ?> findContactByName(String name) {
        Node<Contact<?, ?>> current = contacts.cabeza; // Cambiado para usar getter
        while (current != null) {
            if (current.valor.getNombre().toString().equalsIgnoreCase(name)) {
                return current.valor;
            }
            current = current.siguiente;
        }
        return null;
    }

    public boolean deleteContactByName(String name) {
        Node<Contact<?, ?>> current = contacts.cabeza;
        while (current != null) {
            if (current.valor.getNombre().toString().equalsIgnoreCase(name)) {
                return contacts.eliminarPorValor(current.valor);
            }
            current = current.siguiente;
        }
        return false;
    }

    public void printContacts() {
        contacts.imprimir();
    }
}
