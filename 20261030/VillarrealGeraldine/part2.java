/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compraproductes;

import java.util.Scanner;
/**
 *
 * @author gvi6123
 */
public class CompraProductes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double precio, sumaTotal=0, ingreso, saldo=500; //saldo
        int productosComprados=0, opcion;
        String nombre, seguir;
        do
        {
            System.out.println("Saldo diponible:"+saldo);
            System.out.println("1.- Ingesar dinero");
            System.out.println("2.- comprar producto");
            System.out.println("3.- salir");
            System.out.print("Que opcion quieres?");
            opcion=sc.nextInt();
            
            switch(opcion)
            {
                case 1:
                   System.out.println("Cuanto quieres ingesar");
                   ingreso=sc.nextDouble();
                   saldo+=ingreso;
                    System.out.println("Aumentando el saldo...");
                  break;
                case 2:
                    sc.nextLine();
                    System.out.println("Que producto quieres");
                    nombre=sc.nextLine();
                    System.out.println("Que precio tiene?");
                    precio=sc.nextDouble();
                    if(precio<=saldo)
                    {
                        sumaTotal+=precio;
                        productosComprados++;
                        saldo-=precio;
                        System.out.println("Producto comprado");
                    }
                    else
                    {
                        System.out.println("No tienes suficiente saldo");
                    }
                    sc.nextLine();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    break;
            }
                    
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
        //while(!seguir.equalsIgnoreCase("NO"));
        while(opcion!=3);
        System.out.println("Total gastado" + sumaTotal);
        System.out.println("Prodcutos comprados"+productosComprados);
    }
    
}
