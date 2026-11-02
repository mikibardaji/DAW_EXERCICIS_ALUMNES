/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exiageneracontraseña;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author José Antonio
 */
public class ExIAGeneraContraseña {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int opcion;

        do {

            System.out.println("\n===== GENERADOR DE CONTRASEÑAS =====");
            System.out.println("1. Generar contraseña");
            System.out.println("2. Comprobar contraseña");
            System.out.println("3. Generar PIN aleatorio");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");

            try {

                opcion = teclado.nextInt();

                switch (opcion) {

                    case 1:

                        System.out.print("Longitud de la contraseña: ");
                        int longitud = teclado.nextInt();

                        if (longitud < 4 || longitud > 30) {

                            System.out.println("La longitud debe estar entre 4 y 30.");

                        } else {

                            String caracteres
                                    = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "abcdefghijklmnopqrstuvwxyz"
                                    + "0123456789";

                            String contrasena = "";

                            for (int i = 0; i < longitud; i++) {

                                int posicion = aleatorio.nextInt(
                                        caracteres.length()
                                );

                                contrasena += caracteres.charAt(posicion);
                            }

                            System.out.println("Tu contraseña es: " + contrasena);
                        }

                        break;

                    case 2:

                        System.out.print("Introduce una contraseña: ");
                        String texto = teclado.next();

                        if (texto.length() >= 12) {

                            System.out.println("Contraseña larga.");

                        } else if (texto.length() >= 8) {

                            System.out.println("Contraseña de longitud media.");

                        } else {

                            System.out.println("Contraseña demasiado corta.");
                        }

                        break;

                    case 3:

                        int pin = aleatorio.nextInt(9000) + 1000;

                        System.out.println("Tu PIN aleatorio es: " + pin);

                        break;

                    case 4:

                        System.out.println("Saliendo del programa...");

                        break;

                    default:

                        System.out.println("Opción incorrecta.");

                }

            } catch (Exception e) {

                System.out.println("Error: introduce un valor numérico.");

                teclado.nextLine();

                opcion = 0;
            }

        } while (opcion != 4);

        teclado.close();

    }

}
