 /* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex7funcions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author aca4354
 */
public class Ex7Funcions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double perimetro, area, alto, ancho;
        
        System.out.print("Introduce el ancho del rectangulo: ");
        ancho = sc.nextDouble();
        
        System.out.print("Introduce la altura del rectangulo: ");
        alto = sc.nextDouble();
        
        perimetro = perimetroRectangulo(ancho, alto);
        System.out.println("El perimetro del rectangulo es: " + perimetro);
        
        
        area = areaRectangulo(ancho, alto);
        System.out.println("El area del rectangulo es: " + area);
        
        
    }
    
    public static double perimetroRectangulo(double ancho, double alto)
    {
        double perimetro;
        perimetro = 2*ancho + 2*alto;
        return perimetro;
        
    }
    public static double areaRectangulo(double ancho, double alto)
    {
        double area;
        area = ancho * alto;
        return area;
        
    }   
}
