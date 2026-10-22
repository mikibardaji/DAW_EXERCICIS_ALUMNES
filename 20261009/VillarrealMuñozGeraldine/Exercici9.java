/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici9;

import java.util.Scanner;
/**
 *
 * @author gvi6123
 */
public class Exercici9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String franja;
        String servei;
        //Mostrar
        System.out.println("Introdueix la franja (Mati o Tarda)");
        //Esperar
        franja=teclado.nextLine();
        //Mostrar
        System.out.println("Introdueix la modalitat (Online o Presencial)");
        //Esperar
        servei=teclado.nextLine();
        
        if ((franja.equalsIgnoreCase("Mati")&& servei.equalsIgnoreCase("Online"))||(franja.equalsIgnoreCase("Tarda")&& servei.equalsIgnoreCase("Presencial")))
            {
            System.out.println("Reserva confirmada amb l'expert");
            }
        else
            {
            System.out.println("L'expert no està disponible en aquesta franja per a aquesta modalitat");   
            }
    }
    
}
