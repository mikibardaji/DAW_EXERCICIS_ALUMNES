/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package classe.Ejercicio7;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gurleen
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner ( System.in);
       
               int num, simb;

        String carta = "", tipuscarta = "";

        Random aleatori = new Random();

        num = aleatori.nextInt(1, 14);

        switch (num) {

            case 1:
                carta = "A";
                break;
            case 2:
                carta = "2";
                break;
            case 3:
                carta = "3";
                break;
            case 4:
                carta = "4";
                break;
            case 5:
                carta = "5";
                break;
            case 6:
                carta = "6";
                break;
            case 7:
                carta = "7";
                break;
            case 8:
                carta = "8";
                break;
            case 9:
                carta = "9";
                break;
            case 10:
                carta = "10";
                break;
            case 11:
                carta = "J";
                break;
            case 12:
                carta = "Q";
                break;

            case 13:
                carta = "K";
                break;

        }

        simb = aleatori.nextInt(1, 5);

        switch (simb) {

            case 1:
                tipuscarta = "Rombos";
                break;

            case 2:
                tipuscarta = "Corazones";
                break;

            case 3:
                tipuscarta = "Picas";
                break;

            case 4:
                tipuscarta = "Treboles";
                break;

        }

        System.out.println(carta + " de " + tipuscarta);

    }

}
