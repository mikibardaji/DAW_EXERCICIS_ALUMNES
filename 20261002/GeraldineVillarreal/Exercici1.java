/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici1;

import java.util.Scanner;
/**
 *
 * @author geral
 */
public class Exercici1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String estat;
        Scanner scan=new Scanner (System.in);
        System.out.println("Introduix l'estat del producte");
        estat=scan.nextLine();
        
        if (estat.equalsIgnoreCase("Nou")||estat.equalsIgnoreCase("Com nou"))
        {
            System.out.println("Producte excel·lent. Es publicarà ràpidament.");
        }
        else
        {
            System.out.println("Producte acceptat per al catàleg.");
        }
    }
    
}
