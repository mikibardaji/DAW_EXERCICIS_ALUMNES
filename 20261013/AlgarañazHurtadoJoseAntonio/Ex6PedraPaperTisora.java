/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex6pedrapapertisora;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author José Antonio
 */
public class Ex6PedraPaperTisora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int num;
        char lletra, lletraOrd = 0;
        String texto = null;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce una letra(S: Pedra,A:Paper, T:Tisora): ");
        lletra = scan.next().charAt(0);
        num = aleatorio.nextInt(1, 4);
        System.out.println(num);

        if (num == 1) {
            lletraOrd = 'S';


        } else if (num == 2) {
            lletraOrd = 'A';

        } else if (num == 3) {
            lletraOrd = 'T';

        }
        if (lletra != lletraOrd) {
            if (lletra == 'S' && lletraOrd == 'A' || lletra == 'A' && lletraOrd == 'T'
                    || lletra == 'T' && lletraOrd == 'S') {
                 texto="Ha ganado el ordenador!!!";
            } else {
                texto="Has ganado!!!";

            }

        }else{
            texto="Empat!";
        
        }
        System.out.println("Has triat " + lletra);
        System.out.println("L'ordinador a triat " + lletraOrd);
        System.out.println(texto);
        
        

    }

}
