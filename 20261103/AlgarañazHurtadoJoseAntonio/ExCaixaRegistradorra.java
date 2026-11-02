/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excaixaregistradorra;

import java.util.Scanner;

/**
 *
 * @author José Antonio
 */
public class ExCaixaRegistradorra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String numero;
        double num = 1, precioTotal = 0;
        boolean error = false;
        Scanner scan = new Scanner(System.in);
        do {
            try {
                System.out.println("Introduce el precio del producto: ");
                numero = scan.nextLine();
                num = Double.parseDouble(numero);
                precioTotal += num;
            } catch (NumberFormatException ex) {
                System.out.println("Error de format. Operació cancel·lada per seguretat.");
                error = true;

            }

        } while (num != 0 && (error!=true));
        System.out.println("Precio total: " + precioTotal);
    }

}
