import java.util.Random;

public class Ex4 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int dado;

        dado = aleatorio.nextInt(6) + 1;

        System.out.println("Has sacado un: " + dado);

        if (dado == 6) {
            System.out.println("Has tret un 6!");
        } else if (dado == 1) {
            System.out.println("Quina mala sort!");
        } else {
            System.out.println("Resultat normal");
        }
    }
}
