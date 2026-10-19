/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciobuclesv1.pkg1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kande
 */
public class ExercicioBuclesv11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroPensado = random.nextInt(1, 101);
        int numero;

        System.out.println("Adivina el numero del 1 al 100:");
        numero = sc.nextInt();

        while (numero != numeroPensado) {

            if (numero < numeroPensado) {
                System.out.println("El numero es mayor");
            } else {
                System.out.println("El numero es menor");
            }

            System.out.println("Intentalo otra vez:");
            numero = sc.nextInt();
        }

        System.out.println("Acertaste");


    }
}
