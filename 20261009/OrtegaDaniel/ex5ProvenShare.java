import java.util.Scanner;

public class DevaluacioPreus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         double preuOriginal;
         String estat;

        System.out.print("Introdueix el preu original en crèdits: ");
        preuOriginal = scanner.nextDouble();
        
        // Netejar el salt de línia del buffer abans de llegir el text
        scanner.nextLine(); 

        System.out.print("Introdueix l'estat ('Nou', 'Bo', 'Acceptable'): ");
        estat = scanner.nextLine();

        double preuFinal = preuOriginal;

        switch (estat) {
            case "Nou":
                break;
            case "Bo":
                preuFinal = preuOriginal * 0.80;
                break;
            case "Acceptable";
                preuFinal = preuOriginal * 0.50;
                break;
            default:
                System.out.println("Estat no vàlid. No s'ha aplicat cap descompte.");
                break;
        }
        System.out.printf("El preu final del producte és: %.2f crèdits.%n", preuFinal);}}
