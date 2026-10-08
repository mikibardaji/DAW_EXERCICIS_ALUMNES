/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2condicionales;

import java.util.Scanner;

/**
 *
 * @author cescs
 */
public class Ej2Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String decision = null;
        String servicio = null;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime si quieres el servicio online o presencial:");
        decision = teclado.nextLine();
        if (decision.equalsIgnoreCase("online")) {
            System.out.println("Ahora pon el enlace del servicio");
            servicio = teclado.nextLine();
            System.out.println("Servei configurat. Enllaç desat.");
        }else if (decision.equalsIgnoreCase("presencial")) {
            System.out.println("Ahora di en que aula o sitio de encuentro sera el servicio");
            servicio = teclado.nextLine();
            System.out.println("Servei configurat. Punt de trobada desat.");
        }else {
            System.out.println("Esto no es un parametro aceptado");
        }
    }
    
}
