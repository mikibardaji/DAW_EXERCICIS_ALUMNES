/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej9condicionales;

import java.util.Scanner;

/**
 *
 * @author cescs
 */
public class Ej9Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String horario = null;
        String actividad = null;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime en que horario te vendria bien el servicio: ");
        horario = teclado.nextLine();
        System.out.println("Dime si lo quieres presencial o online");
        actividad = teclado.nextLine();
        if (horario.equalsIgnoreCase("mati")&&actividad.equalsIgnoreCase("online")) {
            System.out.println("Reserva confirmada amb l'expert.");
        }else if (horario.equalsIgnoreCase("tarda")&&actividad.equalsIgnoreCase("presencial")) {
            System.out.println("Reserva confirmada amb l'expert.");
        }else {
            System.out.println("L'expert no està disponible en aquesta franja per a aquesta modalitat.");
        }
    }
    
}
