/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex7cartas;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Ex7Cartas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Random rand = new Random();
         String nomNumero, nomPalo; 
         int numero, palo;                  
         // Primer aleatorio: el número
          numero = rand.nextInt(1, 14);
          // Segundo aleatorio: el palo
           palo = rand.nextInt(1, 5);
         // condicion (nombre del nom)
          if (numero == 1) 
          {
            nomNumero = "As";
          } 
          else if (numero == 11) 
          {
            nomNumero = "J";
          }
          else if (numero == 12)
          {
            nomNumero = "Q";
          } 
          else if (numero == 13) 
          {
            nomNumero = "K";
          } 
          else 
          {
            nomNumero = "" + numero;
          }

         // condicion (Nombre del palo)
         if (palo == 1)
         {
            nomPalo = "Corazones";
         }
         else if (palo == 2) 
         {
            nomPalo = "Diamantes";
         } 
         else if (palo == 3) 
         {
            nomPalo = "Picas";
         }
         else
         {
            nomPalo = "Treboles";
         }

        System.out.println("Te ha salido: " + nomNumero + " de " + nomPalo);
    }
}