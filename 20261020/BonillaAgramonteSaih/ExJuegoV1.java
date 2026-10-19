/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exjuegov1.pkg1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author saihb
 */
public class ExJuegoV11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random alea = new Random();
        int numMaquina, numUsuari = 0, intentos = 0;
        
        numMaquina=alea.nextInt(1, 101);
        
        while (numUsuari != numMaquina){
            System.out.println("Adivina el numero: ");
            numUsuari = sc.nextInt();
            
            intentos++;
            
            if (numUsuari < numMaquina){
                System.out.println("EL numero es mayor");
            } else if (numUsuari > numMaquina){
                System.out.println("El numero es menor");
            }else {
                System.out.println("Acertaste");
                System.out.println("Intentos " + intentos);
            }
            
            
        }
        
        
    }
    
}
