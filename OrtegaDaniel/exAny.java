package ;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class exAny {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int edad;
        LocalDateTime hoy = LocalDateTime.now();
        int anyo_actual = hoy.getYear();
        Scanner scan = new Scanner(System.in);
        System.out.println("edad que tienes: ");
        edad = scan.nextInt();
        do {
            edad -= 1;
            anyo_actual -= 1;
            System.out.println("tenias " + edad + " en año: " + anyo_actual);
        } while (edad != 0);
        if (edad==0) {
            System.out.println(anyo_actual+" año nacimiento");
        }

    }
}
