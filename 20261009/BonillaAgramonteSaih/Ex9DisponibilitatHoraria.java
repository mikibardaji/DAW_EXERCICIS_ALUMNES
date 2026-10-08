/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex9disponibilitathoraria;

import java.util.Scanner;

/**
 *
 * @author saihb
 */
public class Ex9DisponibilitatHoraria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String franja, modalidad;
       
        System.out.println("Que franja quieres?(Mañana/Tarde)");
        franja = sc.nextLine();
        
        System.out.println("Que modalidad quieres?(Online/Presencial)");
        modalidad = sc.nextLine();
        
        if (franja.equalsIgnoreCase("mañana") && modalidad.equalsIgnoreCase("online")){
        
        System.out.println("Reserva confirmada con el experto.");
    }
        else if (franja.equalsIgnoreCase("tarde") && modalidad.equalsIgnoreCase("presencial")){
            
            System.out.println("Reserva confirmada con el experto.");
        }
            
        else {
            System.out.println("El experto no está disponible en esta franja para esta modalidad.");
        }
       
    }
    
}
