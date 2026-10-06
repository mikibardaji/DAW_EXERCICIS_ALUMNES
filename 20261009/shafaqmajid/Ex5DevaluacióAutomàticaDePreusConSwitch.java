/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5devaluació.automàtica.de.preus.con.pkgswitch;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ex5DevaluacióAutomàticaDePreusConSwitch {

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

        // MOSTRAR
        System.out.print("Introdueix el preu original: ");

        // ESPERAR
        preuOriginal = sc.nextDouble();
        sc.nextLine();

        // MOSTRAR
        System.out.print("Introdueix l'estat (Nou / Bo / Acceptable): ");

        // ESPERAR
        estat = sc.nextLine().trim();

        // CALCULAR
        switch (estat.toLowerCase()) {

            case "nou":
                descompte = 0;
                break;

            case "bo":
                descompte = 0.20;
                break;

            case "acceptable":
                descompte = 0.50;
                break;

            default:
                System.out.println("Estat no valid.");
                return;
        }

        preuFinal = preuOriginal - (preuOriginal * descompte);

        // MOSTRAR
        System.out.println("Preu final: " + preuFinal + " credits");
    }
}
    
    

