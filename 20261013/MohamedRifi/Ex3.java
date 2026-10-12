import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int numero;
        
        numero = aleatorio.nextInt(100) + 1;
                                                    
        System.out.println("El número generado es: " + numero);

        if (numero % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }
}
