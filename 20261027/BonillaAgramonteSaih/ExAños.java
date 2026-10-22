/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exaños;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *
 * @author saihb
 */
public class ExAños {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        LocalDateTime hoy = LocalDateTime.now();
        int anyo_actual = hoy.getYear();

        System.out.println("Introduce tu edad:");
        int edad = sc.nextInt();

        do {
            System.out.println("En el año " + anyo_actual
                    + " tenías " + edad + " años.");

            anyo_actual--;
            edad--;

        } while (edad >= 0);

    }
    
}
