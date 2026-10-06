/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici2;

import java.util.Scanner;
/**
 *
 * @author geral
 */
public class Exercici2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        String modalitat, enllaç, lloc;
        Scanner scan=new Scanner (System.in);
        
        System.out.println("Quina modalitat prefereixes? (Online/Presencial):");
        modalitat=scan.nextLine();
        
        if(modalitat.equalsIgnoreCase("Online"))
          {
              System.out.println("Introdueix l'enllaç de Dircord/Meet");
              enllaç=scan.nextLine();
              System.out.println("Servei configurat. Enllaç desat.");
          }
        else if (modalitat.equalsIgnoreCase("Presencial"))
          {
              System.out.println("Introdueix l'aula o lloc de trobada:");
              lloc=scan.nextLine();
              System.out.println("Servei configurat.Punt de trobada desat.");
          }
        else
          {
              System.out.println("Modalitat no vàlida. Has d'escriure Online o Presencial");
          }
        
    }
    
}
