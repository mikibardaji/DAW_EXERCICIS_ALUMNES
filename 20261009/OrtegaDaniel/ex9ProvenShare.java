import java.util.Scanner;

public class DisponibilitatServei {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      String franja;
      String modalitat;
      
        System.out.print("Introdueix la franja horària ('Mati' o 'Tarda'): ");
        franja = scanner.nextLine();

        System.out.print("Introdueix la modalitat ('Online' o 'Presencial'): ");
        modalitat = scanner.nextLine();

        /
        if ((franja.equalsIgnoreCase("Mati") && modalitat.equalsIgnoreCase("Online")) || (franja.equalsIgnoreCase("Tarda") && modalitat.equalsIgnoreCase("Presencial"))) 
        {
          System.out.println("Reserva confirmada amb l'expert.");
        } 
        else 
        {
          System.out.println("L'expert no està disponible en aquesta franja per a aquesta modalitat.");
        }
    }
}
