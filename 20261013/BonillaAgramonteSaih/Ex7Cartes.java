/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex7cartes;

import java.util.Random;

/**
 *
 * @author saihb
 */
public class Ex7Cartes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random ran = new Random();
        int numero, palo;
        String nomCarta="", nomPalo="";
        
        numero = ran.nextInt(13);
        palo = ran.nextInt(4);
        
           switch (numero) {
            case 1:
                nomCarta = "As";
                break;
            case 2:
                nomCarta = "2";
                break;
            case 3:
                nomCarta = "3";
                break;
            case 4:
                nomCarta = "4";
                break;
            case 5:
                nomCarta = "5";
                break;
            case 6:
                nomCarta = "6";
                break;
            case 7:
                nomCarta = "7";
                break;
            case 8:
                nomCarta = "8";
                break;
            case 9:
                nomCarta = "9";
                break;
            case 10:
                nomCarta = "Sota";
                break;
            case 11:
                nomCarta = "Caballo";
                break;
            case 12:
                nomCarta = "Rey";
                break;
        }
             switch (palo) {
            case 0:
                nomPalo = "oros";
                break;
            case 1:
                nomPalo = "copas";
                break;
            case 2:
                nomPalo = "espadas";
                break;
            case 3:
                nomPalo = "bastos";
                break;
        }
           System.out.println("La carta que te ha tocado es: " + nomCarta + " de " + nomPalo);
         
    }
    
}
