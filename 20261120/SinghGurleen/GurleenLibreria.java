/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreria;

import java.util.Scanner;

/**
 *
 * @author gsi6215
 */
public class GurleenLibreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
           String respuesta = preguntaPrimera();
        
        // Recollim el 1 o el 0 que retorna el m?tode
        int puntos = respuestaPrimera(respuesta);
        
        System.out.println("Puntos obtenidos: " + puntos);
    }

    public static String preguntaPrimera() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("?Cuál es el animal más rápido del mundo?");
        System.out.println("A. León");
        System.out.println("B. Guepardo");
        System.out.println("C. Tigre");
        System.out.println("D. Caballo");

        System.out.print("Elige una respuesta: ");
        String respuesta = teclado.nextLine();

        return respuesta.toUpperCase();
    }

    public static int respuestaPrimera(String respuesta) {

        if (respuesta.equals("B")) {
            System.out.println("?Muy bien! Esa es la respuesta correcta.");
            return 1; 

        } else if (respuesta.equals("A")) {
            System.out.println("No, esa no es. El león no es el más rápido.");
            return 0; 

        } else if (respuesta.equals("C")) {
            System.out.println("Incorrecto, el tigre tampoco es el más rápido.");
            return 0;

        } else if (respuesta.equals("D")) {
            System.out.println("No es esa. El caballo corre rápido, pero no es el primero.");
            return 0;

        } else {
            System.out.println("Esa respuesta no vale. Prueba con A, B, C o D.");
            return 0;
        }
    }
}
