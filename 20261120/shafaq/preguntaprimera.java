/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shafaq;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class preguntaprimera shafaq {
    
    // Mètode 1: Mostra la pregunta, llegeix la resposta completa i la retorna en maj?scules
    public static String preguntaPrimerashafaq() {
        Scanner sc = new Scanner(System.in);
        String resposta;

        System.out.println("Cuantas letras tiene la palabra chocolate?");
        System.out.println("A. 12");
        System.out.println("B. 9");
        System.out.println("C. 5");
        System.out.println("D. 0");
        System.out.print("Escribe el numero (no la letra): ");

        // Llegeix tota la resposta i la converteix a maj?scules
        resposta = sc.nextLine().toUpperCase();
        return resposta;
    }

    // Mètode 2: Rep la resposta i comprova si és correcta o mostra un missatge divertit
    public static void respostaPrimera(String resposta) {
        // Assegurem que estigui en maj?scules vingui com vingui d'entrada
        String respostaMajuscules = resposta.toUpperCase();

        switch (respostaMajuscules) {
           case "9":
            case "NUEVE":
                System.out.println("Correcto! Has contado como un maestro chocolatero!");
                return 1;

            case "12":
                System.out.println("Incorrecto! Te has emocionado contando!");
                return 0;

            case "5":
                System.out.println("Incorrecto! Te has comido media palabra!");
                return 0;

            case "0":
                System.out.println("Cero letras? Te has comido todo el chocolate!");
                return 0;

            default:
                System.out.println("Opcion no valida. Escribe 12, 9, 5 o 0.");
                return 0;
        }
    }
    
}
    
