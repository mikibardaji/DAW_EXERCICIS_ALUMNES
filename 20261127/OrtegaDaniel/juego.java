package juegosorpresa;

import java.util.Random;
import java.util.Scanner;

public class MetodosJuego {

    public static int pedirNumero() {
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Apuesta por un numero del 1 al 36, o elige 37(impar) o 38(par):");
            numero = sc.nextInt();
        } while (numero < 1 || numero > 38);
        return numero;
    }

    public static int caidaBola() {
        Random rd = new Random();
      int numrandom=rd.nextInt(36) + 1;
        return numrandom
    }

    public static boolean puedesJugar(String respuesta, int dinero) {
        return respuesta.equalsIgnoreCase("Si") && dinero > 0;
    }

    public static int ganancias(int dinero_apostado, int num_apostado) {
        if (num_apostado >= 1 && num_apostado <= 36) {
            return dinero_apostado * 35;
        } else if (num_apostado == 37 || num_apostado == 38) {
            return dinero_apostado * 2;
        } else {
            return 0;
        }
    }

    public static int pedirDineroApuesta(int dinero_disponible) {
        Scanner sc = new Scanner(System.in);
        int apuesta;
        do {
            System.out.println("Tienes " + dinero_disponible + "€. ¿Cuánto dinero quieres apostar?");
            apuesta = sc.nextInt();
            if (apuesta <= 0 || apuesta > dinero_disponible) {
                System.out.println("Apuesta no válida. Debe ser mayor a 0 y no superar tu saldo.");
            }
        } while (apuesta <= 0 || apuesta > dinero_disponible);
        return apuesta;
    }

    public static boolean eresGanador(int bola, int num_apostado) {
        if (bola == num_apostado) {
            return true;
        } else if (num_apostado == 37 && bola % 2 != 0) {
            return true;
        } else if (num_apostado == 38 && bola % 2 == 0) {
            return true;
        }
        return false;
    }

    public static String seguirJugando() {
        Scanner sc = new Scanner(System.in);
        String respuesta;
        do {
            System.out.println("¿Quieres seguir jugando? (SI/NO)");
            respuesta = sc.nextLine();
        } while (!respuesta.equalsIgnoreCase("SI") && !respuesta.equalsIgnoreCase("NO"));
        return respuesta;
    }

    public static void pintaAsteriscos(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
        System.out.println("-" + num);
    }
}
