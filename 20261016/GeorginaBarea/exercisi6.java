
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gba0006
 */
public class exercisi6 {
    public static void main(String[] args){
     Scanner teclado = new Scanner(System.in);
        
        int num;
        int contador = 0;
        boolean negativo = false;
        
        while (contador < 10) 
        {
            System.out.println("Introdueix un numero no nul");
            num = teclado.nextInt();
            
            if (num != 0) {
                contador++;
                if (num < 0) {
                    negativo = true;
                }
            } else {
                System.out.println("El numero no pot ser 0");
            }
        }
        
        if (negativo)
        {
            System.out.println("Hi ha algun numero negatiu");
        } else {
            System.out.println("No hi ha ningun numero negatiu");
        }
}
    }
