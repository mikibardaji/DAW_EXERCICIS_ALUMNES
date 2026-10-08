/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex10validaciódelcorreuoficial;

import java.util.Scanner;

/**
 *
 * @author saihb
 */
public class Ex10ValidacióDelCorreuOficial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correo, centro;
        
        System.out.println("Introducen tu correo");
        correo = sc.nextLine();
        
        System.out.println("Estudias en Universidad o Instituto");
        centro = sc.nextLine();
        
        if (centro.equalsIgnoreCase("Universidad") && (correo.endsWith(".edu") || correo.endsWith(".cat"))){
            System.out.println("Correo oficial validado");
        }
            
        else if (centro.equalsIgnoreCase("Instituto") && (correo.endsWith(".es") || correo.endsWith(".cat"))){
            System.out.println("Correo oficial validado");
        }
        else {
            System.out.println("La extension no corresponde a tu centro");
        }
    }
    
}
