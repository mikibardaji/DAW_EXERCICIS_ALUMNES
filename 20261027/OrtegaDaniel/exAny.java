import java.time.LocalDateTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        LocalDateTime hoy = LocalDateTime.now();
        int any_actual = hoy.getYear();

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int anyUsuari = sc.nextInt();

        do {
            System.out.println(anyo_actual + " - " + anyUsuari);
            anyUsuari--;
            any_actual--;
        } while (anyUsuari >= 0);
    }
}
