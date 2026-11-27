/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegosorpresa;

/**
 *
 * @author andca
 */
public class JuegoSorpresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dinero = 1000;
        String respuesta = "SI";

        while (respuesta.equalsIgnoreCase("SI") && dinero > 0) {

            System.out.println("Tienes " + dinero + " euros.");

            int numero = LibreriaJuego.pedirNumero();
            int apuesta = LibreriaJuego.pedirDineroApuesta(dinero);

            dinero = dinero - apuesta;

            int bola = LibreriaJuego.caidaBola();
            System.out.println("Ha salido el numero " + bola);

            if (LibreriaJuego.eresGanador(bola, numero)) 
                {
                int premio = LibreriaJuego.ganancias(apuesta, numero);
                dinero = dinero + premio;
                System.out.println("Has ganado " + premio + " euros.");
            } 
            else 
            {
                System.out.println("Has perdido!!!");
            }

            System.out.println("Tienes " + dinero + " euros.");

            LibreriaJuego.pintaAsteriscos(bola);

            if (dinero > 0) 
            {
                respuesta = LibreriaJuego.seguirJugando();
            } 
            else 
            {
                System.out.println("Te has quedado sin dinero!!!");
                respuesta = "NO";
            }
        }

        System.out.println("Te vas a casa con " + dinero + " euros.");

    }
    
}
