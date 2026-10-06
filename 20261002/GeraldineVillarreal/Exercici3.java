/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici3;
import java.util.Scanner;
/**
 *
 * @author geral
 */
public class Exercici3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String user,rol;
        Scanner scan=new Scanner(System.in);
        System.out.println("introdueix el teu nom d'usuari");
        user=scan.nextLine();
        System.out.println("Introdueix el teu rol (estudiant/administrador)");
        rol= scan.nextLine();
        
        if (rol.equalsIgnoreCase("admnistrador"))
          {
              System.out.println("Accés permes. Pots gestionar els usuaris");
          }
        else 
          {
              System.out.println("Accés denegat.Només els administradors tenen aquest permís.");
          }
    }
    
}
