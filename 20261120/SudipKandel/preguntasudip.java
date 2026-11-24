/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kande
 */
package PreguntasSudip;
import java.util.Scanner;

public class PreguntasSudip {

 public static String preguntaPrimera() {

    Scanner sc = new Scanner(System.in);

    System.out.println("Que seleccion nacional ha ganado mas Copas Mundiales de la FIFA?");
    System.out.println("A) Brasil");
    System.out.println("B) Uruguay");
    System.out.println("C) Italia");
    System.out.println("D) Francia");

    System.out.print("Escribe tu respuesta (A/B/C/D): ");
    String respuesta = sc.nextLine();

    return respuesta.toUpperCase();
}
    public static void respostaPrimera(String respuesta) {

    if (respuesta.equals("A")) {
        System.out.println("Correcto! Brasil es la seleccion con mas Mundiales.");

    } else if (respuesta.equals("B")) {
        System.out.println("Incorrecto! Uruguay tiene 2 Mundiales.");

    } else if (respuesta.equals("C")) {
        System.out.println("Incorrecto! Italia tiene 4 Mundiales.");

    } else if (respuesta.equals("D")) {
        System.out.println("Incorrecto! Francia tiene 2 Mundiales.");

    } else {
        System.out.println("Respuesta no valida. Escribe A, B, C o D.");
    }
}
}
