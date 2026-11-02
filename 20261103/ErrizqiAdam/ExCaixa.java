/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excaixa;

import java.util.Scanner;

/**
 *
 * @author adamg
 */
public class ExCaixa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double preus;
        double total = 0;
        boolean funcionant = true;
        
        do{
            try {

            
                System.out.println("Introdueix els preus aqui");
                String entrada = sc.nextLine();

                preus=Double.parseDouble(entrada);
                if (preus==0){
                    System.out.println("Tancant el programa de la caixa");
                    
                    System.out.println("El total ha sigut de: " + total + "€");
                    funcionant=false;
                }
                
                total += preus; 
                
            
            }
            catch(NumberFormatException ex) {
                System.out.println("Has d'introduir un numero");
                System.out.println("El total ha sigut de: " + total + "€");
                funcionant=false;
            }
        } while(funcionant);
            System.out.println("Has sortit");
    }
    
}
