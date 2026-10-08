import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double preu;

        System.out.println("Introduce el precio del libro:");
        preu = teclado.nextDouble();

        if (preu <= 0) {
            System.out.println("Error preu no vàlid");
        } else if (preu < 15.0) {
            System.out.println("Preu excel·lent! És una ganga.");
        } else if (preu >= 15.0 && preu <= 35.0) {
            System.out.println("Preu estàndard i correcte per a un llibre.");
        } else if (preu > 35.0) {
            System.out.println("Atenció: Aquest llibre té un preu superior a la mitjana.");
        }
    }
}
