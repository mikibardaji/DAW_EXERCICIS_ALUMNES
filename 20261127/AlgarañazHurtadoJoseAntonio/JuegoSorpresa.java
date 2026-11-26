/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegosorpresa;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class JuegoSorpresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeroJugador, numRandom, dinero = 1000, dineroGanado = 0, dineroApostado = 0, dineroTotalGanado=0;
        char puedeJugar, seguirPartida;
        boolean jugar = false, ganadorTirada = false;
        Scanner scan = new Scanner(System.in);

        do {

            numeroJugador = funcionesRuleta.pedirNumero();
            System.out.println("Numero= " + numeroJugador);

            numRandom = funcionesRuleta.caidaBola();
            System.out.println("Numero random: " + numRandom);

            System.out.println("Quieres eguir jugando?: ");
            puedeJugar = scan.next().charAt(0);

            jugar = funcionesRuleta.puedesJugar(puedeJugar, dinero);
            if (jugar == true) {

                dineroApostado = funcionesRuleta.pedirDineroApuesta(dinero);
                ganadorTirada = funcionesRuleta.eresGanador(numRandom, numeroJugador);
                if (ganadorTirada == true) {

                    dineroGanado = funcionesRuleta.ganancias(dineroApostado, numeroJugador);
                    System.out.println("Has ganado: " + dineroGanado);
                    dineroTotalGanado+=dineroGanado;
                    dinero+=dineroGanado;
                    

                } else {
                    System.out.println("Lastima. Otra vez será....");
                    dinero-=dineroApostado;

                }

            } else {
                System.out.println("No cumple requisitos...");

            }
            funcionesRuleta.pintaAsteriscos(numeroJugador);

            seguirPartida = funcionesRuleta.seguirJugando();
            System.out.println("Dinero actual: "+dinero);
        } while (seguirPartida != 'n' && seguirPartida != 'N');
        System.out.println("Saliendo de la partida...");
        System.out.println("Has ganado en total: "+dineroTotalGanado+"€");
        System.out.println("Tienes: " + dinero + "€ en tu cuenta");

    }

}
