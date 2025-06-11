/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author atene
 */
public class LinkedList<T> {
    public Node<T> cabeza;
    private int tamaño;

    public void agregarAlFinal(T valor) {
        Node<T> nuevo = new Node<>(valor);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Node<T> actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
        tamaño++;
    }

    public T buscarPorValor(T valor) {
        Node<T> actual = cabeza;
        while (actual != null) {
            if (actual.valor.equals(valor)) {
                return actual.valor;
            }
            actual = actual.siguiente;
        }
        return null;
    }

    public boolean eliminarPorValor(T valor) {
        if (cabeza == null) return false;

        if (cabeza.valor.equals(valor)) {
            cabeza = cabeza.siguiente;
            tamaño--;
            return true;
        }

        Node<T> actual = cabeza;
        while (actual.siguiente != null) {
            if (actual.siguiente.valor.equals(valor)) {
                actual.siguiente = actual.siguiente.siguiente;
                tamaño--;
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    public void imprimir() {
        Node<T> actual = cabeza;
        while (actual != null) {
            System.out.println(actual.valor);
            actual = actual.siguiente;
        }
    }
}
