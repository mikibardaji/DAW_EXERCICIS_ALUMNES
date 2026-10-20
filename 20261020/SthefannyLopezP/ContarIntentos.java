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
public class ContarIntentos {
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        
        int numeroPrograma = rand.nextInt(1,101);
        int numeroUsuario, intentos = 1;
        
         System.out.print("Ingresa tu numero elegido: ");
         numeroUsuario = sc.nextInt();
         
         while(numeroUsuario != numeroPrograma){
           
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
         System.out.println("Haz acertado, felicitaciones.");
         System.out.println("Lo conseguiste en  " + intentos + " intentos." );
        
        
    }
    
}
