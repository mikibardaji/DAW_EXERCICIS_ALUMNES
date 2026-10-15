/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex6iteratius;

import java.util.Scanner;

/**
 *
 * @author andca
 */
public class Ex6Iteratius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        int cantidadNum = 0;
        boolean negativo = false;
        
        while (cantidadNum < 10) 
        {
            System.out.println("Introduce un numero no nulo");
            num = sc.nextInt();
            
            if (num != 0)
            {
                cantidadNum++;
                if (num < 0) 
                {
                    negativo = true;
                }
            }
            else
              {
                System.out.println("El numero no puede ser 0");
              }
        }
        
        if (negativo)
            {
            System.out.println("Hay algun numero negativo");
            }
        else
            {
            System.out.println("No hay ningun numero negativo");
            }
    }
    
}
