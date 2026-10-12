import java.util.Scanner;
import java.util.Random;
public class JocPedraPaperTisora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.String.in);
        Random random = new Random();
        char jugadaUsuari;
        String textUsuari = "";
      
     
      System.out.print("Tria la teva jugada (S: Pedra, A: Paper, T: Tisora): ");
        jugadaUsuari = scanner.next().toUpperCase().charAt(0);
      if (jugadaUsuari == 'S') {
            textUsuari = "Pedra";}
      else if (jugadaUsuari == 'A') {
            textUsuari = "Paper"}
      else if (jugadaUsuari == 'T') {
            textUsuari = "Tisora";}
      else {
            System.out.println("Opció no vàlida. Si us plau, tria S, A o T.");

         int numAleatori = random.nextInt(3); 
         char jugadaOrdinador = ' ';
         String textOrdinador = "";

         if (numAleatori == 0) {
             jugadaOrdinador = 'S';
             textOrdinador = "Pedra";
         } else if (numAleatori == 1) {
            jugadaOrdinador = 'A';
            textOrdinador = "Paper";
         } else if (numAleatori == 2) {
            jugadaOrdinador = 'T';
            textOrdinador = "Tisora";}

           if (jugadaUsuari == jugadaOrdinador) {
            System.out.println("Resultat: Empat!");
        } else if ((jugadaUsuari == 'S' && jugadaOrdinador == 'T') || 
                   (jugadaUsuari == 'A' && jugadaOrdinador == 'S') || 
                   (jugadaUsuari == 'T' && jugadaOrdinador == 'A')) {
            System.out.println("Resultat: Has guanyat tu!");
        } else {
            System.out.println("Resultat: Ha guanyat l ordinador!");
        }
    }
}

      
