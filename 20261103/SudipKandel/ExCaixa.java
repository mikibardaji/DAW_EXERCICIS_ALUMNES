/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excatch;

import java.util.Scanner;

/**
 *
 * @author kande
 */
public class ExCatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        double preus;
        double total = 0;
        boolean funcionant = true;

        do {
            try {

                System.out.println("Introdueix el preu del productes");
                String entrada = sc.nextLine();

                preus = Double.parseDouble(entrada);

                if (preus == 0) {
                    funcionant = false;
                } else {
                    total = total + preus;
                }

            } catch (NumberFormatException ex) {

                System.out.println("Error de format. Operació cancel·lada per seguretat.");
                funcionant = false;

            }

        } while (funcionant);

        System.out.println("El total ha sigut de: " + total + " €");

    }
}
