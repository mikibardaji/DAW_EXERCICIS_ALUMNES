/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package classe.libreria;

import java.util.Scanner;

/**
 *
 * @author gurleen
 */
public class Libreria {

    public static void main(String[] args)
    {
      String respuesta = preguntaPrimera();
        respuestaPrimera(respuesta);

    }

    public static String preguntaPrimera() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuál es el animal más rápido del mundo?");
        System.out.println("A. León");
        System.out.println("B. Guepardo");
        System.out.println("C. Tigre");
        System.out.println("D. Caballo");

        System.out.print("Elige una respuesta: ");
        String respuesta = teclado.nextLine();

        return respuesta.toUpperCase();
    }

    public static void respuestaPrimera(String respuesta) {

        if (respuesta.equals("B")) {
            System.out.println("¡Muy bien! Esa es la respuesta correcta.");

        } else if (respuesta.equals("A")) {
            System.out.println("No, esa no es. El león no es el más rápido.");

        } else if (respuesta.equals("C")) {
            System.out.println("Incorrecto, el tigre tampoco es el más rápido.");

        } else if (respuesta.equals("D")) {
            System.out.println("No es esa. El caballo corre rápido, pero no es el primero.");

        } else {
            System.out.println("Esa respuesta no vale. Prueba con A, B, C o D.");
        }
    }
}
