import java.util.Scanner;

public class EjercicioIterativos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Nivel Padawan

        // Ejercicio 1: Los 20 primeros números naturales (1 a 20)
        System.out.println("=== EJERCICIO 1 ===");
        for (int i = 1; i <= 20; i++) {
            System.out.println("Número: " + i);
        }

        // Ejercicio 2: Números pares del 1 al 200 (de 2 en 2)
        System.out.println("\n=== EJERCICIO 2 ===");
        for (int i = 2; i <= 200; i += 2) {
            System.out.println("Número par: " + i);
        }

        // Ejercicio 3: Números pares del 1 al 200 (de 1 en 1 con %)
        System.out.println("\n=== EJERCICIO 3 ===");
        for (int i = 1; i <= 200; i++) {
            if (i % 2 == 0) {
                System.out.println("Número par: " + i);
            }
        }

        // Ejercicio 4: Desde 1 hasta N
        System.out.println("\n=== EJERCICIO 4 ===");
        System.out.print("Introduce un número N: ");
        int n = teclado.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Contador: " + i);
        }
    }
}
