
package preguntasjeanpiero;

import java.util.Scanner;

/**
 *
 * @author aer5219
 */
public class PreguntasJeanPiero {

    public static String preguntaPrimera() {
        Scanner teclado = new Scanner(System.in);
        String respuesta;
      
        System.out.println("Quien es Campeon Del Mundo de Beisbol?");
        System.out.println("A-  España");
        System.out.println("B-  Marruecos");
        System.out.println("C-  Chipre");
        System.out.println("D.  Venezuela");
        System.out.println("-------------------");
        System.out.print("Respon (A,B,C o D): ");
      
        resposta=teclado.nextLine();

    }
}
