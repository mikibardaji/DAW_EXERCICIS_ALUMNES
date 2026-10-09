/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex11.validació.de.durada.i.franja.horària.variables.numèriques.conswitch;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ex11ValidacióDeDuradaIFranjaHoràriaVariablesNumèriquesConswitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        // VARIABLES
        int horaInici, durada, categoria;

        // MOSTRAR
        System.out.print("Introdueix l'hora d'inici (0-23): ");

        // ESPERAR
        horaInici = sc.nextInt();

        // MOSTRAR
        System.out.print("Introdueix la durada del servei en minuts: ");

        // ESPERAR
        durada = sc.nextInt();

        // CALCULAR
        if (horaInici >= 8 && horaInici <= 20 && durada <= 120) {
            categoria = 1;
        } else if ((horaInici < 8 || horaInici > 20) && durada <= 120) {
            categoria = 2;
        } else if (horaInici >= 8 && horaInici <= 20 && durada > 120) {
            categoria = 3;
        } else {
            categoria = 4;
        }

        // MOSTRAR
        switch (categoria) {

            case 1:
                System.out.println("Servei acceptat. S'ha publicat correctament al catàleg.");
                break;

            case 2:
                System.out.println("Error: L'hora d'inici ha d'estar entre les 8h i les 20h.");
                break;

            case 3:
                System.out.println("Error: La durada del servei no pot superar els 120 minuts.");
                break;

            case 4:
                System.out.println("Error: L'hora i la durada introduïdes no són vàlides.");
                break;
        }
    }
}
    
    

