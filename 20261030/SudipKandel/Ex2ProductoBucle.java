/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2bucles;

import java.util.Scanner;

/**
 *
 * @author kande
 */
public class EX2Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);

        int productos = 0;
        int total = 0;
        int precio;
        int saldo = 500;
        String pregunta = "si";
        String nombre;

        while (pregunta.equalsIgnoreCase("si")) {

            System.out.println("Quieres comprar algun producto? (si/no)");
            pregunta = teclado.nextLine();

            if (pregunta.equalsIgnoreCase("si")) {

                System.out.println("Que producto quieres comprar?");
                nombre = teclado.nextLine();

                System.out.println("Cuanto vale el producto?");
                precio = teclado.nextInt();
                teclado.nextLine();

                if (precio <= saldo) {

                    saldo = saldo - precio;
                    total = total + precio;
                    productos = productos + 1;

                    System.out.println("Has comprado: " + nombre);
                    System.out.println("Te quedan " + saldo + " creditos");

                } else {

                    System.out.println("No tienes suficiente dinero");
                }

            }
        }

        System.out.println("Has comprado " + productos + " productos");
        System.out.println("Has gastado " + total + " creditos");
        System.out.println("Te quedan " + saldo + " creditos");

    }
}
