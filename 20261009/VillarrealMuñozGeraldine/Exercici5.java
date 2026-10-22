/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici5;

import java.util.Scanner;
/**
 *
 * @author geral
 */
public class Exercici5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        double preuOriginal, descompte=0, preuFinal;
        String estat;
        boolean estatCorrecte=true;
        
        //Mostrar
        System.out.println("Introdueix el preu original");
        //Esperar
        preuOriginal=teclado.nextDouble();
        //Mostar
        System.out.println("Introdueix l'estat (Nou/Bo/Acceptable)");
        //Esperar
        estat=teclado.next();
        
        //Calcular
        if(estat.equalsIgnoreCase("nou"))
            {
            descompte=0;   
            }
        else if(estat.equalsIgnoreCase("Bo"))
            {
            descompte=0.20;    
            }
        else if(estat.equalsIgnoreCase("Acceptable"))
            {
            descompte=0.50;    
            }
        else
            {
                System.out.println("Estat no vàlid");
                estatCorrecte=false;
            }
        
        if(estatCorrecte==true)
            {
            preuFinal=preuOriginal-(preuOriginal*descompte);
            System.out.println("Preu final" + preuFinal + "credits");
            }
    }
    
}
