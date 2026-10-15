/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej6bucles;

import java.util.Scanner;

/**
 *
 * @author cescs
 */
public class Ej6Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double numeros;
        boolean negativo = false;
        System.out.println("Dime 10 numeros y te dire si hay algun negativo");
        for (int i = 0; i < 10; i++) {
            numeros = teclado.nextDouble();
            if (numeros<0) {
                negativo = true;
            }
        }
        if (negativo) {
            System.out.println("Hay algun numero negativo");
        } else{
            System.out.println("No hay numeros negtativos");
        }
    }
    
}
