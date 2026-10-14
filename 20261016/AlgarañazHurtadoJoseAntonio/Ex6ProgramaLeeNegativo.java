/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex6programaleenegativo;

import java.util.Scanner;

/**
 *
 * @author José Antonio
 */
public class Ex6ProgramaLeeNegativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 0, contNumeros = 0;
        boolean negativo = false;
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce 10 numeros no nulos: ");
        do {

            num = scan.nextInt();
            ++contNumeros;
            if (contNumeros < 10) {

                System.out.println("Introduce otro numero ");
                if (num < 0) {
                    negativo = true;
                }

            }

        } while (contNumeros < 10);
        if (negativo) {
            System.out.println("Se ha introducido un numero negativo ");
        }

    }

}
