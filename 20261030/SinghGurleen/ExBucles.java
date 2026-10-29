/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package classe.ExBucles;

import java.util.Scanner;

/**
 *
 * @author Gurleen
 */
public class ExBucles {

    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);
       
        double preu, total = 0;
        int quantitat = 0 ;
        String resposta = "SI";

        while (resposta.equalsIgnoreCase("SI")) {
            System.out.print("Introdueix el preu: ");
            preu = teclado.nextDouble();

            total = total + preu;
            quantitat++;

            System.out.print("Vols comprar més? (SI/NO): ");
            resposta = teclado.next();
        }

        System.out.println("Total gastat: " + total + " €");
        System.out.println("Productes comprats: " + quantitat);

    }
}
