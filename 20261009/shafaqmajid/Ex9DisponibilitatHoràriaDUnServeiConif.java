/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex9disponibilitat.horària.d.un.servei.conif;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ex9DisponibilitatHoràriaDUnServeiConif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        // VARIABLES
        String franja;
        String modalitat;

        // MOSTRAR
        System.out.print("Introdueix la franja (Mati/Tarda): ");

        // ESPERAR
        franja = sc.nextLine();

        // MOSTRAR
        System.out.print("Introdueix la modalitat (Online/Presencial): ");

        // ESPERAR
        modalitat = sc.nextLine();

        // CALCULAR
        if (franja.equalsIgnoreCase("Mati")
                && modalitat.equalsIgnoreCase("Online")) {

            System.out.println("Reserva confirmada amb l'expert.");

        } else if (franja.equalsIgnoreCase("Tarda")
                && modalitat.equalsIgnoreCase("Presencial")) {

            System.out.println("Reserva confirmada amb l'expert.");

        } else {

            System.out.println("L'expert no esta disponible en aquesta franja per a aquesta modalitat.");
        }
    }
}
