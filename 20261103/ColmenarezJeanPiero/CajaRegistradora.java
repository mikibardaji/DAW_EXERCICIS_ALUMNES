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
        String entrada;
       
       
        do {
            System.out.println("Escriba el nombre del producto");
            productos = teclado.nextLine();
//        
            System.out.println("dime el precio del producto (pon 0 para salir)");
            entrada = teclado.nextLine();
            
            try {
        precio = Double.parseDouble(entrada);   // convertir entrada a double
                if (precio>0) {
                    total = total + precio;
                }
                
                else if (precio==0){
                    System.out.println("saliendo...");
                }
        total = total + precio;    // acumular
    } catch (NumberFormatException ex) {
        System.out.println("Error de formato. Operació cancel·lada per seguretat.");
    }  

            
            
        } while (precio!=0);
        System.out.println("Productos agregados: ");
        System.out.println("Productos:" + productos + "precio: " + precio);
        System.out.println("Tot " + total);
//          
    }
    
}
