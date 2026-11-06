/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoriafuncioneshelloworld;

import java.util.Scanner;

/**
 *
 * @author gba0006
 */
public class EXERCISI7 {
    public static void main(String[] args) {
        double ancho = PedirDatos();
        double alto = PedirDatos();
        perimetroRectangulo(ancho, alto);
        double per = perimetroRectangulo(ancho, alto);
        System.out.println("El perimetro es de: " + per);
        areaRectangulo(ancho, alto);
        double area = areaRectangulo(ancho, alto);
        System.out.println("El area es de: " + area);
        
    }
    public static double PedirDatos(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Dime el ancho: ");
        double num = sc.nextDouble();
        return num;
        
    }
    public static double perimetroRectangulo(double ancho, double alto){
        double perimetro = 2*(ancho + alto);
        return perimetro;
    }
    
    public static double areaRectangulo(double ancho, double alto){
        double area = ancho * alto;
        return area;
    }
     
}
