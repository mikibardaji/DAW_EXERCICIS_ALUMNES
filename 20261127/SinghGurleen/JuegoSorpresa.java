/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe.MetodosJuego;

/**
 *
 * @author gurleen
 */
public class JuegoSorpresa {
    
 public static void main(String[] args) {

        int dinero = 1000;
        String respuesta = "SI";

        while (respuesta.equalsIgnoreCase("SI") && dinero > 0) {

            System.out.println("Tienes " + dinero + " euros");

            int numero = MetodosJuego.pedirNumero();
            int apuesta = MetodosJuego.pedirDineroApuesta(dinero);

            dinero = dinero - apuesta;

            int bola = MetodosJuego.caidaBola();
            System.out.println("Ha salido el numero " + bola);

            if (MetodosJuego.eresGanador(bola, numero)) 
                {
                int premio = MetodosJuego.ganancias(apuesta, numero);
                dinero = dinero + premio;
                System.out.println("Has ganado " + premio + " euros");
                } 
            else 
                {
                System.out.println("Has perdido");
                }

            System.out.println("Tienes " + dinero + " euros");

            MetodosJuego.pintaAsteriscos(bola);

            if (dinero > 0) 
                {
                respuesta = MetodosJuego.seguirJugando();
                } 
            else 
                {
                System.out.println("Te has quedado sin dinero");
                respuesta = "NO";
                }
        }

        System.out.println("Te vas a casa con " + dinero + " euros");
    }
}

