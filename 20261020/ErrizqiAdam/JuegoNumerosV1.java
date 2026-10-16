/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegonumerosv1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aer5219
 */
public class JuegoNumerosV1 {

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


            
            if (contador==6) {
                System.out.println("Muchos intentos. Has perdido!");
                break;
            } else if (numMaquina==numUsuario) {
                System.out.println("Acertaste!");
            } else if(numUsuario>numMaquina) {
                System.out.println("El numero es menor a este");
            } else if(numUsuario<numMaquina) {
                System.out.println("El numero es mayor a este");
            }
            contador++;
            
            
            
             
        } while(numMaquina!=numUsuario);
        
        System.out.println("Has durado " + contador + " intentos");
        
    }
    
}
