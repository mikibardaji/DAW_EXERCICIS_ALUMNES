/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minimofuncion;

import java.util.Scanner;

/**
 *
 * @author saihb
 */
public class MinimoFuncion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, resultado;

        System.out.print("Introduce el primer numero: ");
        num1 = teclado.nextInt();
        System.out.print("Introduce el segundo numero: ");
        num2 = teclado.nextInt();
        
        resultado = minimo(num1, num2);
        System.out.println("El minimo es: " + resultado);
    }
    public static int minimo(int a, int b) {
        if (a<b) {
            return a;
        } else {
            return b;
        }
    }
}
