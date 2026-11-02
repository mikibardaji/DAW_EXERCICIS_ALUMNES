/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestorahorros;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class GestorAhorros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CREAR OBJETOS
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // VARIABLES
        
        double saldo = 500, cantidad;
        int opcion;
        boolean salir = false;

        
        // MOSTRAR MENU
        while (salir == false) {

            System.out.println("\n===== GESTOR DE AHORROS =====");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Ahorro aleatorio");
            System.out.println("5. Salir");

            System.out.print("Elige una opcion: ");

            // LEER OPCION
            try {

                opcion = sc.nextInt();

                // COMPROBAR OPCION
                switch (opcion) {

                    case 1:

                        // CONSULTAR SALDO
                        System.out.println("Tu saldo actual es: "
                                + saldo + " euros");

                        break;

                    case 2:

                        // INGRESAR DINERO
                        try {

                            System.out.print("Cuanto dinero quieres ingresar? ");
                            cantidad = sc.nextDouble();

                            if (cantidad > 0) {

                                saldo = saldo + cantidad;

                                System.out.println("Ingreso realizado correctamente.");
                                System.out.println("Nuevo saldo: " + saldo + " euros");

                            } else {

                                System.out.println("La cantidad debe ser mayor que 0.");

                            }

                        } catch (InputMismatchException e) {

                            System.out.println("Error: introduce una cantidad numerica.");
                            sc.nextLine();

                        }

                        break;

                    case 3:

                        // RETIRAR DINERO
                        try {

                            System.out.print("Cuanto dinero quieres retirar? ");
                            cantidad = sc.nextDouble();

                            if (cantidad > 0 && cantidad <= saldo) {

                                saldo = saldo - cantidad;

                                System.out.println("Retirada realizada correctamente.");
                                System.out.println("Nuevo saldo: " + saldo + " euros");

                            } else {

                                System.out.println("No puedes retirar esa cantidad.");

                            }

                        } catch (InputMismatchException e) {

                            System.out.println("Error: introduce una cantidad numerica.");
                            sc.nextLine();

                        }

                        break;

                    case 4:

                        // GENERAR AHORRO ALEATORIO
                        cantidad = random.nextInt(50) + 1;

                        saldo = saldo + cantidad;

                        System.out.println("Has ahorrado " + cantidad + " euros.");
                        System.out.println("Nuevo saldo: " + saldo + " euros");

                        break;

                    case 5:

                        // SALIR DEL PROGRAMA
                        salir = true;

                        System.out.println("Gracias por utilizar Gestor de Ahorros.");

                        break;

                    default:

                        System.out.println("Opcion no valida. Elige del 1 al 5.");

                }

            } catch (InputMismatchException e) {

                System.out.println("Error: introduce un numero.");
                sc.nextLine();
               }
            }
        }
    }

                
                


