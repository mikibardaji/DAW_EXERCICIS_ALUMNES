/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex10iteratius;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex10Iteratius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int nota;
         boolean notaMaxima = false;
         
         System.out.println("Introduce una nota del 0 al 10 y pon -1 para terminar: ");
         nota = sc.nextInt();
        
         while (nota != -1)
         {
                 if (nota >= 0 && nota <= 10)
                 {
                        if(nota == 10)
                         {
                           notaMaxima = true; //variable tipo flag
                         }
                 }
                 else
                 {
                        System.out.println("Valor de la nota introducida no valido");
                 }
                    System.out.println("Introduce una nota del 0 al 10 y pon -1 para terminar:");
                    nota = sc.nextInt();
         }
         
         if(notaMaxima)
         {
             System.out.println("Ha habido alguna nota de valor 10");
         }
         else
         {
             System.out.println("No ha habido ninguna nota de valor 10");
         }
         
        
    }
    
}
