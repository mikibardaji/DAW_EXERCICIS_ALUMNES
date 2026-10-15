/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex7iteratius;

import java.util.Scanner;

/**
 *
 * @author andca
 */
public class Ex7Iteratius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        int cantidadNum = 0, contadorNegativo = 0, contadorPositivo = 0;
        boolean numNegativo = false;
        
        while (cantidadNum < 10)
        {
            System.out.println("Introduce un numero no nulo:");
            num = sc.nextInt();
            
            if (num != 0)
            {
                cantidadNum++;
                if (num < 0) 
                {
                    numNegativo = true;
                    contadorNegativo++;
                } 
                else 
                {
                contadorPositivo++;
                }
            } 
            else 
            {
                System.out.println("El numero no puede ser 0!");
            }
            
             
            
           
        
        }
        
        System.out.println("Hay " + contadorNegativo + " numeros negativos");
        System.out.println("Hay " + contadorPositivo + " numeros positivos");
    }
    
}
