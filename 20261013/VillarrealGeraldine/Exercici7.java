/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici7;

import java.util.Random;
/**
 *
 * @author geral
 */
public class Exercici7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random=new Random();
        int numero,pal;
        String nomNumero, nomPal;
        
        numero=random.nextInt(13)+1;  //1 al 13
        pal=random.nextInt(4);        //0 al 3
        
        if(numero==1)
            {
                nomNumero="As";
            }
        else if(numero==11)
            {
                nomNumero="Jota";
            }
        else if(numero==12)
            {
                nomNumero="Reina";
            }
        else
            {
               nomNumero=String.valueOf(numero); 
            }
        
        if (pal==0) 
            {
            nomPal = "Cors";
            } 
        else if (pal == 1) 
            {
            nomPal = "Diamants";
            } 
        else if (pal == 2) 
            {
            nomPal = "Piques";
            } 
        else 
            {
            nomPal = "Trèvols";
            }

        // Mostrar la carta
        System.out.println("T'ha sortit: " + nomNumero + " de " + nomPal);        
                
                
    }
    
}
