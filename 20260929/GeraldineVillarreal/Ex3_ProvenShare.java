/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3_provenshare;

import java.util.Scanner;
/**
 *
 * @author geral
 */
public class Ex3_ProvenShare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        double credito, preciohora, horas, totalhoras, total;
        boolean cierto;
        //Mostrar "Dime tu credito total"
        System.out.println("Dime tu credito");
        //Esperar credito
        credito=teclado.nextDouble();
        //Mostrar "Cuanto vale la hora"
        System.out.println("Cuanto vale la hora");
        //Esperar preciohora
        preciohora=teclado.nextDouble();
        //Mostrar "Cuantas horas quieres contratar el servicio"
        System.out.println("Cuantas horas quieres contratar el servicio");
        //Esperar horas
        horas=teclado.nextDouble();
        //Calcular totalhoras=preciohora*horas
        totalhoras=preciohora*horas;
        //total+credito=flase
        cierto=totalhoras<=credito;
        System.out.println("Puedes pagarlo?"+cierto);
    }
    
}

