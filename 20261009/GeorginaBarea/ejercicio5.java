/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercisis1009;

import java.util.Scanner;

/**
 *
 * @author gba0006
 */
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double preuOriginal, descompte, preuFinal;
        String estatProducte, frase;
        
        System.out.println("Quin es el preu original?");
        preuOriginal = teclado.nextDouble();
        
        System.out.println("Quin es l'estat del producte?");
        estatProducte = teclado.next();
        
        if (estatProducte.equalsIgnoreCase("Nou")) {
            preuFinal = preuOriginal;
            frase = "El preu final es de " + preuFinal + "€";
        } else if (estatProducte.equalsIgnoreCase("Bo")){
            descompte = preuOriginal * 0.2;
            preuFinal = preuOriginal - descompte;
           frase = "El preu final es de " + preuFinal + "€";
        }  else if (estatProducte.equalsIgnoreCase("Acceptable")){
            descompte = preuOriginal * 0.5;
            preuFinal = preuOriginal - descompte;
            frase = "El preu final es de " + preuFinal + "€";
        } else {
            frase = "Error";
        }
        
        System.out.println(frase);
}
}
