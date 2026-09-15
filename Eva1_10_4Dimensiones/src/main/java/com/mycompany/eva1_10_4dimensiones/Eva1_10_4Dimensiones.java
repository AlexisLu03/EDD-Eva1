/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.eva1_10_4dimensiones;

/**
 *
 * @author dell
 */
public class Eva1_10_4Dimensiones {

    public static void main(String[] args) {
        int[][][][] arreglo = new int[2][2][2][2];
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                for (int k = 0; k < arreglo[i][j].length; k++) {
                    for (int l = 0; l < arreglo[i][j][k].length; l++) {
                        arreglo[i][j][k][l]= (int)(Math.random()*100);
                    }
                }
            }
        }
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                for (int k = 0; k < arreglo[i][j].length; k++) {
                    for (int l = 0; l < arreglo[i][j][k].length; l++) {
                        System.out.print("["+arreglo[i][j][k][l]+"]");                    }
                }
            }
            System.out.println("");
        }
    }
}
