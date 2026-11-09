/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici7funciones;

import java.util.Scanner;

/**
 *
 * @author saihb
 */
public class Exercici7Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         double ancho, alto, area, perimetro;
         
        System.out.print("Introduce el ancho: ");
        ancho=sc.nextDouble();

        System.out.print("Introduce el alto: ");
        alto=sc.nextDouble();

        area=areaRectangulo(ancho, alto);
        perimetro=perimetroRectangulo(ancho, alto);
        System.out.println("El area es: " +area);
        System.out.println("El perimetro es: " +perimetro);
    }
    
    public static double perimetroRectangulo(double ancho, double alto) {
        return 2*(ancho+alto);
    }

    public static double areaRectangulo(double ancho, double alto) {
        return ancho*alto;
    }
    
}
