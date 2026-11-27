/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegosorpresa;

import static juegosorpresa.MetodosJuego.ganancias;

/**
 *
 * @author mabardaji
 */
public class JuegoSorpresa {

    /**
     * Crear el joc de la ruleta Comences amb 1000 € Demanarà quina aposta vols
     * Demanes quants diners vols apostar Es tira la bola Calcula els guanys Es
     * sumen als diners de la cartera Et demana si vols continuar o no Si vols
     * continuar i tens diners tornes al principi En qualsevol altre cas,
     * s'acaba el joc i mostres amb quants diners ten vas a casa.
     *
     */
    public static void main(String[] args) {
        final int DINERO_INICIAL = 1000;
        int cartera = DINERO_INICIAL;
        int numeroApostado, dineroApostado, bola, ganancias;
        char seguir;
        String seguirString = "";
        do {
            numeroApostado = MetodosJuego.pedirNumero();
            dineroApostado = MetodosJuego.pedirDineroApuesta(cartera);
            //  System.out.println(numeroApostado + " apostado " + dineroApostado);

            bola = MetodosJuego.caidaBola();
            System.out.println("Te juegas " + dineroApostado + "€ al numero " + numeroApostado);
            MetodosJuego.pintaAsteriscos(bola);
            if (MetodosJuego.eresGanador(bola, numeroApostado)) {
                System.out.println("Has ganado");
                ganancias = MetodosJuego.ganancias(dineroApostado, numeroApostado);
                cartera += ganancias;
            } else {
                System.out.println("Has perdido " + dineroApostado + " € ");
                cartera -= dineroApostado;
            }

            System.out.println("En la cartera tienes " + cartera + " € ");
            seguir = MetodosJuego.seguirJugando();
            seguirString = String.valueOf(seguir);
        } while (MetodosJuego.puedesJugar(seguirString, cartera));
    }

}
