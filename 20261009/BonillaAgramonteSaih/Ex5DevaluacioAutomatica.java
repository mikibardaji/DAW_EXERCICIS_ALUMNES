/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5devaluacioautomatica;

import java.util.Scanner;

/**
 *
 * @author saihb
 */
public class Ex5DevaluacioAutomatica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio, descuento, precioFinal=0;
        String estado, comentario;
        
        System.out.println("Introduce el precio original");
        precio=sc.nextDouble();
        
        sc.nextLine();
        
        System.out.println("Introduce el estado");
        estado=sc.nextLine();
        
        if (estado.equalsIgnoreCase("Nuevo")){
             descuento = 0;
             precioFinal = precio;
             comentario = "No tiene descuento";
        }
        else if (estado.equalsIgnoreCase("Bueno")){
            descuento = precio*0.20;
            precioFinal = precio - descuento;
           comentario = "Tiene 20% de descuento";        
        }
        else if (estado.equalsIgnoreCase("Aceptable")){
            descuento = precio*0.50;
            precioFinal = precio - descuento;
            comentario = "Tiene un 50% de descuento";
        }
        else{
            comentario = "No valido";
        }
            
        System.out.println(comentario);
        System.out.println("Precio Final: " + precioFinal);
    }
    
}
