/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex.caixa.registrador;

/**
 *
 * @author Usuario
 */
public class ExCaixaRegistrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
import java.util.Scanner;

public class GestorEstalvis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Variables del programa
        double saldo = 100, cantidad,objetivo = 1000, falta;
        int opcion;

        boolean continuar = true;

        // Repetir el menu
        while (continuar) {

            System.out.println(" GESTOR D'ESTALVIS ");
            System.out.println("1. Consultar ahorros");
            System.out.println("2. Anadir dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Consultar objetivo de ahorro");
            System.out.println("5. Salir");
            System.out.println("Elige una opcion:");

            try {

                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {

                    case 1:
                        // Mostrar los ahorros actuales
                        System.out.println("Tienes ahorrados: " + saldo + " euros");
                        break;

                    case 2:
                        // Anadir dinero
                        System.out.println("Cuanto dinero quieres anadir?");
                        cantidad = Double.parseDouble(sc.nextLine());

                        if (cantidad > 0) {

                            saldo = saldo + cantidad;

                            System.out.println("Dinero anadido correctamente.");
                            System.out.println("Nuevo saldo: " + saldo + " euros");

                        } 
                        else {
                            System.out.println("La cantidad debe ser mayor que 0.");
                        }
                        break;

                    case 3:
                        // Retirar dinero
                        System.out.println("Cuanto dinero quieres retirar?");
                        cantidad = Double.parseDouble(sc.nextLine());

                        if (cantidad > 0) {

                            if (cantidad <= saldo) {

                                saldo = saldo - cantidad;

                                System.out.println("Retirada realizada correctamente.");
                                System.out.println("Nuevo saldo: " + saldo + " euros");

                            } 
                            else {
                                System.out.println("No tienes suficiente dinero.");
                            }

                        }
                        else {
                            System.out.println("La cantidad debe ser mayor que 0.");
                        }
                        break;

                    case 4:
                        // Consultar el objetivo de ahorro
                        falta = objetivo - saldo;

                        if (falta > 0) {

                            System.out.println("Tu objetivo es: " + objetivo + " euros");
                            System.out.println("Te faltan: " + falta + " euros");

                        }
                        else {

                            System.out.println("Felicidades! Has conseguido tu objetivo.");
                        }
                        break;

                    case 5:
                        // Salir del programa
                        continuar = false;
                        System.out.println("Gracias por utilizar el gestor de ahorros.");
                        break;

                    default:
                        System.out.println("Opcion incorrecta. Elige del 1 al 5.");
                }

            } 
            catch (NumberFormatException e) {

                System.out.println("Error: debes introducir un numero.");
            }
        }

        System.out.println("Programa finalizado.");

   
    }
}

    
    

