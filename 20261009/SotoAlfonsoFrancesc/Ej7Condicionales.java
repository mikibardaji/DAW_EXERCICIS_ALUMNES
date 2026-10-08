/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej7condicionales;

import java.util.Scanner;

/**
 *
 * @author cescs
 */
public class Ej7Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double precio;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuanto vale el libro: ");
        precio = teclado.nextDouble();
        if (precio < 15) {
            System.out.println("Preu excel·lent! És una ganga.");
        }else if (precio >= 15 && precio <= 35) {
            System.out.println("Preu estàndard i correcte per a un llibre.");
        }else if (precio > 35 && precio < 50) {
            System.out.println("Atenció: Aquest llibre té un preu superior a la mitjana.");
        }else if (precio > 50) {
            System.out.println("Error preu no vàlid");
        }
    }
    
}
