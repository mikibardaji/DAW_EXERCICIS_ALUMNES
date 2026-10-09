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
public class ModalidadServicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // TODO code application logic here
        String modalidad, enlace,lugar;
        //String enlace; //
        
        System.out.println("Elige que modalidad de servicio quieres: Online/Presencial");
        modalidad = sc.nextLine();
        
        if (modalidad.equalsIgnoreCase("ONLINE")){
            System.out.println("Ingrese el enlace de Discord/Meet");
            enlace = sc.nextLine();
            System.out.println("Servicio configurado. Enlace guardado.");
            
        } else if (modalidad.equalsIgnoreCase("PRESENCIAL")){
            System.out.println("Ingrese aula o lugar de encuentro ");
            lugar = sc.nextLine();
            System.out.println("Servicio configurado. Punto de encuentro guardado.");
        
        } else {
            System.out.println("Datos incorrectos");
        
        }
        
    }
    
}
