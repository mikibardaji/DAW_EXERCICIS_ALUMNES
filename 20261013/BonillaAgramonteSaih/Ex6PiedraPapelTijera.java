/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex6piedrapapeltijera;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author saihb
 */
public class Ex6PiedraPapelTijera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random dan = new Random();
        Scanner sc = new Scanner(System.in);
        int alea;
        String jugada;

        alea = dan.nextInt(1, 4);
        System.out.println("Que elijes (piedra, papel o tijera)");
        jugada = sc.nextLine();

        if (alea == 1) {
            System.out.println("El Ordenador ha elegido piedra");
        } else if (alea == 2) {
            System.out.println("El ordenador ha elegido papel");
        } else {
            System.out.println("El ordenador ha elegido tijera");
        }

        if ((jugada.equalsIgnoreCase("Piedra") && alea == 3)
                || (jugada.equalsIgnoreCase("papel") && alea == 1)
                || (jugada.equalsIgnoreCase("tijera") && alea == 2)) {
            System.out.println("Has ganado");
        } else if ((jugada.equals("piedra") && alea == 1)
                || (jugada.equals("papel") && alea == 2)
                || (jugada.equals("tijera") && alea == 3)){
            System.out.println("Empate");
        } else {
            System.out.println("Gano el ordenador");
        }

        
        
        
    }

}
