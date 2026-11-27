package juegosorpresa;

import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author andca
 */
public class LibreriaJuego {
  public static int pedirNumero() {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Apuesta por un numero del 1 al 36, o elige 37 (impar) o 38 (par): ");
            numero = sc.nextInt();

            if (numero < 1 || numero > 38) 
            {
                System.out.println("Numero no valido. Intentalo de nuevo.");
            }
        } while (numero < 1 || numero > 38);

        return numero;
    }

    public static int caidaBola() 
      {
        Random aleatorio = new Random();
        int bola = aleatorio.nextInt(36) + 1;
        return bola;
    }

    public static boolean puedesJugar(String respuesta, int dinero) {
        if (respuesta.equalsIgnoreCase("SI") && dinero > 0) 
          {
            return true; 
          } 
          else 
          {
            return false;
        }
    }

    public static int ganancias(int dinero_apostado, int num_apostado) {
        if (num_apostado >= 1 && num_apostado <= 36) 
        {
            return dinero_apostado * 35;
        } 
        else if (num_apostado == 37 || num_apostado == 38) 
        {
            return dinero_apostado * 2;
        } 
        else 
        {
            return -1;
        }
    }

    public static int pedirDineroApuesta(int dinero_disponible) {
        Scanner sc = new Scanner(System.in);
        int dinero;

        do {
            System.out.print("Cuanto dinero quieres apostar?: ");
            dinero = sc.nextInt();

            if (dinero <= 0 || dinero > dinero_disponible) {
                System.out.println("Cantidad no valida. Intentalo de nuevo.");
            }
        } while (dinero <= 0 || dinero > dinero_disponible);

        return dinero;
    }

    public static boolean eresGanador(int bola, int num_apostado) {
        if (bola == num_apostado) 
        {
            return true;
        } 
          else if (num_apostado == 37 && bola % 2 != 0) 
        {
            return true;
        } 
        else if (num_apostado == 38 && bola % 2 == 0) 
        {
            return true;
        } 
        else 
        {
            return false;
        }
    }

    public static String seguirJugando() {
        Scanner sc = new Scanner(System.in);
        String respuesta;

        do {
            System.out.print("Quieres seguir jugando (SI/NO)? ");
            respuesta = sc.nextLine();

            if (!respuesta.equalsIgnoreCase("SI") && !respuesta.equalsIgnoreCase("NO")) 
            {
                System.out.println("Respuesta no valida. Escribe SI o NO.");
            }
        } while (!respuesta.equalsIgnoreCase("SI") && !respuesta.equalsIgnoreCase("NO"));

        return respuesta;
    }

    public static void pintaAsteriscos(int num) {
        for (int i = 0; i < num; i++) 
        {
            System.out.print("*");
        }
        System.out.println(" - " + num);
    }
}   
