/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici6;

import java.util.Scanner;
/**
 *
 * @author geral
 */
public class Exercici6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double preu_total, descompte, preu_descompte, preu_final;
        
        System.out.println("Quin és el preu total?");
        preu_total=teclado.nextDouble();
        System.out.println("Quin és el descompte?");
        descompte=teclado.nextDouble();
        //Calular preu_descompte
        preu_descompte=preu_total*descompte/100;
        //calcular preu_final
        preu_final=preu_total-preu_descompte;
        System.out.println("El preu del producte és"+preu_final);
        
    }
    
}
