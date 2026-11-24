/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreriajuegosorpresa;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jco5780
 */
public class LibreriaJuegoSorpresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          
    /**
     * pedira un numero al usuario que tiene que estar entre 1 y 38 si no, no lo devolvera
     * Mostrara la frase "apuesta por un numero del 1 al 36 , o elige 37(impar) o 38(par)
     * 
     * @return entero valido
     */
    }
    public static int pedirNumero()
    {        
//    Random rd = new Random();
      Scanner teclado = new Scanner(System.in);
      
    System.out.println("apuesta por un numero del 1 al 36 , o elige 37(impar) o 38(par)");
       
    int pedirNumero = teclado.nextInt(1, 38);
       
    
    
    return 0;
    } 
    
       /**S
     * Simulara la caida de la bola, sera un valor aleatorio entre 1 y 36
     * @return 
     */
    public static int caidaBola()
    {
        Random rd = new Random();
        caidaBola = Random.NextInt(1,36);
        
        return 0;
    }
    
    public static boolean puedesJugar(char respuesta,int dinero){
    }
    
    public static boolean puedesJugar(char respuesta,int dinero)
    {
        System.out.println("Quieres seguir jugando");
        
        
    }

    
    public static int ganancias(int dinero_apostado,int num_apostado){
        
        dinero_apostado = pedirNumero(pedirNumero);
        num_ apostado = caidaBola(caidaBola)
        
        if (num_apostado =<36 ) {
            ganancias = dinero_apostado*35,2;
        }
        else if (num_apostado ==37 && num_apostado== 38){
                
                ganancias = dinero_apostado+ dinero_apostado;
                
                }
    
    }
    
    
        
    }
    
