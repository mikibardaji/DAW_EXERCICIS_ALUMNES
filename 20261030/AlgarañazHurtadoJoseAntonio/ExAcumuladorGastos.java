/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exacumuladorgastos;

import java.util.Scanner;

/**
 *
 * @author José Antonio
 */
public class ExAcumuladorGastos {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        String producto, servicios;
        int precio, sumaTotal=0, cantidadProd=0;
        boolean Desicion = true;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Que producto quieres comprar: ");
            producto = scan.nextLine();
            System.out.println("Cual es su precio: ");
            precio = scan.nextInt();
            cantidadProd++;
            scan.nextLine();
            sumaTotal+=precio;
            System.out.println("Quieres contrartar mas servicios?: (SI/NO)");
            servicios = scan.nextLine();
            if (servicios.equalsIgnoreCase("NO")) {
                Desicion = false;

            }

        } while (Desicion != false);
        System.out.println("Cantidad productos: "+cantidadProd);
        System.out.println("Valor total: "+sumaTotal);
        

    }
    
}
