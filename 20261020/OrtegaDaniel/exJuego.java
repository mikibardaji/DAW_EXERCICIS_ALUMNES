package juego11;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author alumne
 */
public class Juego11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {     
  
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeromaquina = random.nextInt(100)+ 1;
        
        System.out.println("Intenta adivinarlo");
        int intento=0;
        
        
        while(intento!=numeromaquina){
            System.out.print("Introduce tu número: ");
            intento = scanner.nextInt();
            
            
            if (intento < numeromaquina) {
                System.out.println("El numero es mayor");
            } else if (intento > numeromaquina) {
                System.out.println("Es menor");
            } else {
                System.out.println("Acertaste");
                break; 
            }
        }
    }
}
