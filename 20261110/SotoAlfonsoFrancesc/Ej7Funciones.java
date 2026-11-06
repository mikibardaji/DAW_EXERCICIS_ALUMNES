/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej7funciones;

/**
 *
 * @author fso6590
 */
public class Ej7Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double ancho, alto, perimetro, area;
        ancho = LibreriasComunes.PedirNumUsuarioDouble("Dime el ancho: ");
        alto = LibreriasComunes.PedirNumUsuarioDouble("Dime la altura: ");
        perimetro = perimetroRectangulo(ancho, alto);
        area = areaRectangulo(ancho, alto);
        System.out.println("El perimetro es : "+perimetro);
        System.out.println("El area es : "+area);
    }
    
    public static double perimetroRectangulo(double ancho, double alto) {
        double perimetro;
        perimetro = 2 * ancho + 2 * alto;
        return perimetro;
    }
    
    
    public static double areaRectangulo(double ancho, double alto) {
        double area;
        area = alto * ancho;
        return area;
    }
}
