import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String franja, modalitat;

        System.out.println("Que franja quieres? (Mati o Tarda):");
        franja = teclado.nextLine();

        System.out.println("Que modalidad quieres? (Online o Presencial):");
        modalitat = teclado.nextLine();

        if (franja.equalsIgnoreCase("Mati") && modalitat.equalsIgnoreCase("Online")) {
            System.out.println("Reserva confirmada amb l'expert.");
        } else if (franja.equalsIgnoreCase("Tarda") && modalitat.equalsIgnoreCase("Presencial")) {
            System.out.println("Reserva confirmada amb l'expert.");
        } else {
            System.out.println("L'expert no està disponible en aquesta franja per a aquesta modalitat.");
        }
    }
}
