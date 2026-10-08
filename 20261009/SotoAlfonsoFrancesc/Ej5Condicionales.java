/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5condicionales;

import java.util.Scanner;

/**
 *
 * @author cescs
 */
public class Ej5Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double precio, calculo, descuento;
        String estado=null;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime cuanto cuesta el producto");
        precio = teclado.nextDouble();
        System.out.println("Ahora dime el estado del producto");
        teclado.nextLine();
        estado = teclado.nextLine();
        if (estado.equalsIgnoreCase("nou")) {
            System.out.println("El precio se mantiene igual ya que el producto es nuevo");
            System.out.println("El total seria de "+precio+"€");
        }else if (estado.equalsIgnoreCase("Bo")) {
            calculo = precio * 0.2;
            descuento = precio - calculo;
            System.out.println("Por ser bueno el producto te haremos un descuento del 20%");
            System.out.println("El total seria: "+descuento+"€");
        }else if (estado.equalsIgnoreCase("acceptable")) {
            calculo = precio * 0.5;
            descuento = precio - calculo;
            System.out.println("Por ser acceptable se te aplicara un 50% de descuento");
            System.out.println("El total seria: "+descuento+"€");
        }else {
            System.out.println("Eso no es un parametro acceptable");
        }
    }
    
}
