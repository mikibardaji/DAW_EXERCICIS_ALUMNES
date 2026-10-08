/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2modalitat;

import java.util.Scanner;

/**
 *
 * @author myths
 */
public class Ex2Modalitat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Inicio, declaración variables y scanner
        Scanner sc = new Scanner(System.in);
        String modalidad, enlace, sitio ;
        
        //2.Recopilación de datos
        System.out.println("Que tipo de modalidad prefieres? (Online/Presencial)");
        modalidad= sc.nextLine(); 
        
        //3.variables
        if (modalidad.equalsIgnoreCase("Online"))
        { 
            System.out.println("Introduce un enlace de Meet/Discord  ");
            enlace = sc.nextLine();
            System.out.println("Servicio configurado. Enlace guardado");
         }  
        else if (modalidad.equalsIgnoreCase("Presencial"))
        {System.out.println("Introduce un punto de encuentro  ");
         sitio = sc.nextLine();
            System.out.println("Servicio configurado. Punto de encuentro guardado");
        }
        else 
        {
            System.out.println("Modalidad no valida. Asegurese de elegir entre Online/Presencial");
        }
      }     
    
}
