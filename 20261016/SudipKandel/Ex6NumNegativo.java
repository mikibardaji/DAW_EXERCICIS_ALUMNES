/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex6numnegativo;

import java.util.Scanner;

/**
 *
 * @author kande
 */
public class EX6NumNegativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner scanner = new Scanner (System.in);
    int num = 0, contador = 0;
    boolean negaativo = false;
    
    
        System.out.println("Introduce un numero no nullo");
    do {
    num = scanner.nextInt();
        contador ++;
        if (contador <10){
            
            System.out.println("Introduce otro Numero");
            if (num <0){
            negaativo = true;
        
            }
        }
    }
    while (contador <10);
    if (negaativo){
        System.out.println("Se Ha puesto un numero negativo");
    
    }
    }
    }
