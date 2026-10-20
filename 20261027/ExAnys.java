/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exanys;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *
 * @author aer5219
 */
public class ExAnys {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDateTime hoy = LocalDateTime.now();  
        int anyo_actual = hoy.getYear(), userAge;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce tu edad");
        userAge = sc.nextInt();
        
        do{
            System.out.println(anyo_actual + " - " + userAge);
            userAge--;
            anyo_actual--;
        } while (userAge>=0);
        
    }
    
}
