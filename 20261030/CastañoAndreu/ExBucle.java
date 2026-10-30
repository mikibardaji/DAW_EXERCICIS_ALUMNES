/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enunciadobucle2;

import java.util.Scanner;

/**
 *
 * @author aca4354
 */
public class EnunciadoBucle2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String producto, decision;
        int precio, precioTotal = 0, contadorProductos = 0;
        
        do{
            System.out.println("Que producto te interesa?");
            producto = sc.nextLine();
            
            System.out.println("Cuanto cuesta?");
            precio = sc.nextInt();
            sc.nextLine();
            
            System.out.println("Quieres añadir otro producto?");
            decision = sc.nextLine();
            
            precioTotal = precioTotal + precio;
            contadorProductos++;
        }while (decision.equalsIgnoreCase("Si"));
        
        System.out.println("Compra finalizada");
        System.out.println("El gasto total ha sido de " + precioTotal);
        System.out.println("Has comprado " + contadorProductos + " productos");
    }
    
}
