import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        boolean funcionando = true;

        System.out.println("Caixa registradora");

        while (funcionando) {
            System.out.println("Introdueix el producte");
            String producto = sc.nextLine();

            System.out.println("Introdueix el preu (0 per finalitzar)");
            String precioTexto = sc.nextLine();

            try {
                double precio = Double.parseDouble(precioTexto);

                if (precio == 0) {
                    funcionando = false;
                } else if (precio < 0) {
                    System.out.println("Avís: El preu no pot ser negatiu.");
                } else {
                    total += precio;
                    System.out.println(producto + " afegit. Total parcial: " + total + " €");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error de format. Introdueix un preu numèric.");
            }
        }

        System.out.println("Compra finalitzada, total=" + total + " €");
        
    }
}
