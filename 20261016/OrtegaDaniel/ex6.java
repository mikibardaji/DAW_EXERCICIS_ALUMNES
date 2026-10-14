
package ex6;

import java.util.Scanner;


public class Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int num;
        int contador = 0;
        boolean negativo = false;
        
        while (contador < 10) {
            System.out.println("Introduce un numero no nulo");
            num = teclado.nextInt();
            
            if (num != 0) {
                contador++;
                if (num < 0) {
                    negativo = true;
                }
            } else {
                System.out.println("El numero no puede ser 0");
            }
        }
        
        if (negativo){
            System.out.println("Hay numero negativo");
        } else {
            System.out.println("No hay ningun numero negativo");
        }
    }
    
}
