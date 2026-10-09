/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex9disponibilitat.horària.d.un.servei.con.pkgswitch;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ex9DisponibilitatHoràriaDUnServeiConSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
 // VARIABLES
        String franja, modalitat, combinacio;

        // MOSTRAR
        System.out.print("Introdueix la franja (Mati/Tarda): ");

        // ESPERAR
        franja = sc.nextLine();

        // MOSTRAR
        System.out.print("Introdueix la modalitat (Online/Presencial): ");

        // ESPERAR
        modalitat = sc.nextLine();

        // CALCULAR
        combinacio = franja.toLowerCase() + "-" + modalitat.toLowerCase();

        switch (combinacio) {

            case "mati-online" ->
                System.out.println("Reserva confirmada amb l'expert.");

            case "tarda-presencial" ->
                System.out.println("Reserva confirmada amb l'expert.");

            default ->
                System.out.println("L'expert no esta disponible en aquesta franja per a aquesta modalitat.");
        }
    }
}
