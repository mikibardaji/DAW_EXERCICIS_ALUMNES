/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exfunciones3;

import java.util.Scanner;

/**
 *
 * @author aer5219
 */
public class ExFunciones3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, minimoFinal;
        
        System.out.println("NUMERO MINIMO");
        System.out.print("Introduce un numero: ");
        a=sc.nextInt();
        
        System.out.print("Introduce otro numero: ");
        b=sc.nextInt();
        
        minimoFinal = minimo(a, b);
        
        System.out.println("El minimo entre los 2 numeros es: " + minimoFinal);
    }
    
    public static int minimo(int a, int b){
        if(a<b){
            return a;
        }
        else{
            
            return b;
        }
    }
    
}
