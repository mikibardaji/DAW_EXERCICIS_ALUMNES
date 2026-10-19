/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excercicibuclev1.pkg2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kande
 */
public class ExcerciciBuclev12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroPensado = random.nextInt(1, 101);
        int numero;
        int intentos = 0;

        System.out.println("Adivina el numero del 1 al 100:");
        numero = sc.nextInt();
        intentos++;

        while (numero != numeroPensado && intentos < 5) {

            if (numero < numeroPensado) {
                System.out.println("El numero es mayor");
            } else {
                System.out.println("El numero es menor");
            }

            System.out.println("Intentalo otra vez:");
            numero = sc.nextInt();
            intentos++;
        }

        if (numero == numeroPensado) {
            System.out.println("Acertaste");
            System.out.println("Intentos realizados: " + intentos);
        } else {
            System.out.println("Has perdido. El numero era " + numeroPensado);
        }
    }
