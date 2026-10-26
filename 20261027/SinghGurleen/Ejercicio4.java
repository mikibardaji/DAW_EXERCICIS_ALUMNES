/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package classe.Ejercicio4;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *
 * @author gurleen
 */
public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);
        
        int edad;
        System.out.println("Dime Tu edad?");
         edad = teclado.nextInt();
        
        LocalDateTime hoy = LocalDateTime.now();
        int anyo_actual = hoy.getYear();
        
        System.out.println("" + anyo_actual);
        
        for (int i = 0; i <= edad; i++)
        {
          System.out.println("Año:" + (anyo_actual - i) + "Edad:" + (edad - i));

        }
       
    }        
