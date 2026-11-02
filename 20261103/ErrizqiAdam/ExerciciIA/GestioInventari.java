
import java.util.Scanner;
import java.util.Random;

public class GestioInventari {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String nom = "";
        double preu = 0;
        int estoc = 0;

        boolean producteCreat = false;

        int opcio = 0;

        do {

            System.out.println("\n===== GESTIO D'INVENTARI =====");
            System.out.println("1. Afegir producte");
            System.out.println("2. Eliminar producte");
            System.out.println("3. Modificar preu");
            System.out.println("4. Actualitzar estoc");
            System.out.println("5. Consultar producte");
            System.out.println("6. Buscar producte pel nom");
            System.out.println("7. Detectar poc estoc");
            System.out.println("8. Calcular valor inventari");
            System.out.println("9. Simular venda");
            System.out.println("10. Sortir");

            System.out.print("Escull una opcio: ");

            try {

                opcio = sc.nextInt();
                sc.nextLine();

                switch (opcio) {

                    case 1:

                        System.out.print("Nom del producte: ");
                        nom = sc.nextLine();

                        System.out.print("Preu: ");
                        preu = sc.nextDouble();

                        System.out.print("Quantitat: ");
                        estoc = sc.nextInt();
                        sc.nextLine();

                        if (preu >= 0 && estoc >= 0) {

                            producteCreat = true;
                            System.out.println("Producte afegit!");

                        } else {

                            System.out.println("Dades incorrectes.");

                        }

                        break;

                    case 2:

                        if (producteCreat) {

                            System.out.println("Producte eliminat.");

                            nom = "";
                            preu = 0;
                            estoc = 0;

                            producteCreat = false;

                        } else {

                            System.out.println("No hi ha cap producte.");

                        }

                        break;

                    case 3:

                        if (producteCreat) {

                            System.out.print("Introdueix el nou preu: ");
                            double nouPreu = sc.nextDouble();
                            sc.nextLine();

                            if (nouPreu >= 0) {

                                preu = nouPreu;
                                System.out.println("Preu modificat!");

                            } else {

                                System.out.println("Preu incorrecte.");

                            }

                        } else {

                            System.out.println("No hi ha cap producte.");

                        }

                        break;

                    case 4:

                        if (producteCreat) {

                            System.out.print("Introdueix el nou estoc: ");
                            int nouEstoc = sc.nextInt();
                            sc.nextLine();

                            if (nouEstoc >= 0) {

                                estoc = nouEstoc;
                                System.out.println("Estoc actualitzat!");

                            } else {

                                System.out.println("Quantitat incorrecta.");

                            }

                        } else {

                            System.out.println("No hi ha cap producte.");

                        }

                        break;

                    case 5:

                        if (producteCreat) {

                            System.out.println("\n--- PRODUCTE ---");
                            System.out.println("Nom: " + nom);
                            System.out.println("Preu: " + preu + " euros");
                            System.out.println("Estoc: " + estoc);

                        } else {

                            System.out.println("No hi ha cap producte.");

                        }

                        break;

                    case 6:

                        if (producteCreat) {

                            System.out.print("Introdueix el nom: ");
                            String nomBuscar = sc.nextLine();

                            if (nom.equalsIgnoreCase(nomBuscar)) {

                                System.out.println("Producte trobat!");
                                System.out.println("Nom: " + nom);
                                System.out.println("Preu: " + preu);
                                System.out.println("Estoc: " + estoc);

                            } else {

                                System.out.println("Producte no trobat.");

                            }

                        } else {

                            System.out.println("No hi ha cap producte.");

                        }

                        break;

                    case 7:

                        if (producteCreat) {

                            if (estoc <= 5) {

                                System.out.println("ATENCIO! Poc estoc.");
                                System.out.println("Unitats disponibles: " + estoc);

                            } else {

                                System.out.println("Estoc suficient.");

                            }

                        } else {

                            System.out.println("No hi ha cap producte.");

                        }

                        break;

                    case 8:

                        if (producteCreat) {

                            double valorTotal = preu * estoc;

                            System.out.println("Valor total: "
                                + valorTotal + " euros");

                        } else {

                            System.out.println("No hi ha cap producte.");

                        }

                        break;

                    case 9:

                        if (producteCreat) {

                            if (estoc > 0) {

                                int venda = random.nextInt(estoc) + 1;

                                estoc = estoc - venda;

                                System.out.println("Venda realitzada!");
                                System.out.println("Unitats venudes: " + venda);
                                System.out.println("Estoc restant: " + estoc);

                            } else {

                                System.out.println("No hi ha estoc disponible.");

                            }

                        } else {

                            System.out.println("No hi ha cap producte.");

                        }

                        break;

                    case 10:

                        System.out.println("Sortint del programa...");

                        break;

                    default:

                        System.out.println("Opcio incorrecta.");

                }

            } catch (Exception e) {

                System.out.println("Error! Introdueix una dada valida.");
                sc.nextLine();

            }

        } while (opcio != 10);

        sc.close();

    }
}
