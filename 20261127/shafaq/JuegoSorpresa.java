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
     * Crear el joc de la ruleta
     * Comences amb 1000 € 
     * Demanarà quina aposta vols 
     * Demanes quants diners vols apostar
     * Es tira la bola
     * Calcula els guanys
     * Es sumen als diners de la cartera
     * Et demana si vols continuar o no
     * Si vols continuar i tens diners tornes al principi
     * En qualsevol altre cas, s'acaba el joc i mostres amb quants diners ten vas a casa.
     * 
     */
    public static void main(String[] args) {
     int numero, bola,result,apuesta;
     numero = MetodosJuego.pedirNumero();
     System.out.println("El numero elegido es: " + numero);
     
     bola = MetodosJuego.caidaBola();
     System.out.println("La bola ha caido en: " + bola);
     
     boolean resultado, resultados;
     resultado = MetodosJuego.puedesJugar('s', 500);
     System.out.println("Puedes jugar: " + resultado);
     
     result = MetodosJuego.ganancias(10, 5);
     System.out.println("Tus ganancias son: " + result);
     
     apuesta = MetodosJuego.pedirDineroApuesta(500);
     System.out.println("Dinero apostado: " + apuesta);
     
     resultados = MetodosJuego.eresGanador(7, 37);
     System.out.println("Has ganado: " + resultados);
     
     String respuesta = MetodosJuego.seguirJugando();

     System.out.println("Tu respuesta es: " + respuesta);
     
     MetodosJuego.pintaAsteriscos(5);

    }

}
    
