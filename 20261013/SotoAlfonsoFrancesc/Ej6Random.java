/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej6random;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author cescs
 */
public class Ej6Random {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String decision;
        char letra;
        int rival;
        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Diguem que tries (S:pedra, A:paper, T:tisora):");
        letra = teclado.next().charAt(0);
        rival = aleatorio.nextInt(1,4);
        if (letra == 'S') {
            switch (rival) {
                case 1:
                    System.out.println("Tu has triat Pedra");
                    System.out.println("El rival ha triat Pedra");
                    System.out.println("Resultat: EMPAT");
                    break;
                case 2:
                    System.out.println("Tu has triat Pedra");
                    System.out.println("El rival ha triat Paper");
                    System.out.println("Resultat: HAS PERDUT");
                    break;
                case 3:
                    System.out.println("Tu has triat Pedra");
                    System.out.println("El rival ha triat Tisora");
                    System.out.println("Resultat: HAS GUANYAT");
                    break;
                default:
                    break;
            }
        }else if (letra == 'A') {
            switch  (rival) {
                case 1:
                    System.out.println("Tu has triat Paper");
                    System.out.println("El rival ha triat Pedra");
                    System.out.println("Resultat: HAS GUANYAT");
                    break;
                case 2:
                    System.out.println("Tu has triat Paper");
                    System.out.println("El rival ha triat Paper");
                    System.out.println("Resultat: EMPAT");
                    break;
                case 3:
                    System.out.println("Has triat Paper");
                    System.out.println("El rival ha triat Tisora");
                    System.out.println("Resultat: HAS PERDUT");
                    break;
                default:
                    break;
            }
        }else if (letra == 'T') {
            switch  (rival) {
                case 1:
                    System.out.println("Tu has triat Tisora");
                    System.out.println("El rival ha triat Pedra");
                    System.out.println("Resultat: HAS PERDUT");
                    break;
                case 2:
                    System.out.println("Tu has triat Tisora");
                    System.out.println("El rival ha triat Paper");
                    System.out.println("Resultat: HAS GUANYAT");
                    break;
                case 3:
                    System.out.println("Tu has triat Tisora");
                    System.out.println("El rival ha triat Tisora");
                    System.out.println("Resultat: EMPAT");
                    break;
                default:
                    break;
            }
        }else {
            System.out.println("Aixo no es una eleccio valida");
        }
    }
    
}
