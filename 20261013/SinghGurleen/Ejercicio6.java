/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package classe.Ejercicio6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gurleen
 */
public class Ejercicio6 {

    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);

        Random ale = new Random();

        char jugador,ordenador;

        int num;

        System.out.print("Tria la teva jugada (S: Pedra, P: Paper, T: Tisora): ");
        jugador = teclado.next().charAt(0);

        num = ale.nextInt(1, 4);

        if (num == 1)
        {
            ordenador = 'S';

            System.out.println("L'ordinador ha triat: Pedra");
        }
        else if (num == 2)
        {
            ordenador = 'P';
            System.out.println("L'ordinador ha triat: Paper");
        }
        else
        {
            ordenador = 'T';
            System.out.println("L'ordinador ha triat: Tisora");
        }
        if (jugador == ordenador)
        {
            System.out.println("Resultat: Empat!");
        }
        else if (jugador == 'S' && ordenador == 'T')
        {
            System.out.println("Resultat: Has guanyat tu!");
        }
        else if (jugador == 'P' && ordenador == 'S')
        {
            System.out.println("Resultat: Has guanyat tu!");
        }
        else if (jugador == 'T' && ordenador == 'P')
        {
            System.out.println("Resultat: Has guanyat tu!");
        }
        else
        {
            System.out.println("Resultat: Ha guanyat l'ordinador!");

        }
        System.out.println("Tret" + jugador );
        System.out.println("Tret" + ordenador);
    }

}
