/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programamultiple;

import java.util.Scanner;

/**
 *
 * @author jco5780
 */
public class ProgramaMultiple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int multiple, n_user, contador=0;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el valor y mostrare los 10 numeros siguientes ");
        n_user = teclado.nextInt();
        
//        for (int j = 0; j < 10; j++) {
//            multiple = n_user + (j * 7);
//            System.out.println(multiple);
//        }
        while (contador<=10){
            if (n_user%7==0){
                contador++;
                System.out.println(n_user + "es multiple de 7, llevas " + contador);
            }
            n_user++;
        }
        System.out.println("fin de programa");
    }
    
}
