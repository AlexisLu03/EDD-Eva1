/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.eva1_7_arregossize;

/**
 *
 * @author dell
 */
public class Eva1_7_ArregosSize {

    public static void main(String[] args) {
        int[] original = new int[10];
        int[] copia = new int[original.length];
        System.out.println(original);
        for (int i = 0; i < original.length; i++) {
            original[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < original.length; i++) {
            System.out.println("No. " + (i + 1) + ": " + original[i]);
        }
        for (int i = 0; i < original.length; i++) {
            copia[i] = original[i];
        }
        // No se puede cambiar tamaño
        original = new int[5];
        System.out.println(original);
        for (int i = 0; i < original.length; i++) {
            original[i] = copia[i];
        }
        for (int i = 0; i < original.length; i++) {
            System.out.println("No. " + (i + 1) + ": " + original[i]);
        }
    }
}
