/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5devaluacióautomàticadepreusconif;

import java.util.Scanner;

/**
 *
 * @author smo9104
 */
public class Ex5DevaluacióAutomàticaDePreusConIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        // Variables
        double preuOriginal;
        double descompte = 0;
        double preuFinal;
        String estat;
        boolean estadoCorrecto = true;

        // MOSTRAR
        System.out.print("Introdueix el preu original: ");

        // ESPERAR
        preuOriginal = sc.nextDouble();
        sc.nextLine();

        // MOSTRAR
        System.out.print("Introdueix l'estat (Nou / Bo / Acceptable): ");

        // ESPERAR
        estat = sc.nextLine();

        // CALCULAR
        if (estat.equalsIgnoreCase("Nou")) {

            descompte = 0;

        } else if (estat.equalsIgnoreCase("Bo")) {

            descompte = 0.20;

        } else if (estat.equalsIgnoreCase("Acceptable")) {

            descompte = 0.50;

        } else {

            System.out.println("Estat no vàlid.");
            estadoCorrecto = false;
        }

        // CALCULAR
        if (estadoCorrecto == true) {

            preuFinal = preuOriginal - (preuOriginal * descompte);

            // MOSTRAR
            System.out.println("Preu final: " + preuFinal + " credits");
        }
    }
}
    

