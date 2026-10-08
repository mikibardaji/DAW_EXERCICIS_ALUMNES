/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2projecteprovenshare;

import java.util.Scanner;

/**
 *
 * @author andca
 */
public class Ex2ProjecteProvenShare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String eleccio, missatge, enllaç;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quin servei vols contractar (Online o Presencial)?");
        eleccio = sc.nextLine();
        
        if (eleccio.equalsIgnoreCase("Online")) {
            System.out.println("Introdueix l'enllaç de Discord/Meet");
            enllaç = sc.nextLine();
            missatge = "Servei configurat. Enllaç desat.";
        } else if (eleccio.equalsIgnoreCase("Presencial")) {
            missatge = "Servei configurat. Punt de trobada desat.";
        } else {
            missatge = "Error";
        }
        
        System.out.println(missatge);
    }
    
}
