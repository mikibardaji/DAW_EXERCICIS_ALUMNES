/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex7alerta.de.preus.per.a.llibres.de.text.variables.numèriques.conswitch;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ex7AlertaDePreusPerALlibresDeTextVariablesNumèriquesConswitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        // VARIABLES
        double preu;
        int categoria;

        // MOSTRAR
        System.out.print("Introdueix el preu del llibre en credits: ");

        // ESPERAR
        preu = sc.nextDouble();

        // CALCULAR
        if (preu < 0) {
            categoria = 0;
        } else if (preu < 15.0) {
            categoria = 1;
        } else if (preu <= 35.0) {
            categoria = 2;
        } else {
            categoria = 3;
        }

        // MOSTRAR
        switch (categoria) {

            case 0:
                System.out.println("Error preu no valid");
                break;

            case 1:
                System.out.println("Preu excel·lent! Es una ganga.");
                break;

            case 2:
                System.out.println("Preu estandard i correcte per a un llibre.");
                break;

            case 3:
                System.out.println("Atencio: Aquest llibre te un preu superior a la mitjana.");
                break;
        }
    }
}
    
