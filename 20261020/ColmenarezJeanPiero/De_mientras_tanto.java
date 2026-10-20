/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaejerciciosbucle;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jco5780
 */
public class PracticaEjerciciosBucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        int minimoMaquina=1, maxMaquina=101;
        int user, maquina;
        char opcion;
        System.out.println("El user dira el usuario");
        
        do{
             user = teclado.nextInt();

            System.out.println("Di un numero maquina para que adivines");
            maquina = aleatorio.nextInt(minimoMaquina,maxMaquina);
        
         if(maquina == user)
         {
             System.out.println("Acertaste Terminator era el " + aleatorio);
         }
         else if (maquina > user){
             System.out.println("Es mas grande");
         }   
         else {
            System.out.println("Es mas pequeño");
        
        }
             
        } while (true);
        opcion = teclado.nextInt()charAt();
        if (opcion =='a') {
            System.out.println("Acertado");
        }
        else if (opcion == 'g') {
            minimoMaquina = maquina+1;
            System.out.println("Pienso que es el .. " + maquina);
        }
        else if (opcion == p ) {
            System.out.println("");
        }

    }
    
}

