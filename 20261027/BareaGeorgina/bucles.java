/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lamaquinaadivina;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gba0006
 */
public class bucles {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        int edad;
        int num;
        
        LocalDateTime hoy = LocalDateTime.now();
        int anyo_actual = hoy.getYear();
        
        System.out.println("Dime tu edad: ");
        edad = teclado.nextInt();
        num = anyo_actual - edad;
       
       
        do{
            System.out.println(num);
            ++num;
        }while(num <= anyo_actual);
        
    }
}
