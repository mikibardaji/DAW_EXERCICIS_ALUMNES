/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex10validació.del.correu.oficial.el.registre.conswitch;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ex10ValidacióDelCorreuOficialElRegistreConswitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // VARIABLES
        String correu;
        String llocEstudis;
        String extensio;

        // MOSTRAR
        System.out.print("Introdueix el teu correu electronic: ");

        // ESPERAR
        correu = sc.nextLine().trim();

        // MOSTRAR
        System.out.print("Introdueix el teu lloc d'estudis (Universitat/Institut): ");

        // ESPERAR
        llocEstudis = sc.nextLine().trim();

        // MOSTRAR
        System.out.print("Introdueix l'extensio (.edu/.cat/.es): ");

        // ESPERAR
        extensio = sc.nextLine().trim();

        // CALCULAR
        switch (llocEstudis.toLowerCase()) {

              case "universitat" -> {
                  if (extensio.equalsIgnoreCase(".edu")
                          || extensio.equalsIgnoreCase(".cat")) {
                      
                      System.out.println("Correu oficial validat.");
                      
                  } else {
                      
                      System.out.println("Error: L'extensio no correspon al teu centre d'estudis.");
                  }
            }

            case "institut" -> {
                if (extensio.equalsIgnoreCase(".es")
                        || extensio.equalsIgnoreCase(".cat")) {

                    System.out.println("Correu oficial validat.");

                } else {

                    System.out.println("Error: L'extensio no correspon al teu centre d'estudis.");
                }
            }

            default -> System.out.println("Lloc d'estudis no valid.");
        }
    }
}
    
