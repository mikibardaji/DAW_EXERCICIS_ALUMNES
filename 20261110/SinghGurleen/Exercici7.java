/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package classe.Exercici7

import java.util.Scanner;

/**
 *
 * @author gurleen
 */
public class Exercici7 {

       public static void main(String[] args) {
        System.out.println("Introduce el ancho:");
        double ancho = pedirNumero();

        System.out.println("Introduce el alto:");
        double alto = pedirNumero();

        System.out.println("Perimetro: " + perimetroRectangulo(ancho, alto));
        System.out.println("Area: " + areaRectangulo(ancho, alto));
    }

    public static double pedirNumero() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextDouble();
    }

    public static double perimetroRectangulo(double ancho, double alto){
        return 2 * (ancho + alto);
    }

    public static double areaRectangulo(double ancho, double alto){
        return ancho * alto;
    }
}
