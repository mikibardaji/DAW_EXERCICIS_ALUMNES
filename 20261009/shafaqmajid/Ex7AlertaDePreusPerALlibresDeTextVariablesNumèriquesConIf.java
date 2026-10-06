/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex7alerta.de.preus.per.a.llibres.de.text.variables.numèriques.con.pkgif;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ex7AlertaDePreusPerALlibresDeTextVariablesNumèriquesConIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        // Variable
        double preu;

        // MOSTRAR
        System.out.print("Introdueix el preu del llibre en credits: ");

        // ESPERAR
        preu = sc.nextDouble();

        // CALCULAR
        if (preu < 0) {

            // MOSTRAR
            System.out.println("Error preu no valid");

        } else if (preu < 15.0) {

            // MOSTRAR
            System.out.println("Preu excel·lent! Es una ganga.");

        } else if (preu >= 15.0 && preu <= 35.0) {

            // MOSTRAR
            System.out.println("Preu estàndard i correcte per a un llibre.");

        } else {

            // MOSTRAR
            System.out.println("Atencio: Aquest llibre te un preu superior a la mitjana.");
        }
    }
}
    
    

