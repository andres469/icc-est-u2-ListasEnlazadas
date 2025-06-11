/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Models.Contact;
import Models.LinkedList;

/**
 *
 * @author atene
 */
public class ContactManager {
     private LinkedList<Contact<?, ?>> contactos;

    public Agenda() {
        contactos = new ListaEnlazada<>();
    }

    public void agregarContacto(Contacto<?, ?> contacto) {
        contactos.agregarAlFinal(contacto);
    }

    public Contacto<?, ?> buscarContactoPorNombre(String nombre) {
        Nodo<Contacto<?, ?>> actual = contactos.cabeza;
        while (actual != null) {
            if (actual.valor.getNombre().toString().equalsIgnoreCase(nombre)) {
                return actual.valor;
            }
            actual = actual.siguiente;
        }
        return null;
    }

    public boolean eliminarContactoPorNombre(String nombre) {
        Nodo<Contacto<?, ?>> actual = contactos.cabeza;
        while (actual != null) {
            if (actual.valor.getNombre().toString().equalsIgnoreCase(nombre)) {
                return contactos.eliminarPorValor(actual.valor);
            }
            actual = actual.siguiente;
        }
        return false;
    }

    public void imprimirContactos() {
        contactos.imprimir();
    }
    
}
