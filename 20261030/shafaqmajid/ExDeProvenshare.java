/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex.de.provenshare;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ExDeProvenshare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // CALCULAR
        double total = 0;
        int cantidad = 0;
        String respuesta = "S";

        // ESPERAR
        while (respuesta.equalsIgnoreCase("S")) {

            System.out.print("Introdueix el producte: ");
            String producto = sc.nextLine();

            System.out.print("Introdueix el preu: ");
            double precio = sc.nextDouble();

            // CALCULAR
            total = total + precio;
            cantidad = cantidad + 1;

            // ESPERAR
            System.out.print("Vols comprar mes productes? (S/N): ");
            respuesta = sc.next();

            sc.nextLine();
        }

        // MOSTRAR
        System.out.println("Total gastat: " + total);
        System.out.println("Quantitat de productes: " + cantidad);

    }
    
}
