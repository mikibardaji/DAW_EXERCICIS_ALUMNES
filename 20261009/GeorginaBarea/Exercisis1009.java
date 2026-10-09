/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercisis1009;

import java.util.Scanner;

/**
 *
 * @author gba0006
 */
public class Exercisis1009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String modalitat, frase=null, enlace, lugar;
        System.out.println("Prefereixes clases Online o Presencials?: ");
        modalitat=teclado.nextLine();
        if (modalitat.equalsIgnoreCase("Online")) {
            System.out.println("Introdueix l'enlla? de Meet/Discord: ");
            enlace=teclado.nextLine();
            frase="Servei configurat. Enlla? guardat";          
            
        }else if (modalitat.equalsIgnoreCase("Presencial")) {
            System.out.println("Introdueix l'ubicacio on es: ");
            lugar=teclado.nextLine();
            frase="Serveix configurat. Ubicacio guardada";
            
            
        }

        System.out.println(frase);
    }
    
}
