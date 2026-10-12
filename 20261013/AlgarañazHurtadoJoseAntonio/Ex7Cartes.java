/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex7cartes;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author José Antonio
 */
public class Ex7Cartes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner scan = new Scanner(System.in);
        int numCarta, palo;
        String palUsuario, textoPalo=null;
        char letra;

        numCarta = aleatorio.nextInt(1, 15);
        palo = aleatorio.nextInt(1, 5);

        System.out.println(numCarta);
        System.out.println(palo);

        switch (palo) {
            case 1:
                textoPalo = "PICAS";
                break;
            case 2:
                textoPalo = "TREBOL";
                break;
            case 3:
                textoPalo = "CORAZONES";
                break;
            case 4:
                textoPalo = "DIAMANTES";
                break;
            default:
                break;
        }
        System.out.println("Ha salido " + numCarta+" de "+textoPalo);
    }

}
