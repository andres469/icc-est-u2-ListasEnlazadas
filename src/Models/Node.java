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
public class Node<T> {
   public T valor;
    public Node<T> siguiente;

    public Node(T valor) {
        this.valor = valor;
        this.siguiente = null;
    }
}
