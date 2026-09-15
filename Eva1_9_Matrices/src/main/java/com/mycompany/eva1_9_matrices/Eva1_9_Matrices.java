/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.eva1_9_matrices;

/**
 *
 * @author dell
 */
public class Eva1_9_Matrices {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        System.out.println("Matriz = " + matriz);
        System.out.println("Matriz.length = " + matriz.length);
        System.out.println("0 = " + matriz[0]);
        System.out.println("0 = " + matriz[0].length);
        System.out.println("1 = " + matriz[1]);
        System.out.println("1 length = " + matriz[1].length);
        
        for (int i = 0; i < matriz.length; i++) {// Primer dimension = Filas
            for (int j = 0; j < matriz[i].length; j++) { // Segunda dimension columnas
                matriz[i][j]= (int)(Math.random()*100);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("["+ matriz[i][j]+"]");
            }
            System.out.println("");
        }
        
    }
}
