/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication18;
import java.util.Scanner;

/**
 *
 * @author dor2191
 */
public class OrtegaDaniel {

    /**
     * @param args the command line arguments
     */
    public static String PrimeraPregunta() {
 Scanner teclat = new Scanner(System.in);
        System.out.println("Contra quin equip va guanyar el Real Madrid 'La Décima' l'any 2014?");
        System.out.println("A) Juventus");
        System.out.println("B) Atlético de Madrid");
        System.out.println("C) Liverpool");
        System.out.println("D) Bayern de Múnic");
        System.out.print("Escriu la lletra: ");

        String resposta = teclat.nextLine().toUpperCase();

        return resposta;
    }
  public static int respostaPrimera(String resposta){

      switch (resposta) {
            case "A": 
                System.out.println("¡Correcte! Al minut 93 amb aquell famós cop de cap de Sergio Ramos a Lisboa.");
                return 1;
            
                

            case "B":
                System.out.println("Incorrecte! A la Juventus li van guanyar 'La Duodécima' a Cardiff el 2017 (i la Setena el 1998).");
                return 0;
            
                

            case "C":
                System.out.println("Incorrecte! Al Liverpool li han guanyat dues finals modernes (2018 i 2022), però no va ser la desena.");
                return 0;
            
                

            case "D": 
                System.out.println("Incorrecte! El Bayern va caure a les semifinals d'aquell mateix any (0-4 a Munic), però no va arribar a la final.");
                return 0;
            
                

            default: System.out.println("Opció no vàlida! Has escrit un equip que no toca o només has posat la lletra de l'opció.");
            return 0;
          
                
        }
  }
}
