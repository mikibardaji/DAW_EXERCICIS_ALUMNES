/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enunciatproven;

import java.util.Scanner;

/**
 *
 * @author jco5780
 */
public class EnunciatProven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String user,correo, password, nom_producto, desc_producto, producto_interesado;
        double precio;
        int id;
        boolean correctoPassword=false, vender_comprar=false;
        
        System.out.println("Crea tu usuario");
        System.out.println("Nombre:");
        user = teclado.nextLine();
//        System.out.println("Correo Electronico:");
//        correo
        System.out.println("Bienvenido " + user);
        
        System.out.println("Sabes un producto que te interese?");
        producto_interesado = teclado.nextLine();
        
        
        
        

    }
    
}
