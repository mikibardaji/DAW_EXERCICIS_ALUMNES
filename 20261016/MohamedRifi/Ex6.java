import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean hayNegativo = false;
        int contador = 0;

        while (contador < 10) {
            int numero;

            do {
                System.out.print("Introduce el número " + (contador + 1) + " (no puede ser 0): ");
                numero = scanner.nextInt();
                
                if (numero == 0) {
                    System.out.println("Error: El número no puede ser cero.");
                }
            } while (numero == 0);

            if (numero < 0) {
                hayNegativo = true;
            }

            contador++;
        }

        if (hayNegativo) {
            System.out.println("Se ha leído al menos un número negativo.");
        } else {
            System.out.println("No se ha leído ningún número negativo.");
        }

    }
}
