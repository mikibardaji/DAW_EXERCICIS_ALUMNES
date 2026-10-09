/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provensharecondicionalesswitch;

import java.util.Scanner;

/**
 *
 * @author sthef
 */
public class AlertaPrecios {
     public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double precioLibroCredit;
        
         System.out.print("Cual es el precio del libro en creditos: ");
         precioLibroCredit = sc.nextDouble();
         
         if (precioLibroCredit < 15){ 
         System.out.println("¡Precio excelente! Es una ganga. ");
         
         } else if(precioLibroCredit >=15 && precioLibroCredit <= 35 ){
             System.out.println("Precio estándar y correcto para un libro.");
             
         }else {
             System.out.println("Atención: Este libro tiene un precio superior a la media.");
         }
         
     }
}
