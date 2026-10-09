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
public class EvaluacionPrecios {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double precioInicial, porcentajeDescuento, precioFinal;
        String estado;
      
        System.out.print("Indica precio original del producto:  ");
        precioInicial = sc.nextDouble();
        System.out.print("Indica el estado del producto (NOU,BO, ACCEPTABLE): ");
        sc.nextLine();
        estado = sc.nextLine();
        
        if(estado.equalsIgnoreCase("NOU")){
            porcentajeDescuento = 0;
            precioFinal = precioInicial - (precioInicial * porcentajeDescuento / 100);
            System.out.println("El precio final del producto es: " + precioFinal);
       
        } else if(estado.equalsIgnoreCase("BO")){
            porcentajeDescuento = 20;
            precioFinal = precioInicial - (precioInicial * porcentajeDescuento / 100);
            System.out.println("El precio final del producto es: " + precioFinal);
            
        } else if(estado.equalsIgnoreCase("ACCEPTABLE")){
            porcentajeDescuento = 50;
            precioFinal = precioInicial - (precioInicial * porcentajeDescuento / 100);
            System.out.println("El precio final del producto es: " + precioFinal);
     
        } else {
            System.out.println("Error");
        }
       
    }
}
