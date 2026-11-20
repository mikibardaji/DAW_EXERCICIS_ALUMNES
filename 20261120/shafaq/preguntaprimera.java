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
public class preguntaprimera {
    
    // Mètode 1: Mostra la pregunta, llegeix la resposta completa i la retorna en maj?scules
    public static String preguntaPrimera() {
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
                System.out.println("Correcto! Has contado las letras como un auténtico maestro chocolatero!");
                break;

            case "12":
                System.out.println("Incorrecto (12). Te has emocionado contando! Acaso estabas pensando en una caja de bombones?");
                break;

            case "5":
                System.out.println("Incorrecto (5). Te has comido media palabra antes de empezar a contar!");
                break;

            case "0":
                System.out.println("Incorrecto (0). Cero letras? ?Eso es porque ya te has comido todo el chocolate!");
                break;

            default:
                System.out.println("Opcion no valida. Recuerda escribir una de las respuestas posibles (12, 9, 5 o 0), no la letra.");
                break;
        }
    }
    
}
    
