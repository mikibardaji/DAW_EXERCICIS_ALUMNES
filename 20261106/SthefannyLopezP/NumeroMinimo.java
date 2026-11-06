/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author sthef
 */
public class NumeroMinimo {
    
    public static int minimo(int a, int b){
        int menor;
        
        if(a < b){
            menor = a;
        }else {
            menor = b;
        }
        
        return menor;   
    }
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int numero1, numero2, resultado;
        
        System.out.println("Ingresa el primer numero: ");
        numero1 = sc.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        numero2 = sc.nextInt();
        
        resultado = minimo(numero1, numero2);
        
        System.out.println("El numero minimo es: " + resultado);
        
        
    }
        
}