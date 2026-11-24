/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package millonario;

import java.util.Scanner;

/**
 *
 * @author gba0006
 */
public class PreguntasBarea {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        // 1. Mostramos la pregunta
        preguntaPrimero();
        
        // 2. Guardamos el resultado (1 si acierta, 0 si falla)
        int resultado = respostaPrimero();
        
        // 3. Mostramos el 0 o el 1 por pantalla
        System.out.println("Puntos obtenidos: " + resultado);
    }

    // Cambiamos 'String' por 'int' para que devuelva 0 o 1
    // Quitamos el par?metro 'String resp' porque ya lo pides dentro con Scanner
    public static int respostaPrimero() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tu respuesta: ");
        String resp = sc.nextLine();
        
        int acierto = 0; // Por defecto vale 0 (fallo)

        if (resp.equalsIgnoreCase("a")) {
            System.out.println("NO, ella es la segunda mejor :(");
        } else if (resp.equalsIgnoreCase("b")) {
            System.out.println("Has acertado!!");
            acierto = 1; // Cambiamos a 1 porque ha acertado
        } else if (resp.equalsIgnoreCase("c")) {
            System.out.println("NO, ella es la tercera mejor :(");
        } else if (resp.equalsIgnoreCase("d")) {
            System.out.println("NO, ella es la cuarta mejor :(");
        } else {
            System.out.println("Opción no v?lida.");
        }

        return acierto; // Devuelve 1 o 0 al main
    }

    public static void preguntaPrimero() {
        System.out.println("Primera pregunta:");
        System.out.println("?Cu?l es la mejor patinadora en el mundo actualmente?");
        System.out.println("Opciones:\n"
                + "A) Sira Bella (Catalana)\n"
                + "B) Madalena Costa (Portuguesa)\n"
                + "C) Elna Francés (Catalana)\n"
                + "D) Martina Stefani (Catalana)");
    }
}
