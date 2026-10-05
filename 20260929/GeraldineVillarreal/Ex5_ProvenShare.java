/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5_provenshare;

import java.util.Scanner;
/**
 *
 * @author geral
 */
public class Ex5_ProvenShare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double euro, provenshare;
        //Mostrar "Cantidad de euros reales"
        System.out.println("Cantidad de euros reales");
        //Esperar euro
        euro=teclado.nextDouble();
        //Calcular provenshare=euro*8
        provenshare=euro*8;
        //Mostrar "Al cambio son: "+provenshare+creditos provenshare"
        System.out.println("Al cambio son:"+provenshare+"creditos ProvenShare");
    }
    
}
