/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exedad;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *
 * @author kande
 */
public class ExEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalDateTime hoy = LocalDateTime.now();
        int anyo_actual = hoy.getYear();

        System.out.println("Introduce tu edad:");
        int edad = sc.nextInt();

        int contador = 0;

        do {
            System.out.println((anyo_actual - contador) + " - " + (edad - contador));
            contador++;
        } while (contador <= edad);

    }
}
