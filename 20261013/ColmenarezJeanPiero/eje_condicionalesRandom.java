import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        int numMaquina; 
        int numeroUser;
        boolean cara_cruz;
        String saca;
        //ejercicio 1
        System.out.print("Que numero has pensat 1-10? ");
        numeroUser = aleatorio.nextInt(1, 11);
        if (numeroUser > numMaquina) {
            System.out.println("T'has passat!");
        } else if (numeroUser < numMaquina) {
            System.out.println("El numero es mas gran!");
        } else {
            System.out.println("Has encertat!");
        }

 System.out.println("El numero de la moneda es: " + numMaquina);

        //ejercicio 2
        System.out.println("Antes de empenzar el partido hay que decidir quien saca ... ");
        System.out.println("cara o cruz?");
        cara_cruz = teclado.nextBoolean();
        System.out.println("-Perfecto, yo  elijo " + aleatorio.nextBoolean());
        if (caraz_cruz){
            saca = "cara";
        }
        else{
            saca = "cruz";
        }
        System.out.println("La moneda salio " + saca + ", su sacas y  oltro elige campo");
        
        
    }
}
