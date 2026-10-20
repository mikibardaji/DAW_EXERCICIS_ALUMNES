/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buclesiterativos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author sthef
 */
public class MaximoIntentos {
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        
        int numeroPrograma = rand.nextInt(1,101);
        int numeroUsuario, intentos = 1;
        
         System.out.print("Ingresa el numero elegido, tienes 5 intentos: ");
         numeroUsuario = sc.nextInt();
         
         while(numeroUsuario != numeroPrograma && intentos <5){
           
            if(numeroUsuario < numeroPrograma){
                System.out.println("Mi numero es mayor");
            }
            else if(numeroUsuario > numeroPrograma){
                System.out.println("Mi numero es menor");
            }
            System.out.print("Intentalo otra vez: ");
                numeroUsuario = sc.nextInt();   
                intentos ++;
         }
         if (numeroUsuario == numeroPrograma){
         System.out.println("Ganaste, felicitaciones.");
         } else {
         System.out.println("Perdiste, se acabaron los intentos.");
         }
        
        
    }
    
}
