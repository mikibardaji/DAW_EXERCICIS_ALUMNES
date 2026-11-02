import java.util.Scanner;
import java.util.Random;

public class SimuladorFutbol {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int opcion = 0;
        int partidosJugados = 0;
        int victoriasLocal = 0;
        int victoriasVisitante = 0;
        int empates = 0;

        System.out.println("=================================");
        System.out.println("      SIMULADOR DE FUTBOL");
        System.out.println("=================================");

        while (opcion != 3) {
            System.out.println();
            System.out.println("----------- MENU -----------");
            System.out.println("1. Simular un partido");
            System.out.println("2. Consultar estadisticas");
            System.out.println("3. Salir");
            System.out.print("Elige una opcion: ");

            try {
                opcion = Integer.parseInt(teclado.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.print("Nombre del equipo local: ");
                        String equipoLocal = teclado.nextLine();

                        System.out.print("Nombre del equipo visitante: ");
                        String equipoVisitante = teclado.nextLine();

                        if (equipoLocal.trim().isEmpty() || equipoVisitante.trim().isEmpty()) {
                            System.out.println("Error: los nombres de los equipos no pueden estar vacios.");
                        } else if (equipoLocal.equalsIgnoreCase(equipoVisitante)) {
                            System.out.println("Error: los dos equipos deben ser diferentes.");
                        } else {
                            int golesLocal = aleatorio.nextInt(6);
                            int golesVisitante = aleatorio.nextInt(6);

                            System.out.println();
                            System.out.println("--------- RESULTADO ---------");
                            System.out.println(equipoLocal + " " + golesLocal + " - " + golesVisitante + " " + equipoVisitante);

                            partidosJugados++;

                            if (golesLocal > golesVisitante) {
                                System.out.println("¡Ha ganado " + equipoLocal + "!");
                                victoriasLocal++;
                            } else if (golesVisitante > golesLocal) {
                                System.out.println("¡Ha ganado " + equipoVisitante + "!");
                                victoriasVisitante++;
                            } else {
                                System.out.println("El partido ha terminado en empate.");
                                empates++;
                            }
                        }
                        break;

                    case 2:
                        System.out.println();
                        System.out.println("------ ESTADISTICAS ------");
                        System.out.println("Partidos simulados: " + partidosJugados);
                        System.out.println("Victorias del equipo local: " + victoriasLocal);
                        System.out.println("Victorias del equipo visitante: " + victoriasVisitante);
                        System.out.println("Empates: " + empates);
                        break;

                    case 3:
                        System.out.println("Gracias por utilizar el simulador. ¡Hasta pronto!");
                        break;

                    default:
                        System.out.println("Opcion no valida. Elige 1, 2 o 3.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Error: debes introducir un numero.");
            }
        }

        teclado.close();
    }
}
