package loginproven;

import java.util.Scanner;

/**
 *
 * @author jeg2463
 */
public class LoginProven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Declaramos el Scanner
       Scanner scanner = new Scanner(System.in);
       //Declaramos la variable de tipo String que en este caso sera el correo
       String correo = "";
       String passwordCorrecta = "@proven.cat";
       String password = "";
       
       //Declaramos las variables de tipo int
       
       int intentos = 0;
       int maxIntentos =3;
       
       //Declaramos la variable de tipo boolean (v/f)
       boolean accesoConcedido = false;
       
       //Procesamiento de datos
       //1er Bucle
       while (!correo.endsWith("@proven.cat")){
      
       //Ingresamos los datos por consola
       System.out.println("Introduce tu correo electronico:"); 
       correo = scanner.nextLine();
       
       //Procesamiento de datos
       if (!correo.endsWith("@proven.cat"")){
               System.out.println("Correo incorrecto. Intentalo de nuevo");
    }
    
}
//Segundo bucle
    
    while (intentos <maxIntentos && !accesoConcedido){
    
    System.out.println("Introduce tu contraseña:");
    password = scanner.nextLine();
    
    if (password.equals(passwordCorrecta)){
    accesoConcedido = true;
    
} else}
    intentos ++;
    system.out.println("Contraseña incorrecta");
    
    if (intentos >= maxIntentos){
    System.out.println("Usuario bloqueado, has superado el limite de intentos");
    
}
    
}
    
}
