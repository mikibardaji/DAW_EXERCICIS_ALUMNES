/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex7contarpositivosynegativos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ex7Contarpositivosynegativos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, positivos = 0, negativos = 0;

        // Para repetir 10 veces
        for (int i = 1; i <= 10; i++) {

            // Para pedir un numero
            System.out.print("Introduce el numero " + i + ": ");
            numero = sc.nextInt();

            // Para contar negativos y positivos
            if (numero > 0) 
            {
                positivos++;
            } 
            else if (numero < 0)
            {
                negativos++;
            }
        }

        // Indicar los cantidad de positivos y negativos
        System.out.println("Numeros positivos: " + positivos);
        System.out.println("Numeros negativos: " + negativos);
    }
   }
    
