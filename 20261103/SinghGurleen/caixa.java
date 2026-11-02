/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package classe.caixa;

import java.util.Scanner;

/**
 *
 * @author gurleen
 */
public class caixa {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double total = 0;
        double precio = 0;
        String entrada;

        do {
            System.out.println("Introdueix un preu (0 per finalitzar):");
            entrada = teclado.nextLine();

try {
                precio = Double.parseDouble(entrada);

                total = total + precio;

            } catch (NumberFormatException ex) {
                System.out.println("Error de format. Operació cancel·lada per seguretat.");

                precio = 0;
            }

        } while (precio != 0);

        System.out.println("El total es: " + total);
    }
}


