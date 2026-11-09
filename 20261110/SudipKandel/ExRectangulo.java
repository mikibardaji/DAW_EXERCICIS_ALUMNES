/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exretangulo;

import java.util.Scanner;

/**
 *
 * @author kande
 */
public class ExRetangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        double ancho, alto;

        System.out.print("Escribe el ancho del rectangulo: ");
        ancho = sc.nextDouble();

        System.out.print("Escribe el alto del rectangulo: ");
        alto = sc.nextDouble();

        System.out.println("El area es: " + areaRectangulo(ancho, alto));
        System.out.println("El perimetro es: " + perimetroRectangulo(ancho, alto));
    }

    public static double perimetroRectangulo(double ancho, double alto) {
        double resultado = (ancho * 2) + (alto * 2);
        return resultado;
    }

    public static double areaRectangulo(double ancho, double alto) {
        double resultado = ancho * alto;
        return resultado;
    }
}
