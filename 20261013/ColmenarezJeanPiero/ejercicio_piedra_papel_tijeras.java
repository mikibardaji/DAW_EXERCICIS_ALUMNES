/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eje_condicionalesrandom.java;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jco5780
 */
public class Eje_condicionalesRandomJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        int numMaquina; 
        int numeroUser;
        boolean cara_cruz;
        String saca;
        char opcionjugador="", opcionmaquina="";
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
        
        //ejercio 6
        System.out.println("elija la jugada piedra o papel o tijera");
        opcionjugador = teclado.next().charAt(0);
        
        if (opcionjugador == 'S' || opcionjugador=='s')
        {
        opcionjugadorTexte = "tijeras";
        }
        else if (opcionjugador == 'S' || opcionjugador=='s')
        {
        opcionjugadorTexte = "tijeras";
        }
        else if (opcionjugador == 'S' || opcionjugador=='s')
        {
        opcionjugadorTexte = "tijeras";
        }
        //tambien lo puedes hacer en switch
        System.out.println("has jugado : " opcionjugadorTexto);
        nummaquina = random.nextInt(1,4)
          if (opcionjugador == 'T' || opcionjugador=='t')
        {
        opcionmaquinaTexte = "tijeras";
        }
        else if (opcionjugador == 'P' || opcionjugador=='p')
        {
        opcionmaquinaTexte = "piedra";
        }
        else if (opcionjugador == 'P' || opcionjugador=='p')
        {
        opcionmaquinaTexte = "papel";
        }
        System.out.println("La maquina ha jugado " + opcionmaquinaTexto);
        String resultado
        if (opcionjugador == opcionmaquina){
        resultado = "Empatado"
        }
        else if ((opcionjugador == "S" && opcionmaquina=="A") 
            || (opcionjugador == "T" && opcionmaquina=="S")
            || (opcionjugador == "T" && opcionmaquina=="T"))
        {
            resultado = "jugador";
        }
        //maquina
        else if ((opcionjugador == "S" && opcionmaquina=="A") 
            || (opcionjugador == "T" && opcionmaquina=="S")
            || (opcionjugador == "T" && opcionmaquina=="T"))
        {
            resultado = "maquina";
        }
        }
    
    }
    
}
