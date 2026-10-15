import java.util.Scanner;

public class EjercicioIterativos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean falsaso = false;
        int num;
        int contplus = 0, contnegativos = 0;
        int num7;
        // Nivel Jedi
        //ejercicio 6
        for (int i = 1; i<=10; i++ ) {
            System.out.print("Introduce el número " + i + " de 10: ");
             num = teclado.nextInt();
            if (num < 0){
                falsaso = true;
            }
        }
        if (falsaso){
            System.out.println("Se ha leído al menos un número negativo.");
        }
        else {
            System.out.println("No se ha leído ningún número negativo.");
        }
        //ejercicio 7
        
for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce el número " + i + " de 10: ");
            num7 = teclado.nextInt();
        if (num7 > 0) {
                contplus++;
            } else if (num7 < 0) {
                contnegativos++;
            }
        }
        System.out.println("Positivos: " + contplus);
          System.out.println("Negativos: " + contnegativos);
    
    }
}
