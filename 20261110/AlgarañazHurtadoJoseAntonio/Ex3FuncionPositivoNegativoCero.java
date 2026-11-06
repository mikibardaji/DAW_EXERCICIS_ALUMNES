/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3funcionpositivonegativocero;

import java.util.Scanner;

/**
 *
 * @author jal6318
 */
public class Ex3FuncionPositivoNegativoCero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1, numero2, min;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        numero1 = scan.nextInt();
        System.out.println("Introduce el segundo numero: ");
        numero2 = scan.nextInt();
        min=minimo(numero1, numero2);
        System.out.println("El mas pequeño es: "+min);
        

    }
    public static int minimo(int a, int b){
        if (a<b) {
            return a;
        }else{
            return b;
        }
    
    }

}
