/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4refuersoaños;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *
 * @author José Antonio
 */
public class Ex4RefuersoAños {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int edad;
        LocalDateTime hoy = LocalDateTime.now();
        int anyo_actual = hoy.getYear();
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce la edad que tienes: ");
        edad = scan.nextInt();
        do {
            edad -= 1;
            anyo_actual -= 1;
            System.out.println("tenias " + edad + " en el a?o: " + anyo_actual);
        } while (edad != 0);
        if (edad==0) {
            System.out.println(anyo_actual+" es el año en que naciste!!!");
        }

    }
}
