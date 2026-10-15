/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex7positivosnegativos;

import java.util.Scanner;

/**
 *
 * @author kande
 */
public class EX7PositivosNegativos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        
        int num, contador = 0, contadorNegativo = 0, contadorPositivo =0;
        boolean negativo = false;
        
        while (contador < 10) {
            System.out.println("Introduce un numero no nulo:");
            num = teclado.nextInt();

            if (num != 0) {
                ++contador;

                if (num < 0) {
                    ++contadorNegativo;
                } else {
                    ++contadorPositivo;
                }
            } else {
                System.out.println("Introduce un numero distinto al cero");
            }
        }

        System.out.println("Numeros positivos: " + contadorPositivo);
        System.out.println("Numeros negativos: " + contadorNegativo);
    }
    
}
