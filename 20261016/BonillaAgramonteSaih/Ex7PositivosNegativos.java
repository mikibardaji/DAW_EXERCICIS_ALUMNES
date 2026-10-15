/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expositivosnegativos;

import java.util.Scanner;

/**
 *
 * @author saihb
 */
public class ExPositivosNegativos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int num, cont = 0, positivos = 0, negativos = 0;
        
         while (cont < 10) {
            System.out.println("Introduce un numero no nulo:");
            num = sc.nextInt();

            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            }
            cont++;
        }
         
        System.out.println("Numeros positivos: " + positivos);
        System.out.println("Numeros negativos: " + negativos);
    }
    
}
