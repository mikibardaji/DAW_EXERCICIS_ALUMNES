/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex7programasumanegativos;

import java.util.Scanner;

/**
 *
 * @author José Antonio
 */
public class Ex7ProgramaSumaNegativos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, cont, contNega = 0, contPosi = 0;
        boolean nulo=false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce 10 numeros no nulos: ");
        for (cont = 1; cont <= 10; cont++) {
            System.out.println("Introduce el " + cont + " numero: ");
            num = scan.nextInt();
            if (num > 0) {
                ++contPosi;

            } else if (num < 0) {
                ++contNega;

            }else{
                nulo=true;
            
            }

        }
        System.out.println("Se han introducido " + contPosi+ " postivos");
        System.out.println("Se han introducido " + contNega+ " negativos");
        if (nulo) {
            System.out.println("Se ha escrito al menos un numero nulo");
        }

    }

}
