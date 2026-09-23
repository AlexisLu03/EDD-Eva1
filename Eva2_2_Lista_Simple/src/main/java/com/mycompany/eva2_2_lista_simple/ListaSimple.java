/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_2_lista_simple;

/**
 *
 * @author dell
 */
public class ListaSimple {

    private Nodo Inicio;

    public ListaSimple() {
        Inicio = null;//Siempre se crea vacía
    }

    public void agregar(int valor) {
        Nodo nuevo = new Nodo(valor);//Creo el nodo para el valor a insertar
        if (Inicio == null) {
            Inicio = nuevo;
        } else {//Lista con nodos
            //Movemos al final
            Nodo temp = Inicio;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevo);//Conecto nuevo al final de la lista
        }
    }

    public void imprimir() {
        Nodo temp=Inicio;
        while (temp != null) {
            System.out.println("[" + temp.getValor() + "]");
            temp = temp.getSiguiente();
        }
    }
}
