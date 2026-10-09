/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercisis1009;

import java.util.Scanner;

/**
 *
 * @author gba0006
 */
public class ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String correu, llocEstudis, frase=null;
        Scanner scan=new Scanner (System.in);
        System.out.println("Introdueix el teu correu electronic: ");
        correu=scan.nextLine();
        System.out.println("Estas a la Universitat o en un Institut?: ");
        llocEstudis=scan.nextLine();
        if (llocEstudis.equalsIgnoreCase("Universitat") && correu.endsWith(".edu")|| correu.endsWith(".cat")) {
            
            frase="Correu oficial validat.";
            
        }else if (llocEstudis.equalsIgnoreCase("Institut") && correu.endsWith(".es")|| correu.endsWith(".cat")) {
            frase="Correu oficial validat.";
            
        }else{
            frase="Error: L'extensió no correspon al teu centre d'estudis.";
        
        }
        System.out.println(frase);
}
}
