/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex7alertadepreus;

import java.util.Scanner;
/**
 *
 * @author saihb
 */
public class Ex7AlertaDePreus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precioLibro;
        String comentario="";
        
        System.out.println("Cual es el precio del libro");
        precioLibro = sc.nextDouble();
        
        if (precioLibro<0)  {
            comentario = "Error preu no vàlid";
        }
        else if (precioLibro < 15.0){
            comentario = "Preu excel·lent! És una ganga.";  
        }
        else if (precioLibro >= 15.0 && precioLibro <= 35.0) {
            comentario = "Preu estàndard i correcte per a un llibre.";
        } 
        else if (precioLibro > 35.0){
            comentario = "Atenció: Aquest llibre té un preu superior a la mitjana.";
        } 
        
        System.out.println(comentario);
    }
    
}
