/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriapiedrapapeltijerabucles;
import java.util.Random;
import java.util.Scanner;

/**
 * Demana a l’usuari que et demani si tria “pedra, paper o tisora”: scanner.next.charAt(0) ? char
Para comparar un char se hace xxx = ‘F’
S: Pedra(Stone) 	A:Paper	T:Tisora
Despres genera un numero aleatori entre 3 possibles valors i la tirada de l’ordinador. Mostra.-la per pantalla.
Mostra per pantalla qui ha guanyat:
Exemple de resultat:
Tria la teva jugada (S: Pedra, P: Paper, T: Tisora): P
 Tu has triat: Paper
 L'ordinador ha triat: Pedra
 Resultat: Has guanyat tu!
 ________________________________________________________________________________
Tria la teva jugada (S: Pedra, P: Paper, T: Tisora): T
 Tu has triat: Tisora
 L'ordinador ha triat: Tisora
 Resultat: Empat!
 ________________________________________________________________________________
Tria la teva jugada (S: Pedra, P: Paper, T: Tisora): S
 Tu has triat: Pedra
 L'ordinador ha triat: Paper
 Resultat: Ha guanyat l'ordinador!

 */
public class TeoriaPiedraPapelTijeraBucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        int numMaquina;
        char opcioJugador=' ', opcioMaquina=' ';
        String opcioJugadorTexte="",opcioMaquinaTexte="", resultat;
        
        do 
        {
        System.out.print("Tria la teva jugada (S: Pedra, A: Paper, T: Tisora): ");
        opcioJugador = teclado.next().charAt(0);
        }
        while((opcioJugador !='S') && (opcioJugador !='T')
                && (opcioJugador !='A')&& (opcioJugador !='a')
               && (opcioJugador !='s') && (opcioJugador !='t') );
        
        
        switch (opcioJugador) {
            case 'S':
            case 's':
                opcioJugador = 'S';
                opcioJugadorTexte = "Pedra";
                break;
            case 'A':
            case 'a':
                opcioJugador = 'A';
                opcioJugadorTexte = "Paper";
                break;
            case 'T':
            case 't':
                opcioJugador = 'T';
                opcioJugadorTexte = "Tisora";
                break;
            default:
                break;
        }
        System.out.println("Has jugat amb " + opcioJugadorTexte);
        //no controlem lletres incorrectes
        //El Bot
        numMaquina = random.nextInt(1, 4);
        switch (numMaquina) {
            case 1 -> {
                opcioMaquina = 'S';
                opcioMaquinaTexte = "Pedra";
            }
            case 2 -> {
                opcioMaquina = 'A';
                opcioMaquinaTexte = "Paper";
            }
            case 3 -> {
                opcioMaquina = 'T';
                opcioMaquinaTexte = "Tisora";
            }

        }     
        System.out.println("La maquina ha  jugat : " + opcioMaquinaTexte);
        
        if (opcioJugador == opcioMaquina)
        {
            resultat = "Empat";
        }
       
        else if ((opcioJugador == 'S' && opcioMaquina=='T')
            || (opcioJugador == 'A' && opcioMaquina=='S')
            || (opcioJugador == 'T' && opcioMaquina=='A'))    
        {
            resultat = "Has guanyat tu!";
        }
        else {
            resultat = "Ha guanyat l'ordinador!";
        }
        
        System.out.println("El guanyador es : " + resultat);
    }
    
}
