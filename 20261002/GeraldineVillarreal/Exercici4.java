/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici4;

import java.util.Scanner;
/**
 *
 * @author geral
 */
public class Exercici4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int serveis;
       Scanner scan=new Scanner (System.in);
       System.out.println("Introdueix el nombre de serveis que oferiràs:");
       serveis=scan.nextInt();
       
       if (serveis>=3)
         {
             System.out.println("Has rebut 100 crèdits de benvinguda.");
         }   
       else if (serveis ==1 || serveis==2)
         {
             System.out.println("Has rebut 50 crèdits de benvinguda.");
         }
       else
         {
             System.out.println("Has rebut 10 crèdits de benvinguda.");
         }
    }
    
}
