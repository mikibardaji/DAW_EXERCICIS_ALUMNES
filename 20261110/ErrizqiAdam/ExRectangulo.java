/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exrectangulo;

import java.util.Scanner;

/**
 *
 * @author aer5219
 */
public class ExRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double ancho,alto, perimetro, area;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce ancho de rectangulo: ");
        ancho=sc.nextDouble();
        System.out.print("Introduce alto de rectangulo: ");
        alto=sc.nextDouble();
        
        perimetro = perimetroRectangulo(ancho, alto);
        System.out.println("El perimetro del rectangulo es: " + perimetro);
        
        
        area = areaRectangulo(ancho, alto);
        System.out.println("El area del rectangulo es: " + area);
    }
    
    public static double perimetroRectangulo(double ancho, double alto) {
        double dobleAncho, dobleAlto, perimetro; 
                
        dobleAncho = ancho*2;
        
        dobleAlto = alto*2;
        
        perimetro = dobleAlto + dobleAncho;
        
        return perimetro;

    }
    
    public static double areaRectangulo(double ancho, double alto) {
        double area = ancho * alto;
        
        return area;
    }
}
