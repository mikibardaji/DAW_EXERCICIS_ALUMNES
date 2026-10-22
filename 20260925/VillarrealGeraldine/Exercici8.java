/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici8;

import java.util.Scanner;
/**
 *
 * @author geral
 */
public class Exercici8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double farenheit, celsius;
        System.out.println("Introdueix la temperatura en Farenheit");
        farenheit=teclado.nextDouble();
        celsius=(farenheit-32)/1.8;
        System.out.println("Son"+celsius+"grados celsius");
        
    }
    
}
