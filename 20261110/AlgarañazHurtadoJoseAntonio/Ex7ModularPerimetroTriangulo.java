/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex7modularperimetrotriangulo;

import java.util.Scanner;

/**
 *
 * @author jal6318
 */
public class Ex7ModularPerimetroTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double base, altura,perimetro, area;
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Introduce la base: ");
        base=scan.nextDouble();
        System.out.println("Introduce la altura: ");
        altura=scan.nextDouble();
        
        perimetro=perimetroRectangulo(base, altura);
        
        area=areaRectangulo(base, altura);
        
        System.out.println("El perimetro es: "+perimetro);
        System.out.println("El area es: "+area);
    }

    public static double perimetroRectangulo(double ancho, double alto) {

        double perimetro;

        perimetro = 2 * (ancho + alto);

        return perimetro;

    }

    public static double areaRectangulo (double ancho, double alto) {
        
        double area;
        
        area=ancho*alto;
        
        return area;
        
    }

    }
