/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2modalitatdeservei;

import java.util.Scanner;

/**
 *
 * @author saihb
 */
public class Ex2ModalitatDeServei {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String modalidad, mensaje, enlace, aula;
       
        System.out.println("Que modalidad prefieres Online o presencial?");
       modalidad=sc.nextLine();
       
       if (modalidad.equalsIgnoreCase("Online"))
       {
           System.out.println("Discord/Meet");
           enlace=sc.nextLine();
           mensaje = "Servicio configurado. Enlace guardado";
       }
       else if (modalidad.equalsIgnoreCase("Presencial"))
       {
           System.out.println("Introduce el aula");
           aula=sc.nextLine();
           mensaje = "Servicio configurado. Punto de encuentro guardado";
       }
       else {
           mensaje = "Modalidad no valida";
       }
        System.out.println(mensaje);
    }
    
}
