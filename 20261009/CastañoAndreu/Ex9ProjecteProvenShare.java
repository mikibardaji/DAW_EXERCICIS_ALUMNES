/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex9projecteprovenshare;

import java.util.Scanner;

/**
 *
 * @author andca
 */
public class Ex9ProjecteProvenShare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String franjaExp1, franjaExp2, modalitatMatiExp, modalitatTardaExp, franjaUsuari, modalitatUsuari;
        franjaExp1 = "Mati";
        franjaExp2 = "Tarda";
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quina franja prefereixes (Mati o Tarda)?");
        franjaUsuari = sc.nextLine();
        
        System.out.println("Quina modalitat prefereixes (Online o Presencial)?");
        modalitatUsuari = sc.nextLine();
        modalitatMatiExp = "Online"; 
        modalitatTardaExp = "Presencial";
        
        if (franjaUsuari.equalsIgnoreCase(franjaExp1) && modalitatUsuari.equalsIgnoreCase(modalitatMatiExp)) {
            System.out.println("Reserva confirmada amb l'expert.");
        } else if (franjaUsuari.equalsIgnoreCase(franjaExp2) && modalitatUsuari.equalsIgnoreCase(modalitatTardaExp)) {
            System.out.println("Reserva confirmada amb l'expert.");
        } else {
            System.out.println("L'expert no està disponible en aquesta franja per a aquesta modalitat.");
        }
    }
    
}
