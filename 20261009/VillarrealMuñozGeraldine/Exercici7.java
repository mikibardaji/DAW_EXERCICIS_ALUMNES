/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici7;

import java.util.Scanner;
/**
 *
 * @author gvi6123
 */
public class Exercici7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        double preuLlibreCredit;
        
        System.out.println("Quin és el preu del llibre en crèdits?");
        preuLlibreCredit=sc.nextDouble();
        
        if(preuLlibreCredit<15.0)
            {
                System.out.println("Preu excel·lent! És una ganga");
            }
        else if(preuLlibreCredit>=15 && preuLlibreCredit<=35 )
            {
                System.out.println("Preu estàndard i correcte per a un llibre");      
            }
        else
            {
                System.out.println("Atenció: Aquest llibre té un preu superior a la mitjana");
            }
       
    }
    
}
