/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buclesiterativos;

import java.util.Scanner;

/**
 *
 * @author sthefasf
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numero;
        int contadorNegativos = 0;
        
        for (int  i = 0;  i < 10;  i++) {
            do{
            System.out.print("Ingrese el numero elegido: ");
            numero = sc.nextInt();
             
               if(numero ==0){
                 System.out.println("Error, numero no valido. ");
               }
            }while (numero == 0);
            
            if (numero<0){
                contadorNegativos++; 
            }
        }
        if (contadorNegativos > 0){
            System.out.println("Hay " + contadorNegativos + " numeros negativos. ");
        }
        else {
            System.out.println("No hay numero negativos");
        }
    }
}
