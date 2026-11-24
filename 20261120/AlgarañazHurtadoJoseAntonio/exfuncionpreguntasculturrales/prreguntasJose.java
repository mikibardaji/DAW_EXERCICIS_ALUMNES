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
        System.out.println("Barcelona");
        System.out.println("Pekin");
        System.out.println("Paris");
        System.out.println("Marsella");
        resposta = scan.nextLine();
        if (resposta.equalsIgnoreCase("Barcelona")) {
            return resposta;
        } else if (resposta.equalsIgnoreCase("Pekin")) {
            return resposta;

        } else if (resposta.equalsIgnoreCase("Paris")) {
            return resposta;

        } else if (resposta.equalsIgnoreCase("Marsella")) {
            return resposta;

        }
        return resposta.toUpperCase();
    }

    public static void respostaPrimera(String resposta1) {
        if (resposta1.equalsIgnoreCase("Barcelona") || resposta1.equalsIgnoreCase("b.- Pekin")
                || resposta1.equalsIgnoreCase("c.- Paris") || resposta1.equalsIgnoreCase("d.- Marsella")) {
            if (resposta1.equalsIgnoreCase("Paris")) {
                System.out.println("¡¡¡CORRECTO!!!");
            }
            if (resposta1.equalsIgnoreCase("Barcelona")) {
                System.out.println("Incorrecto, la respuesta ermpiza por la P y termina  en s");

            }
            if (resposta1.equalsIgnoreCase("Pekin")) {
                System.out.println("¡¡NO!! casi, la respuesta correcta tambien empieza por la P");
            }
            if (resposta1.equalsIgnoreCase("Marsella")) {
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
        System.out.println("Buenos aires");
        System.out.println("Austria");
        System.out.println("Londres");
        System.out.println("Camberra");
        resposta = scan.nextLine();
        if (resposta.equalsIgnoreCase("Buenos aires")) {
            return resposta;
        } else if (resposta.equalsIgnoreCase("Austria")) {
            return resposta;

        } else if (resposta.equalsIgnoreCase("Londres")) {
            return resposta;

        } else if (resposta.equalsIgnoreCase("Camberra")) {
            return resposta;

        }
        return resposta.toUpperCase();
    }
        public static void respostaSegunda(String resposta) {
        if (resposta.equalsIgnoreCase("Buenos aires") || resposta.equalsIgnoreCase("Austria")
                || resposta.equalsIgnoreCase("Londres") || resposta.equalsIgnoreCase("Camberra")) {
            if (resposta.equalsIgnoreCase("Londres")) {
                System.out.println("Incorrecto. Esta era trampa, Londres es la capital de Reino Unido");
            }
            if (resposta.equalsIgnoreCase("Buenos aires")) {
                System.out.println("Incorrecto, Buenos aires es lacpital de Argentina");

            }
            if (resposta.equalsIgnoreCase("Austria")) {
                System.out.println("¡¡NO!! Austria, aunque se parece muchoo el nombre es un pais");
            }
            if (resposta.equalsIgnoreCase("Camberra")) {
                System.out.println("¡¡¡CORRECTO!!!");
            }
        } else {
            System.out.println("Respuesta no valida debe introducir una de las opciones...");

        }
    }

}
