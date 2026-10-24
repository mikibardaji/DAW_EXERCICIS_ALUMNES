/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4.de.edad;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ex4DeEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad, anyoActual, anyoNacimiento, anyo;
        LocalDateTime hoy;

        // PEDIR LA EDAD
        System.out.print("Introduce tu edad: ");
        edad = sc.nextInt();

        // OBTENER EL AÑO ACTUAL
        hoy = LocalDateTime.now();
        anyoActual = hoy.getYear();

        // CALCULAR EL AÑO DE NACIMIENTO
        anyoNacimiento = anyoActual - edad;

       
        System.out.println("Año actual: " + anyoActual);
        

        // MOSTRAR LA EDAD DE CADA AÑO
        for (anyo = anyoActual; anyo >= anyoNacimiento; anyo--) 
        {
            System.out.println("En el año " + anyo + " tenias " + (edad - (anyoActual - anyo)) + " años");
        }
        System.out.println("Año de nacimiento: " + anyoNacimiento);
    }
    
    
}
