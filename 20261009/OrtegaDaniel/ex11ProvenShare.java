import java.util.Scanner;

public class ValidacioServeiHorari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horaInici;
        int durada;
        System.out.print("Introdueix l'hora d'inici (sencer de 0 a 23): ");
         horaInici = scanner.nextInt();

        System.out.print("Introdueix la durada estimada en minuts (sencer): ");
        durada = scanner.nextInt();

        
        boolean horaCorrecta = (horaInici >= 8 && horaInici <= 20);
        boolean duradaCorrecta = (durada <= 120);

        if (horaCorrecta && duradaCorrecta) {
            System.out.println("Servei acceptat. S'ha publicat correctament al catàleg.");
        } else if (!horaCorrecta && duradaCorrecta) {
            System.out.println("Error: L'hora d'inici ha d'estar entre les 8h i les 20h.");
        } else if (horaCorrecta && !duradaCorrecta) {
            System.out.println("Error: La durada del servei no pot superar els 120 minuts.");
        } else { // !horaCorrecta && !duradaCorrecta
            System.out.println("Error: L'hora i la durada introduïdes no són vàlides.");
        }
    }
}
