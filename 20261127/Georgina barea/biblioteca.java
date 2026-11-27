/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegosorpresa;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gba0006
 */
public class biblioteca {
     /**S
     * Simulara la caida de la bola, sera un valor aleatorio entre 1 y 36
     * @return 
     */
        public static int pedirNumero() {
        int numero;
         Scanner teclado = new Scanner (System.in);

        do {
            System.out.print("Apuesta por un número del 1 al 36, 37 (impar) o 38 (par):");
            numero = teclado.nextInt();
            
        } while (numero < 1 || numero > 38);

        
        return numero;
    }

    /**S
     * Simulara la caida de la bola, sera un valor aleatorio entre 1 y 36
     * @return 
     */
    
    
    
    public static int caidaBola() {
        Random random = new Random();
        return random.nextInt(36) + 1;
    }

    

/**
     * Si la respuesta de entrada es igual a s y el dinero es positivo, la función decide que es cierto que puede seguir jugando
     * Si algun caso no se cumple, no puede
     * @param respuesta escogida por el jugador
     * @param dinero
     * @return true si puede seguir jugando, false si no
     */
    public static boolean puedesJugar(char respuesta, int dinero) {
        
        return (respuesta == 's' || respuesta == 'S') && dinero > 0;
    }

    

/**
     * Calcula las ganancias, de la apuesta 1) Si el numero apostado es entre 1 y 36 sera el dinero apostado multiplicado por 35, 
     * 2) si el numero es 37 o 38 sera el doble del dinero_apostado.
     * @param dineroApostado
     * @param numeroApostado
     * @return 
     */
    
    
    public static int ganancias(int dineroApostado, int numeroApostado) {
       
        if (numeroApostado >= 1 && numeroApostado <= 36) {
           
            return dineroApostado * 35;
        
        
        } else if (numeroApostado == 37 || numeroApostado == 38) {
            return dineroApostado * 2;
        
        }

        return 0;
    }

    
/**
     * Dentro se pedira el dinero que quiere apostar, y devolvera el dinero siempre que sea valido positivo y no superior al dinero de la cartera
     * @param dineroDisponible
     * @return dinero apostado valido
     */
    public static int pedirDineroApuesta(int dineroDisponible) {
        int apuesta;
        Scanner teclado = new Scanner (System.in);

        do {
            System.out.print("¿Cuánto dinero quieres apostar?");
            apuesta = teclado.nextInt();
        } while (apuesta <= 0 || apuesta > dineroDisponible);

        return apuesta;
    }

    


    /**
     * comprueba si has ganado tu apuesta ... 
     * Ganas si bola es igual a num_apostado
     * Tambien ganas si num_apostado es 37 y la bola es impar
     * Tambien ganas si num_apostado es 38 y la bola es un numero par
     * @param bola
     * @param numeroApostado
     * @return true si has ganado, false en cualquier otro caso
     */
    public static boolean eresGanador(int bola, int numeroApostado) {
       
        
        if (numeroApostado == bola) {
            return true;
        }

        if (numeroApostado == 37 && bola % 2 != 0) {
            return true; // 37 significa impar
        }

        return numeroApostado == 38 && bola % 2 == 0;
    }

    
/**
     * * Dentro preguntara "Quieres seguir jugando(S/N)
     * Devolvera la respuesta siempre que sea valida, valido solo es si pone s , n en mayusculas o minusculas
     * Si no pone respuesta valida debe seguir preguntando
     * @return respuesta (valida
     */
    public static char seguirJugando() {
        char respuesta;
        
       Scanner teclado = new Scanner (System.in);

        do {
            System.out.print("¿Quieres seguir jugando? (S/N)");
            respuesta = teclado.next().charAt(0);
        }
        
        while (respuesta != 's' && respuesta != 'S'
                && respuesta != 'n' && respuesta != 'N');

       
        return respuesta;
    }

    /**
      * funcion que pinta tantos asteriscos en una linea como el valor num, al acabar los asterisco, pinta un - y el valor del num
      * @param num numero de asteriscos a pintar
      */
    
    public static void pintaAsteriscos(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }

        System.out.println("-" + num);
    }
} 

