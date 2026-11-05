/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejintminmax;

import java.util.Scanner;

/**
 *
 * @author cescs
 */
public class EjIntMinMax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b, num_minimo;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime dos numeros enteros y te dire cual es el minimo y maximo");
        System.out.println("Dime el primero numero: ");
        a = teclado.nextInt();
        System.out.println("Dime el segundo numero: ");
        b = teclado.nextInt();
        num_minimo = minimo(a,b);
        System.out.println("El numero minimo entre los dos es "+num_minimo);
    }

    public static int minimo(int a, int b) {
        if (a<b) {
            return a;
        }else {
            return b;
        }
    }
    
}
