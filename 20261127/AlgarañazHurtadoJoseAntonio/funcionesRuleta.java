/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegosorpresa;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jal6318
 */
public class funcionesRuleta {

    /**
     * pedira un numero al usuario que tiene que estar entre 1 y 38 si no, no lo
     * devolvera Mostrara la frase "apuesta por un numero del 1 al 36 , o elige
     * 37(impar) o 38(par)
     *
     * @return entero valido
     */
    public static int pedirNumero() {
        int num1;
        boolean salir=false;
        Scanner scan = new Scanner(System.in);
        do {
            
        
        System.out.println("Introduce un nunmero entre 1 y 38: ");
        num1 = scan.nextInt();
            if (num1>=1&&num1<=38) {
                salir=true;
            }else{
                System.out.println("El numero introducido esta fuera del rango");
            
            }
        
        } while (salir!=true);
        return num1;
    }

    /**
     * S
     * Simulara la caida de la bola, sera un valor aleatorio entre 1 y 36
     *
     * @return
     */
    public static int caidaBola() {
        int numRandom;
        Random aleatorio = new Random();
        numRandom = aleatorio.nextInt(1, 37);

        return numRandom;
    }

    /**
     * Si la respuesta de entrada es igual a s y el dinero es positivo, la
     * función decide que es cierto que puede seguir jugando Si algun caso no se
     * cumple, no puede
     *
     * @param respuesta escogida por el jugador
     * @param dinero
     * @return true si puede seguir jugando, false si no
     */
    public static boolean puedesJugar(char respuesta, int dinero) {
        boolean jugar = false;

        if (respuesta == 's' && dinero > 0) {
            jugar = true;

        }else if (respuesta=='n') {
            System.out.println("Saliendo...");
            
        }else if (dinero < 0) {
            System.out.println("No tiene suficiente dinero....");
        }
        return jugar;
    }

    /**
     * Calcula las ganancias, de la apuesta 1) Si el numero apostado es entre 1
     * y 36 sera el dinero apostado multiplicado por 35, 2) si el numero es 37 o
     * 38 sera el doble del dinero_apostado.
     *
     * @param dinero_apostado
     * @param num_apostado
     * @return
     */
    public static int ganancias(int dinero_apostado, int num_apostado) {
        int dineroGanado = 0;
        if (num_apostado >= 1 && num_apostado <= 36) {
            dineroGanado = dinero_apostado * 35;

        } else if (num_apostado == 37 || num_apostado == 38) {
            dineroGanado = dinero_apostado * 2;

        }
        return dineroGanado;
    }

    /**
     * Dentro se pedira el dinero que quiere apostar, y devolvera el dinero
     * siempre que sea valido positivo y no superior al dinero de la cartera
     *
     * @param dinero_disponible dinero que tiene en la cartera el usuario
     * @return dinero apostado valido
     */
    public static int pedirDineroApuesta(int dinero_disponible) {
        int dinero;
        boolean salir = false;
        Scanner scan = new Scanner(System.in);

        do {

            System.out.println("Introduce el dinero que quieres apostar: ");
            dinero = scan.nextInt();
            if (dinero > 0) {
                if (dinero <= dinero_disponible) {
                    salir = true;

                } else {
                    System.out.println("No tienes dinero suficiente....");

                }

            } else {
                System.out.println("El dinero debe ser mayor a cero");

            }
        } while (salir != true);
        return dinero;
    }

    /**
     * comprueba si has ganado tu apuesta ... Ganas si bola es igual a
     * num_apostado Tambien ganas si num_apostado es 37 y la bola es impar
     * Tambien ganas si num_apostado es 38 y la bola es un numero par
     *
     * @param bola
     * @param num_apostado
     * @return true si has ganado, false en cualquier otro caso
     */
    public static boolean eresGanador(int bola, int num_apostado) {

        boolean ganador = false;

        if (bola == num_apostado) {
            return ganador = true;
        }if (num_apostado == 37 && bola%2!=0) {
            return ganador=true;
            
        }if (num_apostado == 38 && bola%2==0) {
            return ganador = true;
        }   
        

        return ganador;

    }

    /**
     * * Dentro preguntara "Quieres seguir jugando(S/N) Devolvera la respuesta
     * siempre que sea valida, valido solo es si pone s , n en mayusculas o
     * minusculas Si no pone respuesta valida debe seguir preguntando
     *
     * @return respuesta (valida
     */
    public static char seguirJugando() {
        char respuesta;
        boolean salir=false;
        Scanner scan= new Scanner (System.in);
        do {
            
        
        System.out.println("¿Quieres seguir jugando?:si(S) o no(N) ");
        respuesta=scan.next().charAt(0);
            if ((respuesta=='S'||respuesta=='s')||(respuesta=='N'||respuesta=='n')) {
                salir=true;
                
            }
            else{
                System.out.println("Opcion incorrecta.Desbes escribir una de las opciones");
            
            }
        } while (salir!=true);
        return respuesta;
    }

    /**
     * funcion que pinta tantos asteriscos en una linea como el valor num, al
     * acabar los asterisco, pinta un - y el valor del num
     *
     * @param num numero de asteriscos a pintar
     */
    public static void pintaAsteriscos(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.print("*");
            
        }
        System.out.println("-"+num);

    }
}
