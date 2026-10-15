/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej7bucles;

import java.util.Scanner;

/**
 *
 * @author cescs
 */
public class Ej7Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double numeros, contador_pos = 0, contador_neg = 0;
        System.out.println("Dime 10 numeros y te dire cuantos negativos y positivos hay");
        for (int i = 0; i < 10; i++) {
            numeros = teclado.nextDouble();
            if (numeros<0) {
                contador_neg ++;
            }else {
                contador_pos ++;
            }
        }
        System.out.println("Numeros positivos: "+contador_pos);
        System.out.println("Numeros negativos: "+contador_neg);
    }
    
}
