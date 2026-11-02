/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectecalculadoradeviajes;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kande
 */
public class ProjecteCalculadoradeviajes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        int opcion = 0;

        do {

            System.out.println("================================");
            System.out.println("      CALCULADORA DE VIAJES");
            System.out.println("================================");
            System.out.println("1. Calcular combustible y coste por persona");
            System.out.println("2. Generar viaje aleatorio");
            System.out.println("3. Salir");
            System.out.println("================================");
            System.out.print("Selecciona una opcion: ");

            try {

                opcion = entrada.nextInt();

                switch (opcion) {

                    case 1:

                        double kilometros;
                        double consumo;
                        double precio;
                        int personas;
                        double litros;
                        double coste;
                        double costePersona;

                        System.out.println("CALCULAR COMBUSTIBLE");

                        // Introducir kilometros
                        System.out.print("Introduce los kilometros del viaje: ");
                        kilometros = entrada.nextDouble();

                        while (kilometros <= 0) {
                            System.out.println("Error: Los kilometros deben ser mayores que 0.");
                            System.out.print("Introduce los kilometros del viaje: ");
                            kilometros = entrada.nextDouble();
                        }

                        // Introducir consumo
                        System.out.print("Introduce el consumo del coche (L/100 km): ");
                        consumo = entrada.nextDouble();

                        while (consumo <= 0) {
                            System.out.println("Error: El consumo debe ser mayor que 0.");
                            System.out.print("Introduce el consumo del coche (L/100 km): ");
                            consumo = entrada.nextDouble();
                        }

                        // Introducir precio
                        System.out.print("Introduce el precio de gasolina por litro: ");
                        precio = entrada.nextDouble();

                        while (precio <= 0) {
                            System.out.println("Error: El precio debe ser mayor que 0.");
                            System.out.print("Introduce el precio de gasolina por litro: ");
                            precio = entrada.nextDouble();
                        }

                        // Introducir personas
                        System.out.print("Introduce el numero de personas: ");
                        personas = entrada.nextInt();

                        while (personas <= 0) {
                            System.out.println("Error: Debe haber al menos una persona.");
                            System.out.print("Introduce el numero de personas: ");
                            personas = entrada.nextInt();
                        }

                        // Calculos
                        litros = (kilometros * consumo) / 100;
                        coste = litros * precio;
                        costePersona = coste / personas;

                        // Resultados
                        System.out.println("===============================");
                        System.out.println("       RESULTADO DEL VIAJE");
                        System.out.println("===============================");

                        System.out.println("Distancia: " + kilometros + " km");
                        System.out.println("Consumo: " + consumo + " L/100 km");
                        System.out.println("Precio gasolina: " + precio + " euros/L");
                        System.out.println("Numero de personas: " + personas);

                        System.out.println("-------------------------------");

                        System.out.printf("Combustible necesario: %.2f litros%n", litros);
                        System.out.printf("Coste total: %.2f euros%n", coste);
                        System.out.printf("Coste por persona: %.2f euros%n", costePersona);

                        System.out.println("===============================");

                        break;

                    case 2:

                        System.out.println("GENERANDO VIAJE ALEATORIO...");

                        int kilometrosAleatorios = aleatorio.nextInt(751) + 50;
                        double consumoAleatorio = aleatorio.nextInt(7) + 4;
                        double precioAleatorio = aleatorio.nextInt(41) / 100.0 + 1.40;
                        int personasAleatorias = aleatorio.nextInt(5) + 1;

                        double litrosAleatorios = (kilometrosAleatorios * consumoAleatorio) / 100;
                        double costeAleatorio = litrosAleatorios * precioAleatorio;
                        double costePersonaAleatorio = costeAleatorio / personasAleatorias;

                        System.out.println("===============================");
                        System.out.println("         VIAJE ALEATORIO");
                        System.out.println("===============================");

                        System.out.println("Kilometros: " + kilometrosAleatorios + " km");
                        System.out.println("Consumo: " + consumoAleatorio + " L/100 km");
                        System.out.println("Precio gasolina: " + precioAleatorio + " euros/L");
                        System.out.println("Numero de personas: " + personasAleatorias);

                        System.out.println("-------------------------------");

                        System.out.printf("Combustible necesario: %.2f litros%n", litrosAleatorios);
                        System.out.printf("Coste total: %.2f euros%n", costeAleatorio);
                        System.out.printf("Coste por persona: %.2f euros%n", costePersonaAleatorio);

                        System.out.println("===============================");

                        break;

                    case 3:

                        System.out.println("Gracias por utilizar la calculadora. Buen viaje!");
                        break;

                    default:

                        System.out.println("Opcion incorrecta. Intentalo de nuevo.");
                        break;
                }

            } catch (Exception ex) {

                System.out.println("Error: debes introducir un numero.");
                entrada.nextLine();
                opcion = 0;

            }

        } while (opcion != 3);

        entrada.close();
    }
}
