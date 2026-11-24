/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responderpreguntesjoc;

import java.util.Scanner;

/**
 *
 * @author aca4354
 */
public class CastanoAndreu {
    public static String PrimeraPregunta ()
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Quien marco en la final del Mundial 2010?");
        System.out.println("A: Puyol");
        System.out.println("B: Villa");
        System.out.println("C: Iniesta");
        System.out.println("D: Xavi");
        System.out.println("Escribe el apellido del jugador, no la letra:");
        
        String respuesta1 = sc.nextLine();
        return respuesta1.toUpperCase();
        
    }
    
    public static int respostaPrimera (String resposta1)
    {
        String r = resposta1.toUpperCase();

        if (r.equals("INIESTA")) {
            System.out.println("Acertaste! (Menos mal!)");
            return 1;
        } else if (r.equals("PUYOL")) {
            System.out.println("Casi! Puyol marco en semifinales contra Alemania, no en la final.");
            return 0;
        } else if (r.equals("VILLA")) {
            System.out.println("Fallaste! Marco muchos goles en ese Mundial, pero no el de la final.");
            return 0;
        } else if (r.equals("XAVI")) {
            System.out.println("Error! Xavi era centrocampista tambien, pero no el que marco el gol.");
            return 0;
        } else {
            System.out.println("Opcion no valida. Tienes que escribir el apellido de uno de los cuatro jugadores.");
            return 0;
        }
      
    }
    
}
