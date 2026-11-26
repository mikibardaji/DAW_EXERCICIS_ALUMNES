/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegosorpresa;

/**
 *
 * @author mabardaji
 */
public class JuegoSorpresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int dinero = 100;
    char respuesta = 's';

    while (Libreriajuegossopresa.puedesJugar(respuesta, dinero)) {
        System.out.println("Tienes " + dinero + " euros");

        int apuesta = Libreriajuegossopresa.pedirDineroApuesta(dinero);
        int numero = Libreriajuegossopresa.pedirNumero();
        int bola = Libreriajuegossopresa.caidaBola();

        System.out.println("Ha salido el " + bola);

        if (Libreriajuegossopresa.eresGanador(bola, numero)) {
            int premio = Libreriajuegossopresa.ganancias(apuesta, numero);
            dinero = dinero + premio;
            System.out.println("Has ganado " + premio + " euros");
        } else {
            dinero = dinero - apuesta;
            System.out.println("Has perdido " + apuesta + " euros");
        }

        if (dinero > 0) {
            respuesta = Libreriajuegossopresa.seguirJugando();
        }
    }

    System.out.println("Fin del juego. Te quedan " + dinero + " euros");
}
}
   
