/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegosorpresa;

/**
 *
 * @author aer5219
 */
public class JuegoSorpresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int dineroDisponible = 1000;
        String respuestaStr = "s";
       
        int num = LibreriaJuego.pedirNumero();
        System.out.println("Numero introducido: " + num);
       
        int bola = LibreriaJuego.caidaBola();
        System.out.println("Numero Bola: " + bola);
       
       
        char respuesta = respuestaStr.charAt(0);
        boolean jugar = LibreriaJuego.puedesJugar(respuesta, dineroDisponible);
       
        int dinero_apostado = LibreriaJuego.pedirDineroApuesta(dineroDisponible);
       
        int ganado = LibreriaJuego.ganancias(dinero_apostado, num);
        System.out.println("Ganancias totales: " + ganado);
       
       
        boolean resultadoFinal = LibreriaJuego.eresGanador(bola, num);
        if (resultadoFinal == true){
            System.out.println("Has ganado");
        } else {
            System.out.println("No has ganado");
        }
        
        
        LibreriaJuego.pintaAsteriscos(num);
        
        String seguir = "s";
        
        char seguirJugando = seguir.charAt(0);
        seguirJugando = LibreriaJuego.seguirJugando();
        
        
        
        
    }
 
   
}

    
