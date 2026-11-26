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
      
   
       
        int numero = 0;
        do {            
             System.out.println("apuesta por un numero del 1 al 36 , o elige 37(impar) o 38(par)");
             Scanner teclado = new Scanner(System.in);

        } while (numero  < 1 || numero > 38);
    
        return numero;
    
    } 
    
       /**S
     * Simulara la caida de la bola, sera un valor aleatorio entre 1 y 36
     * @return 
     */
    public static int caidaBola()
    {
        Random rd = new Random();
        int bola = rd.nextInt(1,36) + 1;
        
        return bola;
    }
    
    
    public static boolean puedesJugar(String respuesta,int dinero)
    {
      if (respuesta.equalsIgnoreCase("SI") && dinero > 0) {
        return true;
    } else {
        return false;
    }
    }

    
    public static int ganancias(int dinero_apostado,int num_apostado){
        
     if (num_apostado >= 1 && num_apostado <= 36) {
        return dinero_apostado * 35;
    } else if (num_apostado == 37 || num_apostado == 38) {
        return dinero_apostado * 2;
    } else {
        return 0;
    }
    
    }
    
    
        
    }
    
