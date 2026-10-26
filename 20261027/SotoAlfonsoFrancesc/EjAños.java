/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejaños;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *
 * @author cescs
 */
public class EjAños {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDateTime hoy = LocalDateTime.now();
        Scanner teclado = new Scanner(System.in);
        int anyo_actual = hoy.getYear();
        int año_usu;
        System.out.println("Dime tu edad y te tu edad en los diferentes años pasados");
        año_usu = teclado.nextInt();
        do {
            System.out.println("En el año "+ anyo_actual+" tenias "+ año_usu +" años");
            año_usu --;
            anyo_actual --;
        } while (año_usu != 0);
    }
    
}
