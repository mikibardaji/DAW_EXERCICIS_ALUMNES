/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exbuclesproductes;

import java.util.Scanner;

/**
 *
 * @author saihb
 */
public class ExBuclesProductes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        String producto;
        String opcion;
        double precio;
        double total = 0;
        int cantidad = 0;

        do {
            System.out.println("Introduce el nombre del producto:");
            producto = sc.nextLine();

            System.out.println("Introduce el precio:");
            precio = sc.nextDouble();
            sc.nextLine();

            total = total + precio;
            cantidad++;

            System.out.println("¿Quieres añadir otro producto? (SI/NO)");
            opcion = sc.nextLine();

        } while (opcion.equalsIgnoreCase("SI"));

        System.out.println("Resumen de la compra");
        System.out.println("Total gastado: " + total + " euros");
        System.out.println("Cantidad de productos: " + cantidad);

    }

}
