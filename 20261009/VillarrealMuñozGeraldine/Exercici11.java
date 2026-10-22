/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici11;

import java.util.Scanner;
/**
 *
 * @author gvi6123
 */
public class Exercici11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
                
        int horaInici, durada;
        
        System.out.println("introdueix l'hora d'inici (0-23)");
        horaInici=sc.nextInt();
        
        System.out.println("Introdueix la durada del servei en minuts");
        durada=sc.nextInt();
        
        if (horaInici>=8 && horaInici<=20 && durada<=120)
            {  
            System.out.println("Servei acceptat. S'ha publicat correctament al cataleg.");
            }
        else
            {
          if (horaInici>=8 && horaInici <=20 && durada> 120)
            {
              System.out.println("Error. La durada del servei no pot superar els 120 minuts.");
            }
          else if (horaInici<8 || horaInici>20 && durada <=120)
            {
              System.out.println("Error: L'hora d'inici ha d'estar entre les 8h i les 20h");   
            } 
          else
            {
                System.out.println("Error: L'hora i la durada introduïdes no són vàlides");
            }
        }    
        
    }
    
}
