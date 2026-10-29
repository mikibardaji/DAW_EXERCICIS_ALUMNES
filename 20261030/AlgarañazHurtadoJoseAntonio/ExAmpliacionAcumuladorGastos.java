/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exampliacionacumuladorgastos;

import java.util.Scanner;

/**
 *
 * @author José Antonio
 */
public class ExAmpliacionAcumuladorGastos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String producto, servicios, eleccion;
        int precio, saldo = 500, sumaTotal = 0, cantidadProd = 0, opciones, ingreso;

        boolean Desicion = true, SINO = false, saldoInsuficiente = false;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Tienes tres opciones:");
            System.out.println("1.Ingressar diners");
            System.out.println("2.Comprar producte");
            System.out.println("3.Sortir");
            System.out.println("Introduce la opcio:");
            opciones = scan.nextInt();
            if (opciones == 1) {
                System.out.println("Cuanto dinero quieres ingresar: ");
                ingreso = scan.nextInt();
                saldo += ingreso;
                System.out.println("Has ingresado: " + ingreso);
                System.out.println("Tienes en total: " + saldo);
            } else if (opciones == 2) {

                do {
                    scan.nextLine();
                    System.out.println(saldo);
                    System.out.println("Que producto quieres comprar: ");
                    producto = scan.nextLine();
                    System.out.println("Cual es su precio: ");
                    precio = scan.nextInt();
                    saldo -= precio;
                    sumaTotal += precio;
                    cantidadProd++;

                    if (saldo > 0) {
                        scan.nextLine();
                        System.out.println("Quieres contrartar mas servicios?: (SI/NO)");
                        servicios = scan.nextLine();
                        if (servicios.equalsIgnoreCase("NO")) {
                            Desicion = false;

                        }
                    } else {
                        System.out.println("Su saldo es insuficiente...");
                        saldoInsuficiente = true;
                        

                    }

                } while ((Desicion != false) && (saldoInsuficiente != true));
                System.out.println("Cantidad productos: " + cantidadProd);
                System.out.println("Valor total: " + sumaTotal);
            } else if (opciones == 3) {
                scan.nextLine();
                System.out.println("Quieres salir? (SI/NO)");
                eleccion = scan.nextLine();
                if (eleccion.equalsIgnoreCase("SI")) {
                    System.out.println("Dinero gastado: " + sumaTotal);
                    System.out.println("Articulos comprados: " + cantidadProd);
                    SINO = true;

                }

            }

        } while ((opciones != 3) || (SINO != true));

    }
}
