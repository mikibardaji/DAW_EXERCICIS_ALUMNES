/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercisis1009;

import java.util.Scanner;

/**
 *
 * @author gba0006
 */
public class ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int hora,durada;
       
        System.out.println("Quina és l'hora d'inici?");  
        hora = teclado.nextInt();

        System.out.println("Quina és la durada del servei en minuts?");
        durada = teclado.nextInt();

        if ((hora >= 8) && (hora <= 20) && (durada <= 120))
        {System.out.println("Servei acceptat. S'ha publicat correctament al cat?leg.");}
        else if ((hora < 8 || hora > 20) && (durada <= 120))
        {System.out.println("Error: L'hora d'inici ha d'estar entre les 8h i les 20h.");}
        else if ((hora >= 8) ||      (hora <= 20) && (durada > 120))
        {System.out.println("Error: La durada del servei no pot superar els 120 minuts.");}
        else
        {System.out.println("Error: L'hora i la durada introdu?des no són v?lides.");}
}
}
