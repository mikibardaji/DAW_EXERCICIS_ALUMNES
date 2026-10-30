/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejcompraacumulativomenu;

import java.util.Scanner;

/**
 *
 * @author fso6590
 */
public class EjCompraAcumulativoMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double total = 0, precio, saldo = 500, ingreso;
        int productos = 0, opcio;
        String pregunta = null;
        do {
            System.out.println("Tienes "+saldo+" de saldo");
            System.out.println("Que quieres hacer?");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Comprar producto");
            System.out.println("3. Salir");
            opcio = teclado.nextInt();
            if (opcio == 1) {
                System.out.println("Dime cuanto dinero quieres ingresar?");
                ingreso = teclado.nextDouble();
                saldo = saldo + ingreso;
            }else if (opcio == 2) {
                System.out.println("Cuanto vale el producto?");
                precio = teclado.nextDouble();
                if (saldo - precio < 0) {
                    System.out.println("No tienes el suficiente saldo para comprar el producto");
                }else {
                    saldo = saldo - precio;
                    System.out.println("Producto comprado, te queda "+saldo+" saldo disponible");
                    productos ++;
                    total = total + precio;
                }
            }else {
                System.out.println("Hasta la proxima");
            }
            
        } while (opcio!=3);
        System.out.println("Has comprado "+productos+" productos");
        System.out.println("Has gastado "+total+" creditos");
    }
    
}
