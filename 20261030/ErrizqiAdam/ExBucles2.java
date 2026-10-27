/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exbucles2;

import java.util.Scanner;

/**
 *
 * @author adamg
 */
public class ExBucles2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombreProd, opcion, salida;
        int precioProd, gasto=0, eleccion, resta, gastoTotal, contador=0, saldo=500, ingresar;
        boolean salida2=false;
        
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("1.Ingresar dinero");
            System.out.println("2.Comprar producto");
            System.out.println("3.Salir");
            System.out.println("Escoge una opcion: ");
            eleccion = sc.nextInt();
            
            if (eleccion==1){
                System.out.println("Cuanto dinero deseas ingresar?");
                ingresar = sc.nextInt();
                
                saldo += ingresar;
                
                System.out.println("Tu saldo finalmente es de: " + saldo + " monedas");
            } 
            
            else if (eleccion==2){
                do {
                    System.out.println("Introduce el nombre del producto que quieres comprar:");
                    nombreProd = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Cuanto vale el producto?");
                    precioProd = sc.nextInt();
                    sc.nextLine();
                    
                    if (precioProd < saldo) {
                        System.out.println("Puedes comprar este producto");
                        resta = saldo-precioProd;
                        System.out.println("Te quedan " + resta + " monedas restantes");
                    } else if (precioProd > saldo) {
                        System.out.println("No tienes suficiente saldo para comprar el producto");
                        break;
                    }
                    
                    System.out.println("Deseas contratar mas servicios? (si / no)");
                    opcion = sc.next();
                    sc.nextLine();

                    if (opcion.equalsIgnoreCase("si")) {

                        gasto += precioProd;
                        continue;
                    } else if (opcion.equalsIgnoreCase("no")){
                        gasto += precioProd;

                        gastoTotal = gasto;

                        System.out.println("Has gastado: " + gasto + " monedas");

                    }
                    contador++;
                } while(!opcion.equalsIgnoreCase("no"));

                System.out.println("Has comprado " + contador + " productos");
            } 
            
            else if (eleccion==3){
                System.out.println("Quieres salir? (si o no)");
                salida = sc.next();
                
                if (salida.equalsIgnoreCase("Si")) {
                    System.out.println("Has gastado: " + gasto + " monedas en total");
                    System.out.println("Has comprado " + contador + " productos");
                    salida2=true;
                    break;
                } else if (salida.equalsIgnoreCase("No")) {
                    salida2=false;
                }
            } 
        }while(!salida2);
        
        
       
        
        }
}
