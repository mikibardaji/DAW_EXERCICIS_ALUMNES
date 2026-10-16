package adivinanumero;

import java.util.Scanner;

import java.util.Random;


public class AdivinaNumero {

    public static void main(String[] args) {
        
       // Creamos el teclado
        Scanner teclado = new Scanner(System.in);
        
      //Creamos el generador de numeros aleatorios
        Random aleatorio = new Random ();
        
      //Declaramos la variable para los intentos
      int intento;
      int numeroSecreto = aleatorio.nextInt(100) + 1;
      
        System.out.println("Adivina el numero entre 1 y 100");
        
        do{
           //Pedimos un numero al usuario
            System.out.println("Introduce un numero: ");
            
          //Guardamos el numero que escribe el usuario
          intento = teclado.nextInt();
          
          //Comprobamos si ha acertado
          
          if(intento < numeroSecreto){
              System.out.println("El numero es mayor");
          } else if (intento > numeroSecreto){
              System.out.println("El numero es menor");
          } else {
              
              System.out.println("Acertaste");
          }
          
        }
          while (intento != numeroSecreto);
          }
}
