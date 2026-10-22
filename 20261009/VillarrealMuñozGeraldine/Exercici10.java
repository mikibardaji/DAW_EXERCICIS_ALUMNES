/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici10;

import java.util.Scanner;
/**
 *
 * @author gvi6123
 */
public class Exercici10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String correu,lloc,extensio;
        //Mostrar
        System.out.println("Introdueix el teu correu(sense l'extensió)");
        //Esperar
        correu=sc.nextLine();
        //Mostrar
        System.out.println("Introdueix el teu lloc d'estudis (Universitat o Institut)");
        //Esperar
        lloc=sc.nextLine();
        //Mostrar
        System.out.println("Introdueix l'extensió del correu (per exemple .edu o .cat)");
        //Esperar
        extensio=sc.nextLine();
        
        if((lloc.equalsIgnoreCase("Universitat")&& (extensio.equalsIgnoreCase(".edu")|| extensio.equalsIgnoreCase(".cat")))
            ||(lloc.equalsIgnoreCase("Institut")&& (extensio.equalsIgnoreCase(".es")|| extensio.equalsIgnoreCase(".cat"))))
            {
            System.out.println("Correu oficial validat"); 
            }
        else
            {
        System.out.println("Error: L'extensió no correspon al teu centre d'estudis");
            }
    }
    
}
