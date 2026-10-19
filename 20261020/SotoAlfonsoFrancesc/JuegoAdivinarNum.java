/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegoadivinarnum;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author fso6590
 */
public class JuegoAdivinarNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //V1
        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);
        int juego, eleccion, contador = 0;
//        System.out.println("Voy a generar 100 numeros y tienes que intentar adivinar el elegido");
//        juego = aleatorio.nextInt(1, 101);
//        do {
//            eleccion = teclado.nextInt();
//            if (eleccion<juego) {
//                System.out.println("El numero es mas grande, sigue intentandolo");
//            }else if (eleccion>juego) {
//                System.out.println("El numero es mas pequeño, sigue intentandolo");
//            }else if (eleccion==juego) {
//                System.out.println("HAS ACERTADO");
//            }
//        } while (eleccion != juego);
//        
        
        
        
        
        
        //V1.1
//                System.out.println("Voy a generar 100 numeros y tienes que intentar adivinar el elegido");
//        juego = aleatorio.nextInt(1, 101);
//        do {
//            eleccion = teclado.nextInt();
//            contador ++;
//            if (eleccion<juego) {
//                System.out.println("El numero es mas grande, sigue intentandolo");
//            }else if (eleccion>juego) {
//                System.out.println("El numero es mas pequeño, sigue intentandolo");
//            }else if (eleccion==juego) {
//                System.out.println("HAS ACERTADO");
//                System.out.println("Te ha costado "+contador+" intentos");
//            }
//        } while (eleccion != juego);
//    }
    
    
    
    
    
    
    //V1.2
//        System.out.println("Voy a generar 100 numeros y tienes que intentar adivinar el elegido en 5 intentos");
//        juego = aleatorio.nextInt(1, 101);
//        do {
//            eleccion = teclado.nextInt();
//            contador ++;
//            if (eleccion<juego) {
//                System.out.println("El numero es mas grande, sigue intentandolo");
//            }else if (eleccion>juego) {
//                System.out.println("El numero es mas pequeño, sigue intentandolo");
//            }else if (eleccion==juego) {
//                System.out.println("HAS ACERTADO");
//            }
//        } while ((eleccion != juego) && (contador < 5));
//    
//        if (contador == 5) {
//            System.out.println("Lo siento te has quedado sin intentos");
//        }
//        
        
        
        
        
   //V1.3
        System.out.println("Voy a generar 100 numeros y tienes que intentar adivinar el elegido en 5 intentos");
        juego = aleatorio.nextInt(1, 101);
        do {
            eleccion = teclado.nextInt();
            if (eleccion<juego) {
                if (eleccion - juego <= 10) {
                    System.out.println("ESTAS CERCA");
                    System.out.println("El numero es mas grande, sigue intentandolo");
                }else {
                    System.out.println("El numero es mas grande, sigue intentandolo");
                }
            }else if (eleccion>juego) {
                if (juego - eleccion <= 10) {
                    System.out.println("ESTAS CERCA");
                    System.out.println("El numero es mas pequeño, sigue intentandolo");
                }else {
                System.out.println("El numero es mas pequeño, sigue intentandolo");
                }
            }else if (eleccion==juego) {
                System.out.println("HAS ACERTADO");
            }
        } while (eleccion != juego);
        

    
    
}
    
}

