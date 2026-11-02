/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excajeregistradora;

import java.util.Scanner;

/**
 *
 * @author saihb
 */
public class ExCajeRegistradora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio;
        double total = 0;
        String entrada;
        boolean continuar = true;
        
        do {
            System.out.print("Introduce el precio del producto (0 para terminar): ");
            entrada = sc.nextLine();
            try {
                precio = Double.parseDouble(entrada);
                if (precio == 0) {
                    continuar = false;
                } else {
                    total = total + precio;
                }
            } catch (NumberFormatException ex) {
                System.out.println("Error de formato. Operación cancelada por seguridad.");
                continuar = false;
            }
        } while (continuar);
        System.out.println("Total de la compra: " + total + " euros");

    }

}
