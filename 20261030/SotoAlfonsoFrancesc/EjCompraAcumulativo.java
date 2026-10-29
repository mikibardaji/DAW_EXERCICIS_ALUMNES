/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejcompraacumulativo;

import java.util.Scanner;

/**
 *
 * @author fso6590
 */
public class EjCompraAcumulativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int productos = 0, total = 0, salir = 0, precio;
        String pregunta = null;
        do {
            System.out.println("Quieres comprar algun producto?");
            pregunta = teclado.nextLine();
            if (pregunta.equalsIgnoreCase("si")) {
                System.out.println("Cuanto vale el prudcot? ");
                precio = teclado.nextInt();
                total += precio;
                productos ++;
            }else if (pregunta.equalsIgnoreCase("no")){
                System.out.println("Hasta la proxima");
            }
        } while (!"no".equals(pregunta));
        System.out.println("Has comprado una cantidad de "+productos+" productos");
        System.out.println("Y has gastado una cantidad de "+total+" creditos");
    }
    
}
