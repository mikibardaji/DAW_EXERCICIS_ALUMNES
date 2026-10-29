/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exdeprovenshare;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Exdeprovenshare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // CALCULAR: variables iniciales
        double saldo = 500;
        double gastado = 0;
        int cantidad = 0;
        int opcion = 0;

        // ESPERAR: repetir el menu
        while (opcion != 3) {

            // MOSTRAR: menu principal
            System.out.println("\n--- MENU ---");
            System.out.println("1. Ingressar diners");
            System.out.println("2. Comprar producte");
            System.out.println("3. Sortir");
            System.out.print("Tria una opcio: ");

            // ESPERAR: leer la opcion
            opcion = sc.nextInt();
            sc.nextLine();

            // CALCULAR: elegir la opcion
            switch (opcion) {

                case 1:

                    // ESPERAR: pedir dinero
                    System.out.print("Quants diners vols ingressar? ");
                    double diners = sc.nextDouble();
                    sc.nextLine();

                    // CALCULAR: sumar dinero
                    saldo = saldo + diners;

                    // MOSTRAR: nuevo saldo
                    System.out.println("Saldo actual: " + saldo);
                    break;

                case 2:

                    // ESPERAR: pedir producto y precio
                    System.out.print("Introdueix el producte: ");
                    String producte = sc.nextLine();

                    System.out.print("Introdueix el preu: ");
                    double preu = sc.nextDouble();
                    sc.nextLine();

                    // CALCULAR: comprobar el saldo
                    if (saldo >= preu) {

                        saldo = saldo - preu;
                        gastado = gastado + preu;
                        cantidad = cantidad + 1;

                        // MOSTRAR: compra aceptada
                        System.out.println("Compra acceptada");
                        System.out.println("Saldo actual: " + saldo);

                    } else {

                        // MOSTRAR: saldo insuficiente
                        System.out.println("No tens saldo suficient");
                    }

                    break;

                case 3:

                    // ESPERAR: confirmar la salida
                    System.out.print("Vols sortir? (SI/NO): ");
                    String resposta = sc.nextLine();

                    if (resposta.equalsIgnoreCase("SI")
                            || resposta.equalsIgnoreCase("SÍ")) {

                        // MOSTRAR: resultados finales
                        System.out.println("Diners gastats: " + gastado);
                        System.out.println("Articles comprats: " + cantidad);
                        System.out.println("Saldo final: " + saldo);

                    } else {

                        // CALCULAR: volver al menu
                        opcion = 0;
                    }

                    break;

                default:

                    // MOSTRAR: opcion incorrecta
                    System.out.println("Opcio incorrecta");
                    
                        
                    
    
            }
        }

    }
}