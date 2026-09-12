/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.eva1_8_arreglosobjetos;

/**
 *
 * @author dell
 */
public class Eva1_8_ARREGLOSOBJETOS {

    public static void main(String[] args) {
        Ejemplo[] arreglo = null;
        //System.out.println("Arreglo = "+arreglo);
        arreglo = new Ejemplo[2];
        System.out.println("Arreglo = "+arreglo);
        System.out.println("Arreglo = "+arreglo[0]);
        arreglo[0] = new Ejemplo();
        arreglo[1] = new Ejemplo();
        System.out.println("Arreglo = "+arreglo[0]);
        System.out.println("Arreglo = "+arreglo[0].i);
    }

    class Ejemplo {

        int i = 5;
    }
}
