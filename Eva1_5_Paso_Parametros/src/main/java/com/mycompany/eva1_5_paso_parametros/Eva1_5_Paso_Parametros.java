/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_5_paso_parametros;

/**
 *
 * @author dell
 */
public class Eva1_5_Paso_Parametros {

    public static void main(String[] args) {
        int i = 1;
        System.out.println("i previo = "+i);
        incrementar(i);
        System.out.println("i = "+i);
        Prueba prueba = new Prueba();
        System.out.println("Valor de prueba = "+ prueba);
        incrementarObj(prueba);
        System.out.println("Valor de prueba = "+ prueba);
    }
    public static void incrementar (int valor)  // paso por valor
    {
    valor++;
    }
    public static void incrementarObj (Prueba prueba)  // paso por valor
    {
    prueba++;
    }
    class Prueba {
        int y = 5;
}
}

//Valor = Copia
//Referencia = Dirección