/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adivinanumero;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gba0006
 */
public class AdivinaNumero {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
         Scanner teclado = new Scanner (System.in);
         Random aleatorio = new Random();
         
        int numAleatorio = aleatorio.nextInt(0,110);
        System.out.println("Ha salido el " + numAleatorio);
        boolean cierto;
        cierto = false;
        int contadorintentos = 0;
        
        
       do{
           System.out.print("Prueba a acertar el numero : ");
           int acert = teclado.nextInt();
           if (contadorintentos == 5){
               System.out.println("Has perdido :( !");
           break;}
          
           if (acert == numAleatorio)
               {System.out.println("Has acertado!! El numero era " + numAleatorio);
                   System.out.println("Has tenido " + contadorintentos + " intentos");
               cierto = true;}
           if (acert - numAleatorio <= 10){
               System.out.println("Te has quedado muy cerca!!");
               ++contadorintentos;}
           
           else if (acert < numAleatorio)
                {System.out.println("El numero és més gran! ");
                ++contadorintentos;}
            else
           {System.out.println("T’has passat! ");
           ++contadorintentos;}
               
       }while(cierto != true);
       

        
        
       
        
        
        
        
        }
    }
    

