/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex11validaciódeduradaifranja;

import java.util.Scanner;

/**
 *
 * @author saihb
 */
public class Ex11ValidacióDeDuradaiFranja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int hora, duracion;
      
        System.out.println("Introduce hora de inicio");
        hora = sc.nextInt();
        
        System.out.println("Introduce la duracion en minutos");
        duracion = sc.nextInt();
        
       if (hora >= 8 && hora <= 20 && duracion <= 120){
           System.out.println("Servei acceptat. S'ha publicat correctament al catàleg.");
       }
       else if ((hora < 8 || hora > 20) && duracion <= 120){
           System.out.println("Error: L'hora d'inici ha d'estar entre les 8h i les 20h.");
       }
       else if (hora >= 8 && hora <= 20 && duracion > 120){
           System.out.println("Error: La durada del servei no pot superar els 120 minuts.");
       }
       else{
           System.out.println("Error: L'hora i la durada introduïdes no són vàlides.");
       }
       
       
       
    }
    
}
