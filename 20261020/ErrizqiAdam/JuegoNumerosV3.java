/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegonumerosv3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author adamg
 */
public class JuegoNumerosV3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numUsuario, numMaquina;
        
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();
        
        
        
        numMaquina = aleatorio.nextInt(1,101);
        int contador=0;
        do{
            System.out.println("Adivina el numero en el que pienso (entre 1 y 100): ");
            numUsuario = sc.nextInt();

            contador++;
                        
            
            if (numMaquina==numUsuario) {
                System.out.println("Acertaste!");
            } else if(numUsuario>numMaquina) {
                System.out.println("El numero es menor a este");
                
                if (numUsuario - numMaquina<5) {
                    System.out.println("Estas cerca");
                }
            } else if(numUsuario<numMaquina) {
                System.out.println("El numero es mayor a este");
                if (numUsuario - numMaquina<5) {
                    System.out.println("Estas cerca");
                }
                
            }
            if (numMaquina != numUsuario && contador==6) {
                System.out.println("Muchos intentos. Has perdido!");
                System.out.println("El numero era: " + numMaquina);
                break;
            } 
            
        } while(numMaquina!=numUsuario);
        
        System.out.println("Has hecho " + contador + " intentos");
    }
    
}
