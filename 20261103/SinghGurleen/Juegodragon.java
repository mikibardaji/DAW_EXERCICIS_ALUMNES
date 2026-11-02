/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package classe.juegodragon;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gurleen
 */
public class juegodragon{

    public static void main(String[] args) {


       Scanner teclado = new Scanner(System.in);

       Random azar = new Random();


       int vidaJugador = 100;

       int vidaDragon = 100;

       int pociones = 3;


       System.out.println("¡Un dragón te ataca! Lucha por tu vida.");

       // el combate sigue mientras los dos estén vivos

       while (vidaJugador > 0 && vidaDragon > 0) {

           System.out.println();

           System.out.println("Tu vida: " + vidaJugador + " | Vida del dragón: " + vidaDragon);

           System.out.println("1. Atacar");

           System.out.println("2. Beber poción (" + pociones + " restantes)");

           System.out.println("3. Ataque especial (40% de acertar)");

           System.out.print("Elige: ");

 

           // si es false, el dragón no ataca este turno

           boolean turnoValido = true;

           try {

               int opcion = teclado.nextInt();

 

               if (opcion == 1) {

                   int dano = azar.nextInt(16) + 10;      // de 10 a 25

                   vidaDragon = vidaDragon - dano;

                   System.out.println("Golpeas al dragón: " + dano + " de daño.");

               } else if (opcion == 2) {

                   if (pociones > 0) {

                       int cura = azar.nextInt(16) + 15;  // de 15 a 30

                       vidaJugador = vidaJugador + cura;

                       pociones = pociones - 1;

                       System.out.println("Bebes una poción: +" + cura + " de vida.");

                   } else {

                       System.out.println("No te quedan pociones.");

                       turnoValido = false;

                   }

               } else if (opcion == 3) {

                   if (azar.nextInt(100) < 40) {          // 40% de acertar

                       vidaDragon = vidaDragon - 45;

                       System.out.println("¡Ataque especial! 45 de daño.");

                   } else {

                       System.out.println("El ataque especial ha fallado.");

                   }

 

               } else {

                   System.out.println("Opción no válida.");

                   turnoValido = false;

               }

 

           } catch (Exception ex) {

               System.out.println("Error: tienes que escribir un número.");

               teclado.nextLine();   // borra lo que se ha escrito mal

               turnoValido = false;

           }

 

           // turno del dragón

           if (turnoValido && vidaDragon > 0) {

               int danoDragon = azar.nextInt(13) + 8;     // de 8 a 20

               vidaJugador = vidaJugador - danoDragon;

               System.out.println("El dragón te ataca: " + danoDragon + " de daño.");

           }

       }

 

       // resultado final

       System.out.println();

       if (vidaJugador > 0) {

           System.out.println("¡Has derrotado al dragón! Eres un héroe.");

       } else {

           System.out.println("El dragón te ha derrotado. Fin del juego.");

       }

   }

}
