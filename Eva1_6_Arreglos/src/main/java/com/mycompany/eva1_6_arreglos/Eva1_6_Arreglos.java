/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_6_arreglos;

/**
 *
 * @author dell
 */
public class Eva1_6_Arreglos {

    public static void main(String[] args) {
        int[] datos = new int[1000];
        System.out.println("Datos");
        // Datos = Objeto
        for (int i = 0; i < datos.length; i++) {
            datos[i]= (int)(Math.random()*100);
        }
        for (int i = 0; i < datos.length; i++) {
            System.out.println("Dato "+(i+1)+" : "+datos[i]);
        }
    }
}
