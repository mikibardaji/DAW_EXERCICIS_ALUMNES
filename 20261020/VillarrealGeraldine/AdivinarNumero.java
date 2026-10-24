/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adivinarnumero;

import java.util.Scanner;
import java.util.Random;
        
/**
 *
 * @author gvi6123
 */
public class AdivinarNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        
        int numUsuario,numRandom;
        int intentos=0;
        
        numRandom=random.nextInt(1,101);
        
        do
        {
            System.out.println("Adivina el número del 1 al 100");
            numUsuario=sc.nextInt();
            
            if(numUsuario>=1 && numUsuario<=100)
                {
                    ++intentos;
                    
                    if((numUsuario<numRandom+10 && numUsuario>numRandom)
                            ||(numUsuario>numRandom-10 && numUsuario<numRandom))
                    {
                        System.out.println("¡Estás cerca!");
                    }
                    
                    if(numRandom>numUsuario)
                    {
                        System.out.println("El numero es mas grande");
                    }
                    
                    else if(numRandom<numUsuario)
                    {
                        System.out.println("El numero es mas pequeño");
                    }
                    else
                    {
                        System.out.println("Felicidades, has adivinado el numero!");
                        System.out.println("Lo has adivinado en:"+ intentos +"intentos");
                    }
                }
            else
                {
                    System.out.println("El número introducido no está en el rango pedido");     
                }
        }
        
        while((numRandom!=numUsuario) && intentos<5);
        
            if(numRandom!=numUsuario)
            {
                System.out.println("Has superado la cantidad de intentos. El número era" + numRandom);
            }
        
    }
    
}
