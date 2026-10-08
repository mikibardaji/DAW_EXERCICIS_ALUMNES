/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej10condicionales;

import java.util.Scanner;

/**
 *
 * @author cescs
 */
public class Ej10Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String correo = null;
        String centro = null;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime tu correo de estudiante");
        correo = teclado.nextLine();
        System.out.println("Ahora dime donde estudias");
        centro = teclado.nextLine();
        if (centro.equalsIgnoreCase("universitat")&&correo.endsWith(".edu")||correo.endsWith(".cat")) {
            System.out.println("Correu oficial validat.");
        }else if (centro.equalsIgnoreCase("institut")&&correo.endsWith(".es")||correo.endsWith(".cat")) {
            System.out.println("Correu oficial validat.");
        }else {
            System.out.println("Error: L'extensió no correspon al teu centre d'estudis.");
        }
    }
    
}
