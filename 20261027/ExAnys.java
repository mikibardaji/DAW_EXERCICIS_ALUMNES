/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicianys;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *
 * @author andca
 */
public class ExerciciAnys {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        LocalDateTime hoy = LocalDateTime.now();  
        int anyo_actual = hoy.getYear(), edad;
       
        
        System.out.println("Introduce tu edad");
        edad = sc.nextInt();
        
        do{
            System.out.println(anyo_actual + " - " + edad);
            edad--;
            anyo_actual--;
        } while (edad>=0);
    }
    
}
