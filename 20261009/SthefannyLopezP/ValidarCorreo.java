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
public class ValidarCorreo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String correo, llocEstud, extension;
        
        System.out.println("Ingresa tu correo electronico: ");
        correo = sc.nextLine();
        System.out.println("Ingresa tu el lugar donde estudias (Universitat o Institut: ");
        llocEstud = sc.nextLine();
        System.out.println("Introduce la extension de tu correo ( .es .edu  .cat) : ");
        extension = sc.nextLine();
        
        if(llocEstud.equalsIgnoreCase("UNIVERSITAT") && (extension.equals(".edu") || extension.equals(".cat")))
        {
           System.out.println("Correo oficial validado.");
      
        } else if(llocEstud.equalsIgnoreCase("INSTITUT") && (extension.equals(".es") || extension.equals(".cat"))){
            System.out.println("Error: La extensión no corresponde a tu centro de estudios.");
            
        } else {
            System.out.println("Error: La extensión no corresponde a tu centro de estudios.");
        }
      }
  
    }

