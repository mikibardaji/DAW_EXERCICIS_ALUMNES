/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package preguntasadam;

import java.util.Scanner;

/**
 *
 * @author aer5219
 */
public class PreguntasAdam {

    public static String preguntaPrimera() {
        Scanner sc = new Scanner(System.in);
        String resposta;
        System.out.println("Quantes champions te el Barça?");
        System.out.println("A. 4");
        System.out.println("B. 5");
        System.out.println("C. 6");
        System.out.println("D. 2");
        System.out.println("-------------------");
        System.out.print("Respon (A,B,C o D): ");
        resposta=sc.nextLine();
        
        return resposta.toUpperCase();
    }

    public static int respostaPrimera(String resposta) {
        if (resposta.equals("B")) {

            System.out.println("Correcte! Tu si que saps de futbol");
            
            return 1;
        } else if (resposta.equals("A")) {

            System.out.println("Incorrecte! Tenien 4 abans del 2015");
            return 0;
        } else if (resposta.equalsIgnoreCase("C")) {

            System.out.println("Incorrecte! Encara no tenen 6, pero aviat si");
            return 0;
        } else if (resposta.equalsIgnoreCase("D")) {

            System.out.println("Incorrecte! Tu no saps de futbol");
            return 0;
        } else {

            System.out.println("Aquesta resposta no és vàlida! Tria una de les quatre opcions (A,B,C o D)");
            return 0;
        }
    }
}
