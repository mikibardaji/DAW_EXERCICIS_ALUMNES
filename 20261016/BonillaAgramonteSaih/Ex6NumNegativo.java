/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex6negativos;

import java.util.Scanner;

/**
 *
 * @author saihb
 */
public class Ex6Negativos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int num, cont = 0;
        boolean negativo = false;
        
            while (cont < 10) {
                System.out.println("Introduce un numero no nulo");
                num = sc.nextInt();
                
                if (num < 0) {
                    negativo = true; 
                }
              cont++;  
            }
            if (negativo){
                System.out.println("Se ha leido algun numero negativo");
            }
            else {
                System.out.println("No se ha leido ningun numero negativo");
            }
            
    }
    
}
