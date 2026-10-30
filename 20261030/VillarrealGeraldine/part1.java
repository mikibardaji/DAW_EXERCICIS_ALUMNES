/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crearenunciado1;

import java.util.Scanner;
/**
 *
 * @author gvi6123
 */
public class CrearEnunciado1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
double precio, sumaTotal=0, ingreso; //saldo
        int productosComprados=0;
        String nombre, seguir;
        do
        {
            System.out.println("Que producto quieres");
            nombre=sc.nextLine();
            System.out.println("Que precio quieres comprar?");
            precio=sc.nextDouble();
            sumaTotal+=precio;
            productosComprados++;
            sc.nextLine();
            System.out.println("Quieres algun producto mas (SI/NO)");
            seguir=sc.nextLine();
            
        }
        while(!seguir.equalsIgnoreCase("NO"));
        {
            System.out.println("Total gastado" + sumaTotal);
            System.out.println("Prodcutos comprados"+productosComprados);
        }
        
    }
    
}
