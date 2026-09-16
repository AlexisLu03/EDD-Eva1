/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_12_primos;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Eva1_12_Primos {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n;
        System.out.println("Introduce el número para evaluar si es primo: ");
        n = Sc.nextInt();
        
        System.out.println("Metodo 1");
        boolean p1 = true;
        for (int i = 2; i < (n-1); i++) {
            if (n%i==0) {
                p1= false; break;
            }
        }
        System.out.println("Es primo: "+p1);
        System.out.println("");
        System.out.println("Metodo 2");
        boolean p2 = true;
        for (int i = 2; i*i <= n-1; i++) {
            if (n%i==0) {
                p2= false; break;
            }
        }
        System.out.println("Es primo: "+p2);
    }
}
