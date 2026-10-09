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
public class ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double preu;
        System.out.println("Quant val el llibre: ");
        preu = teclado.nextDouble();
        if (preu < 15) {
            System.out.println("Preu excel·lent!");
        }else if (preu >= 15 && preu <= 35) {
            System.out.println("Preu correcte.");
        }else if (preu > 35 && preu < 50) {
            System.out.println("Atenció: Aquest llibre té un preu superioru.");
        }else if (preu > 50) {
            System.out.println("Preu no v?lid");}
    }
}
