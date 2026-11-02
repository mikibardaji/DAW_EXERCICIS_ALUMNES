/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excaixaregistradora;

import java.util.Scanner;

/**
 *
 * @author andca
 */
public class ExCaixaRegistradora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double preu;
        double total = 0;
        String entrada;
        boolean funcionant = true;
        
        do{
            try {

            
                System.out.println("Introdueix el preu del producte (0 per acabar): ");
                entrada = sc.nextLine();

                preu=Double.parseDouble(entrada);
                if (preu==0){
                    System.out.println("Tancant el programa de la caixa");
                    
                    System.out.println("El total ha sigut de: " + total + "€");
                    funcionant=false;
                }
                
                total += preu; 
                
            
            }
            catch(NumberFormatException ex) {
                System.out.println("Error de format. Operació cancel·lada per seguretat. Has d'introduir un numero.");
                System.out.println("Total de la compra: " + total + "€");
                funcionant= false;
            }
        } while(funcionant);
            System.out.println("Has sortit");
    }
    
}
