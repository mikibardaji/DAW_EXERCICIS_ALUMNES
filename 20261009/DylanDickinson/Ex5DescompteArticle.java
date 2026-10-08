/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5descomptearticle;

import java.util.Scanner;

/**
 *
 * @author myths
 */
public class Ex5DescompteArticle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Incio, declaraciones, Sc
        Scanner sc = new Scanner(System.in);
        double precio, precioFin;
        String calidad;
        
        //2. Recop de datos
        System.out.println("En que estado esta el producto? (Aceptable, Bueno, Nuevo)");
        calidad = sc.nextLine();
        System.out.println("Que precio tiene el producto?");
        precio = sc.nextDouble();
        
        //3.Calcular variables y mostrar
        if (calidad.equalsIgnoreCase("Aceptable"))
        {
          precioFin = precio * 0.5 ; 
        System.out.println("El precio final de su artículo es  " + precioFin);
         } else if (calidad.equalsIgnoreCase("Bueno"))
         {
          precioFin = precio * 0.8;
        System.out.println("El precio final de su artículo es  " + precioFin);
         } else if (calidad.equalsIgnoreCase("Nuevo"))
           System.out.println("El precio final de su artículo es  " + precio);
            }
    }
