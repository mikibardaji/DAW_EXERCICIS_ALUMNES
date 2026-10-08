import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double preu, preufinal = 0, descuento;
        String estat;

        System.out.println("Cuanto es el preu?");
        preu = teclado.nextDouble();
        teclado.nextLine(); 

        System.out.println("Cual es el estado? (Nou, Bo, Acceptable):");
        estat = teclado.nextLine();

        if (estat.equalsIgnoreCase("Nou")) {
            descuento = 0;
            preufinal = preu;
        } else if (estat.equalsIgnoreCase("Bo")) {
            descuento = preu * 0.20;
            preufinal = preu - descuento;
        } else if (estat.equalsIgnoreCase("Acceptable")) {
            descuento = preu * 0.50;
            preufinal = preu - descuento;
        }

        System.out.println("El precio final es: " + preufinal);
    }
}
