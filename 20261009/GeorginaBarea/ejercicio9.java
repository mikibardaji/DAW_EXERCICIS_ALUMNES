/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercisis1009;

import java.util.Scanner;

/**
 *
 * @author gba0006
 */
public class ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String franja, modalidad;
       
        System.out.println("Quina franja vols?(Mati/Tarda)");
        franja = teclado.nextLine();
        
        System.out.println("Quina modalitat vols?(Online/Presencial)");
        modalidad = teclado.nextLine();
        
        if (franja.equalsIgnoreCase("mati") && modalidad.equalsIgnoreCase("online")){
        
        System.out.println("Reserva confirmada amb l'expert.");
    }
        else if (franja.equalsIgnoreCase("tarda") && modalidad.equalsIgnoreCase("presencial")){
            
            System.out.println("Reserva confirmada amb l'experto.");
        }
            
        else {
            System.out.println("L'expert no est? disponible en aquesta franja per aquesta modalitat.");
        }
}
}