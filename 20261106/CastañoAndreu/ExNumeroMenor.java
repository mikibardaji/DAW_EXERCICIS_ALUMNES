/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exnumeromenor;

import java.util.Scanner;

/**
 *
 * @author andca
 */
public class ExNumeroMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, valorMinimo;
        
        System.out.print("Introduce un numero: ");
        a = sc.nextInt();
        
        System.out.print("Introduce otro numero: ");
        b = sc.nextInt();
        
        valorMinimo = minimo(a, b);
        
        System.out.println("El minimo entre a y b es: " + valorMinimo);
    }
    
    public static int minimo(int a, int b){
        if(a < b){
            return a;
        }
        else{
            
            return b;
        }
    }
    
}
