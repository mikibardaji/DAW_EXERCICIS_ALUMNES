
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gba0006
 */
public class exercisi7 {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner (System.in);
        
        int num, contador = 0, contadorNegativo = 0, contadorPositivo =0;
        boolean negativo = false;
        
        while (contador < 10) {
            System.out.println("Introdueix un numero no nul:");
            num = teclado.nextInt();

            if (num != 0) {
                ++contador;

                if (num < 0) {
                    ++contadorNegativo;
                } else {
                    ++contadorPositivo;
                }
            } else {
                System.out.println("Introdueix un numero diferent al cero");
            }
        }

        System.out.println("Numeros positius: " + contadorPositivo);
        System.out.println("Numeros negatius: " + contadorNegativo);
        
    }
}
