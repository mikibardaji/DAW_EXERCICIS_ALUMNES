import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;

        for (int i = 1; i <= 10; i++) {
            int numero;

            do {
                System.out.print("Introduce el número " + i + " (no puede ser 0): ");
                numero = scanner.nextInt();

                if (numero == 0) {
                    System.out.println("Error: El número no puede ser cero.");
                }
            } while (numero == 0);

            if (numero > 0) {
                positivos++;
            } else {
                negativos++;
            }
        }

        System.out.println("\n--- Resultados ---");
        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);

    }
}
