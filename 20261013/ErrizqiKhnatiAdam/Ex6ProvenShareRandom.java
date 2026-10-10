/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex6provensharerandom;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author adamg
 */
public class Ex6ProvenShareRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char eleccioUsuari, maquina = ' ';
        String eleccio, resultat = " ", ordinador;
        int num;
        
        Scanner sc = new Scanner(System.in);
        Random aleatori = new Random();
        
        System.out.println("Escull entre pedra(S), paper(A) o tisora(T)");
        eleccioUsuari = sc.next().charAt(0);
        
        num = aleatori.nextInt(1,4);
        
        switch(num) {
            case 1:
                maquina='S';
                break;
            case 2:
                maquina='A';
                break;
            case 3:
                maquina='T';
                break;
        }        
        
        if (eleccioUsuari == 'S'){
            eleccio = "Pedra";
        } else if (eleccioUsuari == 'A') {
            eleccio = "Paper";
        } else if (eleccioUsuari == 'T') {
            eleccio = "Tisores";
        } else{
            eleccio = "Res";
        }
        
        System.out.println("Tu has triat: " + eleccio);
        
        if (maquina == 'S'){
            ordinador = "Pedra";
        } else if (maquina == 'A') {
            ordinador = "Paper";
        } else if (maquina == 'T') {
            ordinador = "Tisores";
        } else{
            ordinador = "Error";
        }
        
        System.out.println("L'ordinador ha triat: " + ordinador);
        
        if (eleccioUsuari == 'S' && maquina == 'S' || eleccioUsuari == 'A' && maquina == 'A' || eleccioUsuari == 'T' && maquina == 'T'){
            resultat="Empat!";
        }
        else if (eleccioUsuari == 'S' && maquina == 'A' || eleccioUsuari == 'A' && maquina == 'T' || eleccioUsuari == 'T' && maquina == 'S'){
            resultat="Ha guanyat l'ordinador!";
        }
        else if (eleccioUsuari == 'S' && maquina == 'T' || eleccioUsuari == 'A' && maquina == 'S' || eleccioUsuari == 'T' && maquina == 'A'){
            resultat="Has guanyat tu!";
        }
        
        System.out.println("Resultat: " + resultat);
        
    }
    
}
