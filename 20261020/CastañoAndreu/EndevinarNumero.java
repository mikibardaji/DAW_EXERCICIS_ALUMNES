/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exadivinarnumero;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ExAdivinarNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc = new Scanner (System.in);
        int numElegido, numRandom;
        int contador = 1;
        
        System.out.println("Que numero crees que sacare?");
        numElegido = sc.nextInt();
     
        numRandom = ran.nextInt(1, 101);
        
        while (numElegido != numRandom && contador < 5)
        {
            System.out.println("primera " + (numElegido - numRandom) + " segunda " + (numRandom - numElegido));
            if (numElegido > numRandom)
            {
                
                if ((numElegido - numRandom) < 10)
                {
                    System.out.println("Estas cerca!");
                }
                else
                {
                    System.out.println("Te has pasado!");
                    System.out.println("He elegido el " + numRandom);
                }
                
            }
            else
            {
                if ((numRandom - numElegido) < 10)
                {
                    System.out.println("Estas cerca!");
                }
                else
                {
                    System.out.println("El numero es mas grande");
                    System.out.println("He elegido el " + numRandom);
                }
              
            }        
            contador++;
            System.out.println("Que numero crees que sacare?");
            numElegido = sc.nextInt();
            numRandom = ran.nextInt(1, 101);
        }
        if (numElegido == numRandom)
        {
            System.out.println("Has acertado!");
            System.out.println("Has hecho " + contador + " intentos");
        }
        else
        {
            System.out.println("He elegido el " + numRandom);
            System.out.println("Te has pasado de intentos!");
        }
           
    }
    
}
