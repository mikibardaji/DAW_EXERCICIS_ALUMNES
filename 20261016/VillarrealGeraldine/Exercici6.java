/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex6negativo;

import java.util.Scanner;
/**
 *
 * @author gvi6123
 */
public class Ex6Negativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean negativo = false;
        int contador = 0;
        int numero;

        while(contador<10)
            {
                System.out.println("Introduce un número no nulo");
                numero=sc.nextInt();
            
            if(numero!=0)
                {
                  contador++;
                   if(numero<0)
                     {
                     negativo=true;
                     }
                }
            else
                {
                System.out.println("El numero no puede ser 0");
                }
            }
        if(negativo)
            {
                System.out.println("Hay un numero negativo");
            }
        else
            {
                System.out.println("No hay un numero negativo");
            }
       
    
    }
    
}
