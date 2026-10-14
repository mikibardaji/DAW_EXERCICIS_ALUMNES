package exercici7;

import java.util.Scanner;

public class Exercici7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int num;
        int contador = 0, contadorNegativo = 0, contadorPositivo = 0;
        boolean negativo = false;
        
        while (contador < 10) {
            System.out.println("Introduce un numero no nulo");
            num = sc.nextInt();
            
            if (num != 0) {
                contador++;
                if (num < 0) {
                    negativo = true;
                    contadorNegativo++;
                } else {
                contadorPositivo++;
                }
            } else {
                System.out.println("El numero no puede ser 0");
            }
            
             
            
           
        
        }
        
        System.out.println("Hay " + contadorNegativo + " numeros negativos");
        System.out.println("Hay " + contadorPositivo + " numeros positivos");
    }
    
}
