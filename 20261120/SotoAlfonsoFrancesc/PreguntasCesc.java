/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jocpreguntas;

import java.util.Scanner;

/**
 *
 * @author fso6590
 */
public class PreguntasCesc {
    
    public static String preguntaPrimera() {
        String respuesta;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Prmera pregunta: ");
        System.out.println("En que posicion se juega comunmente el personaje de lol Jinx");
        System.out.println("A - TOP");
        System.out.println("B - MID");
        System.out.println("C - JUNGLA");
        System.out.println("D - ADC");
        respuesta = teclado.nextLine();
        return respuesta.toUpperCase();
    }

    public static int respostaPrimera(String respuesta) {
        if (respuesta.equals("D")) {
            System.out.println("Felicidades has acertado ");
           return 1;
        }else if (respuesta.equals("A")) {
            System.out.println("Lo siento has fallado");
            return 0;
        }else if (respuesta.equals("B")) {
            System.out.println("Lo siento has fallado");
            return 0;
        }else if (respuesta.equals("C")) {
            System.out.println("Lo siento has fallado");
            return 0;
        }else{
            System.out.println("Resposta no valida");
            return 0;
        }
    }
}
