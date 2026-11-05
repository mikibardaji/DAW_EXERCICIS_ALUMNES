/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3funcions;

import java.util.Scanner;

/**
 *
 * @author kande
 */
public class Ex3Funcions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // VARIABLES
        int A;
        int B;
        int resultado;

        // MOSTRAR
        System.out.print("Introduce el primer numero entero: ");

        // ESPERAR
        A = sc.nextInt();

        // MOSTRAR
        System.out.print("Introduce el segundo numero entero: ");

        // ESPERAR
        B = sc.nextInt();

        // CALCULAR
        resultado = minimo(A, B);

        // MOSTRAR
        System.out.print("El numero minimo es: " + resultado);

        
    }
    
    public static int minimo(int A, int B) {
        if (A < B) {
            return A;
        } else {
            return B;
        }
    }
}
