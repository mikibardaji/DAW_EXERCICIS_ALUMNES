/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici6;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author geral
 */
public class Exercici6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        char triaJugador, triaOrdinador;
        int numero;
        String nomJugador, nomOrdinador;
        //jugada de l'usuari
        System.out.println("Tria la teva jugada(S: Pedra, P: Paper, T: Tisora)");
        triaJugador=sc.next().toUpperCase().charAt(0);
        //jugada de l'ordinador
        numero=random.nextInt(3);
        
        if(numero==0)
            {
                triaOrdinador='S';
            }
        else if(numero==1)
            {
                triaOrdinador='P';
            }
        else
            {
                triaOrdinador='T';
            }
        //Noms de les jugades
        //Jugador
        if(triaJugador=='S')
            {
                nomJugador="Pedra";
            }
        else if(triaJugador=='P')
            {
                nomJugador="Paper";
            }
        else
            {
                nomJugador="Tisora";
            }
        //Ordinador
        if(triaOrdinador=='S')
            {
                nomOrdinador="Pedra";
            }
        else if(triaOrdinador=='P')
            {
                nomOrdinador="Paper";
            }
        else
            {
                nomOrdinador="Tisora";
            }
        //Mostrar les tries
        System.out.println("Tu has triat"+nomJugador);
        System.out.println("L'ordinador ha triat"+nomOrdinador);
        //Resultat
        if(triaJugador==triaOrdinador)
            {
                System.out.println("Resultat: Empat!");
            }
        else if((triaJugador=='P' && triaOrdinador=='S')
                ||(triaJugador=='S' && triaOrdinador=='T')
                ||(triaJugador=='T'&& triaOrdinador=='P'))
            {
                System.out.println("Resultat: Has guanyat tu!");
            }
        else
            {
                System.out.println("Resultat: Ha guanyat l'ordinador!");
            }
    }
    
    
}
