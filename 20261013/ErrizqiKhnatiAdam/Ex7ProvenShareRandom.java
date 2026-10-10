/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex7provensharerandom;

import java.util.Random;

/**
 *
 * @author adamg
 */
public class Ex7ProvenShareRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, simb;
        String carta="", simbolo="";
        
        Random aleatori = new Random();
    
        num = aleatori.nextInt(1,14);
        
        switch(num) {
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
        
        switch(simb) {
            case 1:
                simbolo="Rombos";
                break;
            case 2:
                simbolo="Corazones";
                break;
            case 3:
                simbolo="Picas";
                break;
            case 4:
                simbolo="Treboles";
                break;
        }
        
        System.out.println(carta + " de " + simbolo);
    }
    
}
