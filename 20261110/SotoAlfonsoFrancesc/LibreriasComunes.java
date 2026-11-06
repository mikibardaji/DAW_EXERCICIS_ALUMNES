/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7funciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author fso6590
 */
public class LibreriasComunes {
    //No hace falta poner import si esta en el mismo projecto
        //Pide un dato al usuario numerico
    //no lo devuelve hasta que sea un dato correcto
    
    public static int PedirNumUsuario(String frase) {
    int num = 0;
    boolean numIncorrecto = true;
    Scanner teclado = new Scanner(System.in);
        do {
            
        
    try {
        teclado.nextLine();
        System.out.println(frase);
        num = teclado.nextInt();
        numIncorrecto = true;
    }
    catch(InputMismatchException ex){
        System.out.println("El valor no es un numero");
        numIncorrecto=false;
    }
        
        } while (numIncorrecto==false);
        return num;
    }
    
    
    public static double PedirNumUsuarioDouble(String frase) {
        double num = 0;
        boolean numIncorrecto = true;
        Scanner teclado = new Scanner(System.in);
        do {

            try {
                teclado.nextLine();
                System.out.println(frase);
                num = teclado.nextDouble();
                numIncorrecto = true;
            } catch (InputMismatchException ex) {
                System.out.println("El valor no es un numero");
                numIncorrecto = false;
            }

        } while (numIncorrecto == false);
        return num;
    }
}
