/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exproven;

import java.util.Scanner;

/**
 *
 * @author saihb
 */
public class Libreria {

    public static String preguntaPrimera() {
        Scanner sc = new Scanner(System.in);
        String respuesta;

        System.out.println("¿Cual fue el Videojuego mas esperado?");
        System.out.println("A: Minecraft");
        System.out.println("B: Fortnite");
        System.out.println("C: GTA 6");
        System.out.println("D: League of Legends");
        System.out.println("Responde: A, B, C, D");
        respuesta=sc.nextLine();
        
        return respuesta.toUpperCase();  
    }
    
  public static void respostaPrimera(String respuesta) {
            
        
            if (respuesta.equals("C")) {
            System.out.println("Correcto! La espera fue legendaria");

        } else if (respuesta.equals("A")) {
            System.out.println("Incorrecto! Steve no le sabe");

        } else if (respuesta.equals("B")) {
            System.out.println("Incorrecto! Campero");

        } else if (respuesta.equals("D")) {
            System.out.println("Incorrecto! No das ni una");

        } else {
            System.out.println("Respuesta no valida, debes elige A, B, C, D");
            
           } 
        }
}
