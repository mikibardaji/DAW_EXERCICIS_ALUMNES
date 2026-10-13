/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici6;

import java.util.Scanner;

/**
 *
 * @author adamg
 */
public class Exercici6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        int contador = 0;
        boolean negativo = false;
        
        while (contador < 10) {
            System.out.println("Introduce un numero no nulo");
            num = sc.nextInt();
            
            if (num != 0) {
                contador++;
                if (num < 0) {
                    negativo = true;
                }
            } else {
                System.out.println("El numero no puede ser 0");
            }
        }
        
        if (negativo){
            System.out.println("Hay algun numero negativo");
        } else {
            System.out.println("No hay ningun numero negativo");
        }
    }
    
}
