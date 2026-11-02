/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cajaregistradora;

import java.util.Scanner;

/**
 *
 * @author Jean Piero
 */
public class CajaRegistradora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double precio=0, total=0;
        String productos;
        String error;
       
       
        do {
            System.out.println("Escriba el nombre del producto");
            productos = teclado.nextLine();
//        
            System.out.println("dime el precio del producto");
            precio = teclado.nextDouble();
            try {
        precio = Double.parseDouble(error);   // convertir entrada a double
        total = total + precio;    // acumular
    } catch (NumberFormatException e) {
        System.out.println("Error de formato. Operació cancel·lada per seguretat.");
    }  

            
            
        } while (precio>=0);
        System.out.println("Total: " + total);
//          
    }
    
}
