/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2modalitatdeseveiconswitch;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ex2Modalitatdeseveiconswitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        // Variables
        String modalitat, enllac,  lloc ;

        // MOSTRAR
        System.out.print("Quina modalitat prefereixes? (Online / Presencial): ");

        // ESPERAR
        modalitat = sc.nextLine().trim();

        // CALCULAR
        switch (modalitat.toLowerCase()) {

            case "online":

                // MOSTRAR
                System.out.print("Introdueix l'enllac de Discord/Meet: ");

                // ESPERAR
                enllac = sc.nextLine();

                // MOSTRAR
                System.out.println("Servei configurat. Enllac desat.");

                break;

            case "presencial":

                // MOSTRAR
                System.out.print("Introdueix l'aula o lloc de trobada: ");

                // ESPERAR
                lloc = sc.nextLine();

                // MOSTRAR
                System.out.println("Servei configurat. Punt de trobada desat.");

                break;

            default:

                // MOSTRAR
                System.out.println("Modalitat no vàlida. Tria Online o Presencial.");
        }
    }
}
    
    

