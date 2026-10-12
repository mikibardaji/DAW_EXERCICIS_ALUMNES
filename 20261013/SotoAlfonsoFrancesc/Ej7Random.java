/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej7random;

import java.util.Random;

/**
 *
 * @author cescs
 */
public class Ej7Random {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random aleatorio = new Random();
        int forma, numero;
        System.out.println("Triare una carta de poker aleatoriament i te la ensenyare");
        forma = aleatorio.nextInt(1,5);
        numero = aleatorio.nextInt(1,16);
        if (forma == 1) {
            switch  (numero) {
                case 1:
                    System.out.println("Te ha salido el 1 de corazones");
                    break;
                case 2:
                    System.out.println("Te ha salido el 2 de corazones");
                    break;
                case 3:
                    System.out.println("Te ha salido el 3 de corazones");
                    break;
                case 4:
                    System.out.println("Te ha salido el 4 de corazones");
                    break;
                case 5:
                    System.out.println("Te ha salido el 5 de corazones");
                    break;
                case 6:
                    System.out.println("Te ha salido el 6 de corazones");
                    break;
                case 7:
                    System.out.println("Te ha salido el 7 de corazones");
                    break;
                case 8:
                    System.out.println("Te ha salido el 8 de corazones");
                    break;
                case 9:
                    System.out.println("Te ha salido el 9 de corazones");
                    break;
                case 10:
                    System.out.println("Te ha salido el 10 de corazones");
                    break;
                case 11:
                    System.out.println("Te ha salido la J de corazones");
                    break;
                case 12:
                    System.out.println("Te ha salido la Q de corazones");
                    break;
                case 13:
                    System.out.println("Te ha salido la K de corazones");
                    break;
                case 14:
                    System.out.println("Te ha salido un JOKER");
                    break;
                case 15:
                    System.out.println("Te ha salido un JOKER");
                    break;
                default:
                    break;
            }
        }else if (forma == 2) {
                  switch  (numero) {
                case 1:
                    System.out.println("Te ha salido el 1 de diamantes");
                    break;
                case 2:
                    System.out.println("Te ha salido el 2 de diamantes");
                    break;
                case 3:
                    System.out.println("Te ha salido el 3 de diamantes");
                    break;
                case 4:
                    System.out.println("Te ha salido el 4 de diamantes");
                    break;
                case 5:
                    System.out.println("Te ha salido el 5 de diamantes");
                    break;
                case 6:
                    System.out.println("Te ha salido el 6 de diamantes");
                    break;
                case 7:
                    System.out.println("Te ha salido el 7 de diamantes");
                    break;
                case 8:
                    System.out.println("Te ha salido el 8 de diamantes");
                    break;
                case 9:
                    System.out.println("Te ha salido el 9 de diamantes");
                    break;
                case 10:
                    System.out.println("Te ha salido el 10 de diamantes");
                    break;
                case 11:
                    System.out.println("Te ha salido la J de diamantes");
                    break;
                case 12:
                    System.out.println("Te ha salido la Q de diamantes");
                    break;
                case 13:
                    System.out.println("Te ha salido la K de diamantes");
                    break;
                case 14:
                    System.out.println("Te ha salido un JOKER");
                    break;
                case 15:
                    System.out.println("Te ha salido un JOKER");
                    break;
                default:
                    break;
            }
        }else if (forma == 3) {
                        switch  (numero) {
                case 1:
                    System.out.println("Te ha salido el 1 de treboles");
                    break;
                case 2:
                    System.out.println("Te ha salido el 2 de treboles");
                    break;
                case 3:
                    System.out.println("Te ha salido el 3 de treboles");
                    break;
                case 4:
                    System.out.println("Te ha salido el 4 de treboles");
                    break;
                case 5:
                    System.out.println("Te ha salido el 5 de treboles");
                    break;
                case 6:
                    System.out.println("Te ha salido el 6 de treboles");
                    break;
                case 7:
                    System.out.println("Te ha salido el 7 de treboles");
                    break;
                case 8:
                    System.out.println("Te ha salido el 8 de treboles");
                    break;
                case 9:
                    System.out.println("Te ha salido el 9 de treboles");
                    break;
                case 10:
                    System.out.println("Te ha salido el 10 de treboles");
                    break;
                case 11:
                    System.out.println("Te ha salido la J de treboles");
                    break;
                case 12:
                    System.out.println("Te ha salido la Q de treboles");
                    break;
                case 13:
                    System.out.println("Te ha salido la K de treboles");
                    break;
                case 14:
                    System.out.println("Te ha salido un JOKER");
                    break;
                case 15:
                    System.out.println("Te ha salido un JOKER");
                    break;
                default:
                    break;
            }
        }else if (forma == 4) {
                        switch  (numero) {
                case 1:
                    System.out.println("Te ha salido el 1 de picas");
                    break;
                case 2:
                    System.out.println("Te ha salido el 2 de picas");
                    break;
                case 3:
                    System.out.println("Te ha salido el 3 de picas");
                    break;
                case 4:
                    System.out.println("Te ha salido el 4 de picas");
                    break;
                case 5:
                    System.out.println("Te ha salido el 5 de picas");
                    break;
                case 6:
                    System.out.println("Te ha salido el 6 de picas");
                    break;
                case 7:
                    System.out.println("Te ha salido el 7 de picas");
                    break;
                case 8:
                    System.out.println("Te ha salido el 8 de picas");
                    break;
                case 9:
                    System.out.println("Te ha salido el 9 de picas");
                    break;
                case 10:
                    System.out.println("Te ha salido el 10 de picas");
                    break;
                case 11:
                    System.out.println("Te ha salido la J de picas");
                    break;
                case 12:
                    System.out.println("Te ha salido la Q de picas");
                    break;
                case 13:
                    System.out.println("Te ha salido la K de picas");
                    break;
                case 14:
                    System.out.println("Te ha salido un JOKER");
                    break;
                case 15:
                    System.out.println("Te ha salido un JOKER");
                    break;
                default:
                    break;
            }
        }
    }
    
}
