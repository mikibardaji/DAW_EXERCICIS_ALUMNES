/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exfuncionpreguntasculturrales;

import java.util.Scanner;

/**
 *
 * @author José Antonio
 */
public class prreguntasJose {

    public static String preguntaPrimera() {
        String resposta;
        Scanner scan = new Scanner(System.in);
        System.out.println("***Bienvenido al juego de las capitales***");
        System.out.println("Primera pregunta:");
        System.out.println("Cual es la capital de Francia:");
        System.out.println("a.- Barcelona");
        System.out.println("b.- Pekin");
        System.out.println("c.- Paris");
        System.out.println("d.- Marsella");
        resposta = scan.nextLine();
        if (resposta.equalsIgnoreCase("a.- Barcelona")) {
            return resposta;
        } else if (resposta.equalsIgnoreCase("b.- Pekin")) {
            return resposta;

        } else if (resposta.equalsIgnoreCase("c.- Paris")) {
            return resposta;

        } else if (resposta.equalsIgnoreCase("d.- Marsella")) {
            return resposta;

        }
        return resposta.toUpperCase();
    }

    public static void respostaPrimera(String resposta1) {
        if (resposta1.equalsIgnoreCase("a.- Barcelona") || resposta1.equalsIgnoreCase("b.- Pekin")
                || resposta1.equalsIgnoreCase("c.- Paris") || resposta1.equalsIgnoreCase("d.- Marsella")) {
            if (resposta1.equalsIgnoreCase("c.- Paris")) {
                System.out.println("¡¡¡CORRECTO!!!");
            }
            if (resposta1.equalsIgnoreCase("a.- Barcelona")) {
                System.out.println("Incorrecto, la respuesta ermpiza por la P y termina  en s");

            }
            if (resposta1.equalsIgnoreCase("b.- Pekin")) {
                System.out.println("¡¡NO!! casi, la respuesta correcta tambien empieza por la P");
            }
            if (resposta1.equalsIgnoreCase("d.- Marsella")) {
                System.out.println("puff estudia un poco chaval, es Paris...");
            }
        } else {
            System.out.println("Respuesta no valida debe intrroducir una de las opciones...");

        }
    }
        public static String preguntaSegunda() {
        String resposta;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Segunda pregunta:");
        System.out.println("Cual es la capital de Australia:");
        System.out.println("a.- Buens aires");
        System.out.println("b.- Austria");
        System.out.println("c.- Londres");
        System.out.println("d.- Camberra");
        resposta = scan.nextLine();
        if (resposta.equalsIgnoreCase("a.- Buens aires")) {
            return resposta;
        } else if (resposta.equalsIgnoreCase("b.- Austria")) {
            return resposta;

        } else if (resposta.equalsIgnoreCase("c.- Londres")) {
            return resposta;

        } else if (resposta.equalsIgnoreCase("d.- Camberra")) {
            return resposta;

        }
        return resposta.toUpperCase();
    }
        public static void respostaSegunda(String resposta) {
        if (resposta.equalsIgnoreCase("a.- Buens aires") || resposta.equalsIgnoreCase("b.- Austria")
                || resposta.equalsIgnoreCase("c.- Londres") || resposta.equalsIgnoreCase("d.- Camberra")) {
            if (resposta.equalsIgnoreCase("c.- Londres")) {
                System.out.println("Incorrecto. Esta era trampa, Londres es la capital de Reino Unido");
            }
            if (resposta.equalsIgnoreCase("a.- Buens aires")) {
                System.out.println("Incorrecto, Buens aires es lacpital de Argentina");

            }
            if (resposta.equalsIgnoreCase("b.- Austria")) {
                System.out.println("¡¡NO!! Austria, aunque se parece muchoo el nombre es un pais");
            }
            if (resposta.equalsIgnoreCase("d.- Camberra")) {
                System.out.println("¡¡¡CORRECTO!!!");
            }
        } else {
            System.out.println("Respuesta no valida debe introducir una de las opciones...");

        }
    }

}
