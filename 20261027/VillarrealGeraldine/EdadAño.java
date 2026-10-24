/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edadaño;

import java.time.LocalDateTime;
import java.util.Scanner;
/**
 *
 * @author geral
 */
public class EdadAño {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDateTime hoy=LocalDateTime.now();
        Scanner sc=new Scanner (System.in);
        
        int añoActual=hoy.getYear();
        int edad, año, edadAño;
        
        System.out.println("Introduce tu edad");
        edad=sc.nextInt();
        
        año=añoActual;
        edadAño=edad;
        
        do
          {
            System.out.println("En"+año+"tenias"+edadAño+"años");
            año--;
            edadAño--;
          }
          
        while(edadAño>=0);
            
    }
    
}
