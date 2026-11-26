/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegosorpresa;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class MetodosJuego {

    /**
     * pedira un numero al usuario que tiene que estar entre 1 y 38 si no, no lo devolvera
     * y volverà a pedirlo
     * Mostrara la frase "apuesta por un numero del 1 al 36 , o elige 37(impar) o 38(par)
     * 
     * @return entero valido (1-38) 
     */
    
    public static int pedirNumero()
    {
     Scanner sc = new Scanner(System.in);
     int numero;

    do {
        System.out.println("Apuesta por un numero del 1 al 36, o elige 37(impar) o 38(par)");
        numero = sc.nextInt();

    } while (numero < 1 || numero > 38);

    return numero;
    }
    
    /**S
     * Simulara la caida de la bola, sera un valor aleatorio entre 1 y 36
     * @return valorBola (1 al 36)
     */
    public static int caidaBola()
    {
        Random rd = new Random();

       int valorBola;
        valorBola = rd.nextInt(36) + 1;

    return valorBola;
    }
    
    /**
     * Si la respuesta de entrada es igual a Si, sin importar como este escrito y el dinero es positivo, 
     * la función decidira  que puedes jugar -  cierto 
     * Si algun caso no se cumple, no puede jugar 
     * @param respuesta letra escogida por usuario 
     * @param dinero que tiene en ese momento el jugador
     * @return true si puede seguir jugando, false si no
     */
    public static boolean puedesJugar(String respuesta, int dinero)
    {
    if (respuesta.equalsIgnoreCase("SI") && dinero > 0) {
        return true;
    } else {
        return false;
    }
        
    }
    
    /**
     * Calcula las ganancias, de la apuesta 
     * 1) Si el numero apostado es entre 1 y 36 sera el dinero apostado multiplicado por 35, 
     * 2) si el numero es 37 o 38 retornara solo el doble del dinero_apostado.
     * 3) En cualquier otro caso no devuelve ganancias
     * @param dinero_apostado
     * @param num_apostado
     * @return ganancias de la apuesta
     */
    public static int ganancias(int dinero_apostado, int num_apostado)
    {
    if (num_apostado >= 1 && num_apostado <= 36) {
        return dinero_apostado * 35;
    } else if (num_apostado == 37 || num_apostado == 38) {
        return dinero_apostado * 2;
    } else {
        return 0;
    }
    }
    
    /**
     * Dentro se pedira el dinero que quiere apostar, 
     * y devolvera el dinero siempre que sea valido positivo y no sea superior al dinero que tienes en cartera (disponible)
     * Sino deberà seguir pidiendo
     * @param dinero_disponible dinero que tiene en la cartera el usuario
     * @return dinero apostado valido 
     */
     public static int pedirDineroApuesta(int dinero_disponible)
     {
      Scanner sc = new Scanner(System.in);
      int dinero;

    do {
        System.out.println("Cuanto dinero quieres apostar?");
        dinero = sc.nextInt();

    } while (dinero <= 0 || dinero > dinero_disponible);

    return dinero;
    }
     
     /**
     * comprueba si has ganado tu apuesta ... 
     * Ganas si bola es igual a num_apostado
     * Tambien ganas si num_apostado es 37 y la bola es impar
     * Tambien ganas si num_apostado es 38 y la bola es un numero par
     * @param bola
     * @param num_apostado
     * @return true si has ganado, false en cualquier otro caso
     */
    public static boolean eresGanador(int bola, int num_apostado)
    {
    if (bola == num_apostado) {
        return true;
    } else if (num_apostado == 37 && bola % 2 != 0) {
        return true;
    } else if (num_apostado == 38 && bola % 2 == 0) {
        return true;
    } else {
        return false;
    }
    }
    
     
    /**
     * * Dentro preguntara "Quieres seguir jugando(SI/NO)
     * Devolvera la respuesta siempre que sea valida, valido  si ha respuesto SI o NO, en mayusculas o minusculas
     * Si no pone respuesta valida debe seguir preguntando hasta que se escriba una de las respuestas validas
     * @return respuesta (valida
     */
     public static String seguirJugando()
     {
     Scanner sc = new Scanner(System.in);
    String respuesta;

    do {
        System.out.println("Quieres seguir jugando (SI/NO)?");
        respuesta = sc.nextLine();

    } while (!respuesta.equalsIgnoreCase("SI") &&
             !respuesta.equalsIgnoreCase("NO"));

    return respuesta;     }
     
      /**
      * funcion que pinta tantos asteriscos en una linea como el valor num, al acabar los asterisco, pinta un - y el valor del num
      * @param num numero de asteriscos a pintar
      */
     public static void pintaAsteriscos(int num)
     {
     for (int i = 0; i < num; i++) {
     System.out.print("*");
    }

     System.out.println("-" + num);
     }    
}
