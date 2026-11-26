/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegosorpresa;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author fso6590
 */
public class LibreriaRuleta {
    
        /**
     * pedira un numero al usuario que tiene que estar entre 1 y 38 si no, no lo devolvera
     * Mostrara la frase "apuesta por un numero del 1 al 36 , o elige 37(impar) o 38(par)
     * 
     * @return entero valido
     */
    
    public static int pedirNumero()
    {
        Scanner teclado = new Scanner(System.in);
        int numero, salir = 0;
        do {
            System.out.println("apuesta por un numero del 1 al 36 , o elige 37(impar) o 38(par)");
            numero = teclado.nextInt();
            if (numero < 1 || numero > 38) {
                System.out.println("No has escogido un numero valido, vuelvelo a poner");
            }else {
                salir = 1;
            }
        } while (salir == 0);

        return numero;
    }
    
    /**S
     * Simulara la caida de la bola, sera un valor aleatorio entre 1 y 36
     * @return 
     */
    public static int caidaBola()
    {
        int num_ruleta;
        Random aleatorio = new Random();
        num_ruleta = aleatorio.nextInt(1, 39);
        return num_ruleta;
    }
    
    /**
     * Si la respuesta de entrada es igual a s y el dinero es positivo, la función decide que es cierto que puede seguir jugando
     * Si algun caso no se cumple, no puede
     * @param respuesta escogida por el jugador
     * @param dinero
     * @return true si puede seguir jugando, false si no
     */
    public static boolean puedesJugar(char respuesta, int dinero)
    {
        if (respuesta == 's') {
            if (dinero <= 0) {
                System.out.println("Lo siento pero no puedes permitirte jugar");
                return false;
            }else{
                System.out.println("Adelante");
                return true;
            }
        }else if (respuesta == 'n') {
            System.out.println("Hasta la proxima");
            return false;
        }
        return true;
    }
    
    /**
     * Calcula las ganancias, de la apuesta 1) Si el numero apostado es entre 1 y 36 sera el dinero apostado multiplicado por 35, 
     * 2) si el numero es 37 o 38 sera el doble del dinero_apostado.
     * @param dinero_apostado
     * @param num_apostado
     * @return 
     */
    public static int ganancias(int dinero_apostado, int num_apostado)
    {
        if (num_apostado >= 1 && num_apostado <= 36) {
            return dinero_apostado * 35;
        }else if (num_apostado == 37 || num_apostado == 38) {
            return dinero_apostado * 2;
        }else{
            return 0;
        }
    }
    
    /**
     * Dentro se pedira el dinero que quiere apostar, y devolvera el dinero siempre que sea valido positivo y no superior al dinero de la cartera
     * @param dinero_disponible dinero que tiene en la cartera el usuario
     * @return dinero apostado valido
     */
     public static int pedirDineroApuesta(int dinero_disponible)
     {
         Scanner teclado = new Scanner(System.in);
         int dinero, salir = 0;
         do {
             dinero = teclado.nextInt();
             if (dinero <= 0 || dinero > dinero_disponible) {
                 System.out.println("La cantidad apostada no es valida o no tienes suficiente dinero para apostar");
             }else {
                 System.out.println("Apuesta realizada");
             }
         } while (salir == 0);
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
        }else if (num_apostado == 37 && bola % 2 != 0) {
            return true;
        }else if (num_apostado == 38 && bola % 2 == 0) {
            return true;
        }else  {
            return false;
        } 
    }
    
     
    /**
     * * Dentro preguntara "Quieres seguir jugando(S/N)
     * Devolvera la respuesta siempre que sea valida, valido solo es si pone s , n en mayusculas o minusculas
     * Si no pone respuesta valida debe seguir preguntando
     * @return respuesta (valida
     */
    
     public static char seguirJugando()
     {
         Scanner teclado = new Scanner(System.in);
         char respuesta;
         int salir = 0;
         do {
             System.out.println("Quieres seguir jugando(S/N)");
             respuesta = teclado.next().charAt(0);
             if (respuesta == 'S' || respuesta == 's') {
                 System.out.println("Sigamos jugando");
                 salir = 1;
             }else if (respuesta == 'N' || respuesta == 'n') {
                 System.out.println("Hasta la proxima");
                 break;
             }
         } while (salir == 0);
         return respuesta;
     }
     
      /**
      * funcion que pinta tantos asteriscos en una linea como el valor num, al acabar los asterisco, pinta un - y el valor del num
      * @param num numero de asteriscos a pintar
      */
     public static void pintaAsteriscos(int num)
     {
         for (int i = 0; i < num; i++) {
             System.out.println("*");
         }
         System.out.println(" - " +num);
     }
    
}
