/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopassword;

import java.util.Scanner;

/**
 *
 * @author jco5780
 */
public class EjercicioPassword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String user, password;
    int intentos=0, contador;
    //final String password = "admin123";
    
        System.out.println("Nombre de Usuario");
        user = teclado.nextLine();
        do {
            
 
        System.out.println("Introduce la contraseña");
        password = teclado.nextLine();
        //actualizar contador
        intentos++;
        if (password.equals("Admin123")){
                System.out.println("Bienvenido " + user);
        }
        else  {
            System.out.println("Incorrecto");
            System.out.println("Recuerda que al tercer intento se bloquea");
        }
     
        } while (!password.equals(password_ok)&& intentos < 3);
        
        if(!password.equals(password_ok))
        {
            System.out.println("Cuenta Bloqueada");
        }
        else{
            
        }
        
    }
    
}
