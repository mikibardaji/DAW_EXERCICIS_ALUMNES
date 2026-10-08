import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String modalitat, enllac, aula;
        

        System.out.println("Que prefieres, Online o Presencial?");
        modalitat = teclado.nextLine();

        if (modalitat.equalsIgnoreCase("Online")) {
            System.out.println("Pon el enlace de Discord o Meet:");
            enllac = teclado.nextLine();
            System.out.println("Servei configurat. Enllaç desat.");
        } else if (modalitat.equalsIgnoreCase("Presencial")) {
            System.out.println("Pon el aula o lugar:");
            aula = teclado.nextLine();
            System.out.println("Servei configurat. Punt de trobada desat.");
        }
    }
}
