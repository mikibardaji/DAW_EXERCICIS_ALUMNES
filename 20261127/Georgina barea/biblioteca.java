/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegosorpresa;

import java.util.InputMismatchException;
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
    public static int caidaBola()
    {
        Random aleatorio = new Random();
        int bolita = aleatorio.nextInt(1,37);
        return bolita;
    }
    /**
     * pedira un numero al usuario que tiene que estar entre 1 y 38 si no, no lo devolvera
     * Mostrara la frase "apuesta por un numero del 1 al 36 , o elige 37(impar) o 38(par)
     * 
     * @return entero valido
     */
    public static int pedirNumero()
    {
        
        Scanner teclado = new Scanner(System.in);
    int usuario = 0;
    boolean valido = false;

    while (!valido) {
        try {
            System.out.println("Apuesta por un número del 1 al 36, o elige 37 (impar) o 38 (par): ");
            usuario = teclado.nextInt();

            if (usuario >= 1 && usuario <= 38) {
                valido = true;
            } else {
                System.out.println("Error: el número debe estar entre 1 y 38.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: debes introducir un número entero.");
            teclado.next();
        }
    }

    return usuario;
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
        boolean cierto = false;
        if (respuesta == 's' && respuesta == 'S'){
            if(dinero >0){
                cierto = true;
            }
            else{
                System.out.println("No tienes dinero");
                cierto = false;
            }
        }
        else{
            cierto = false;
        }
        return cierto;
    } 
}
