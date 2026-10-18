/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exadivinarnumerobucle;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author José Antonio
 */
public class ExAdivinarNumeroBucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numUsuario, numRandom, intentos = 0;
        boolean CercaDeDiez = false;
        Random aleatorio = new Random();
        Scanner scan = new Scanner(System.in);

        numRandom = aleatorio.nextInt(1, 100);
        System.out.println(numRandom);

        System.out.println("Intenta adivinar el numero: ");
        do {

            numUsuario = scan.nextInt();

            if (numUsuario >= 1 && numUsuario <= 100) {
                ++intentos;
                if ((numUsuario < numRandom + 10 && numUsuario > numRandom) || (numUsuario > numRandom - 10 && numUsuario < numRandom)) {
                    System.out.println("Estas cerca!!!");

                }

                if (numRandom > numUsuario) {

                    System.out.println("El numero es m?s grande.");

                } else if (numRandom < numUsuario) {

                    System.out.println("El numero es mas peque?o.");

                } else {
                    System.out.println("Felicidades haz adivinado el numero!!!");
                    System.out.println("Lo haz adivinado en: " + intentos + " intentos");

                }

            } else {
                System.out.println("El numero introducido no esta en el rango pedido.");

            }
        } while ((numRandom != numUsuario) && intentos < 5);
        if (numRandom!=numUsuario) {
            System.out.println("Has pasado la cantidad de intentos");
        }

    }
}
