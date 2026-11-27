/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegosorpresa;



/**
 *
 * @author mabardaji
 */
public class JuegoSorpresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // EJERCICIO 1: pedir el numero apostado
        int numero = biblioteca.pedirNumero();
       
        System.out.println("Has apostado por el " + numero);
        
        

        // EJERCICIO 2: hacer caer la bola
        int bola = biblioteca.caidaBola();
        System.out.println("Ha salido el número " + bola);

        // EJERCICIO 3: comprobar si puedes jugar
        
        boolean puedesJugar = biblioteca.puedesJugar('s', 100);
        System.out.println("¿Puedes jugar? " + puedesJugar);

       
        // EJERCICI 4: calcular las ganancias
       
        int premio = biblioteca.ganancias(10, numero);
        System.out.println("Ganancias posibles: " + premio);

       
        // EJERCICIO 5: pedir cuanto dinero apostar
        int apuesta = biblioteca.pedirDineroApuesta(100);
        
        System.out.println("Has apostado " + apuesta + " euros");

        // EJERCICIO 6: comprobar si eres ganador
        boolean ganador = biblioteca.eresGanador(bola, numero);
        System.out.println("¿Has ganado? " + ganador);

        // EJERCICIO 7: preguntar si quieres seguir jugando
        
        char respuesta = biblioteca.seguirJugando();
        System.out.println("Tu respuesta es " + respuesta);

        // EJERCICIO 8: pintar asteriscos
        biblioteca.pintaAsteriscos(5);
  
    }
 
    
    /**
     * pedira un numero al usuario que tiene que estar entre 1 y 38 si no, no lo devolvera
     * Mostrara la frase "apuesta por un numero del 1 al 36 , o elige 37(impar) o 38(par)
     * 
     * @return entero valido
     */
    
    //public static int pedirNumero()
    //{
    //    return 0;
    //}
    
    /**S
     * Simulara la caida de la bola, sera un valor aleatorio entre 1 y 36
     * @return 
     */
    //public static int caidaBola()
    //{
    //    return 0;
    //}
    
    /**
     * Si la respuesta de entrada es igual a s y el dinero es positivo, la función decide que es cierto que puede seguir jugando
     * Si algun caso no se cumple, no puede
     * @param respuesta escogida por el jugador
     * @param dinero
     * @return true si puede seguir jugando, false si no
     */
    //public static boolean puedesJugar(char respuesta, int dinero)
    //{
    //    return true;
    //}
    
    /**
     * Calcula las ganancias, de la apuesta 1) Si el numero apostado es entre 1 y 36 sera el dinero apostado multiplicado por 35, 
     * 2) si el numero es 37 o 38 sera el doble del dinero_apostado.
     * @param dinero_apostado
     * @param num_apostado
     * @return 
     */
    public static int ganancias(int dinero_apostado, int num_apostado)
    {
        return -1;
    }
    
    /**
     * Dentro se pedira el dinero que quiere apostar, y devolvera el dinero siempre que sea valido positivo y no superior al dinero de la cartera
     * @param dinero_disponible dinero que tiene en la cartera el usuario
     * @return dinero apostado valido
     */
     public static int pedirDineroApuesta(int dinero_disponible)
     {
         return -1;
     }
     
         /**
     * comprueba si has ganado tu apuesta ... 
     * Ganas si bola es igual a num_apostado
     * Tambien ganas si num_apostado es 37 y la bola es impar
     * Tambien ganas si num_apostado es 38 y la bola es un numero par
     * @param bola
     * @param num_apostado
     * @return true si has ganado, false en cualquier otro caso
     */
    public static boolean eresGanador(int bola, int num_apostado)
    {
      return true;   
    }
    
     
    /**
     * * Dentro preguntara "Quieres seguir jugando(S/N)
     * Devolvera la respuesta siempre que sea valida, valido solo es si pone s , n en mayusculas o minusculas
     * Si no pone respuesta valida debe seguir preguntando
     * @return respuesta (valida
     */
    
     public static char seguirJugando()
     {
         return ' ';
     }
     
      /**
      * funcion que pinta tantos asteriscos en una linea como el valor num, al acabar los asterisco, pinta un - y el valor del num
      * @param num numero de asteriscos a pintar
      */
     public static void pintaAsteriscos(int num)
     {
         
     }
    
}
    
