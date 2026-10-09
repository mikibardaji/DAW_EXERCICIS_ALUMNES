/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provensharecondicionalesswitch;

import java.util.Scanner;

/**
 *
 * @author sthef
 */
public class DisponibilidadHoraria {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String horario, modalidad;
        
        
        System.out.print("En que horario quieres hacer la reserva (Mati o Tarda): ");
        horario = sc.nextLine();
        
        System.out.print("Que modalidad deseas (Online o Presencial): ");
        modalidad = sc.nextLine();
        
        if (horario.equalsIgnoreCase("MATI") && modalidad.equalsIgnoreCase("ONLINE")){
            System.out.println("Reserva confirmada con el experto.");
            
        } else if (horario.equalsIgnoreCase("TARDA") && modalidad.equalsIgnoreCase("PRESENCIAL")){
            System.out.println("Reserva confirmada con el experto.");
        
        }else {
            System.out.println(" El experto no está disponible en esta franja para esta modalidad.");
        
        }
        
        
        
    }
    
    
}
