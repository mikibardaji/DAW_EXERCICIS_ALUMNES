/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex7ganga;

import java.util.Scanner;

/**
 *
 * @author myths
 */
public class Ex7Ganga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1.Inicio,declaracion variables y scanner
         Scanner sc = new Scanner(System.in);
         double precioLibro; 
         //2. Recopilacion datos
         System.out.println("Que precio tiene el libro que quieres comprar?");
         precioLibro = sc.nextDouble();
         if (precioLibro <= 15.0)
         {
             System.out.println("El precio del libro es excelente!!Es una ganga :)");
         }
         else if (precioLibro<=35.0 && precioLibro>=16.0)
         {
             System.out.println("El precio del libro está dentro de la media");
         }
         else if (precioLibro>36)
         {
             System.out.println("Atencion. El precio de este libro es superior a la media... :(");
         } 
    }
    
}
