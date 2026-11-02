/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package historialcompras;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author saihb
 */
public class HistorialCompras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String producto;
        String historial = "";
        double precio;
        double totalGastado = 0;
        int cantidadCompras = 0;
        int opcion;

        do {
            System.out.println("\n===== HISTORIAL DE COMPRAS =====");
            System.out.println("1. Registrar compra");
            System.out.println("2. Mostrar historial");
            System.out.println("3. Mostrar total gastado");
            System.out.println("4. Mostrar cantidad de compras");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");

            try {
                opcion = sc.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Error: debes introducir un número entero.");
                sc.nextLine();
                opcion = 0;
            }

            switch (opcion) {

                case 1:
                    sc.nextLine();

                    System.out.print("Nombre del producto: ");
                    producto = sc.nextLine();

                    do {
                        try {
                            System.out.print("Precio del producto: ");
                            precio = sc.nextDouble();

                            if (precio <= 0) {
                                System.out.println("El precio debe ser mayor que cero.");
                            }

                        } catch (InputMismatchException ex) {
                            System.out.println("Error: debes introducir un número.");
                            sc.nextLine();
                            precio = -1;
                        }

                    } while (precio <= 0);

                    historial += producto + " - "
                            + String.format("%.2f", precio) + " €\n";

                    totalGastado += precio;
                    cantidadCompras++;

                    System.out.println("Compra registrada correctamente.");
                    break;

                case 2:
                    System.out.println("\n===== HISTORIAL DE COMPRAS =====");

                    if (cantidadCompras == 0) {
                        System.out.println("Todavía no hay compras registradas.");
                    } else {
                        System.out.println(historial);
                    }
                    break;

                case 3:
                    System.out.println("\n===== TOTAL GASTADO =====");

                    if (cantidadCompras == 0) {
                        System.out.println("Todavía no has realizado ninguna compra.");
                    } else {
                        System.out.printf("Total gastado: %.2f €%n", totalGastado);
                    }
                    break;

                case 4:
                    System.out.println("\n===== CANTIDAD DE COMPRAS =====");

                    if (cantidadCompras == 0) {
                        System.out.println("Todavía no has realizado ninguna compra.");
                    } else {
                        System.out.println("Cantidad de compras: " + cantidadCompras);
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }

        } while (opcion != 5);
    }

}
