/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compraproducto;

import java.util.Scanner;

/**
 *
 * @author sthef
 */
public class CompraProducto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String producto, respuesta;
        double precio, gastoTotal = 0;
        int contadorProductos = 0;

        do {
            System.out.print("Introduce el producto: ");
            producto = sc.next();

            System.out.print("Introduce el precio: ");
            precio = sc.nextDouble();

            gastoTotal = gastoTotal + precio;
            contadorProductos++;

            System.out.print("Quieres comprar otro producto? SI/NO: ");
            respuesta = sc.next();

        } while (respuesta.equalsIgnoreCase("SI"));

        System.out.println("Total gastado: " + gastoTotal);
        System.out.println("Productos comprados: " + contadorProductos);
    }
    
}
