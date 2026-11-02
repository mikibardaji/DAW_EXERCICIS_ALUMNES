/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciia;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Caire
 */
public class ExerciciIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
 
        double pes = 0;
        double alcada = 0;
        int edat = 0;
        String sexe = "";
        double imc = 0;
        double caloriesDiaries = 0;
        double caloriesCremades = 0;
        int entrenaments = 0;
 
        boolean dadesIntroduides = false;
 
        int opcio = 0;
 
        do {
 
            System.out.println("\n===== SIMULADOR DE GIMNAS =====");
            System.out.println("1. Introduir dades personals");
            System.out.println("2. Calcular IMC");
            System.out.println("3. Calcular calories diaries");
            System.out.println("4. Generar rutina aleatoria");
            System.out.println("5. Simular entrenament");
            System.out.println("6. Veure resum");
            System.out.println("7. Sortir");
 
            System.out.print("Escull una opcio: ");
 
            try {
 
                opcio = sc.nextInt();
                sc.nextLine();
 
                switch (opcio) {
 
                    case 1: {
 
                        System.out.print("Pes (kg): ");
                        double nouPes = sc.nextDouble();
 
                        System.out.print("Alcada (cm): ");
                        double novaAlcada = sc.nextDouble();
 
                        System.out.print("Edat (anys): ");
                        int novaEdat = sc.nextInt();
                        sc.nextLine();
 
                        System.out.print("Sexe (H = home, D = dona): ");
                        String nouSexe = sc.nextLine();
 
                        if (nouPes > 0 && nouPes < 300
                                && novaAlcada > 50 && novaAlcada < 250
                                && novaEdat > 0 && novaEdat < 120
                                && (nouSexe.equalsIgnoreCase("H") || nouSexe.equalsIgnoreCase("D"))) {
 
                            pes = nouPes;
                            alcada = novaAlcada;
                            edat = novaEdat;
                            sexe = nouSexe.toUpperCase();
                            dadesIntroduides = true;
 
                            System.out.println("Dades guardades!");
 
                        } else {
 
                            System.out.println("Dades incorrectes.");
 
                        }
 
                        break;
                    }
 
                    case 2: {
 
                        if (dadesIntroduides) {
 
                            double alcadaMetres = alcada / 100;
                            imc = pes / (alcadaMetres * alcadaMetres);
 
                            System.out.println("\n--- IMC ---");
                            System.out.println("El teu IMC es: " + Math.round(imc * 10) / 10.0);
 
                            if (imc < 18.5) {
                                System.out.println("Categoria: Baix pes");
                            } else if (imc < 25) {
                                System.out.println("Categoria: Pes normal");
                            } else if (imc < 30) {
                                System.out.println("Categoria: Sobrepes");
                            } else {
                                System.out.println("Categoria: Obesitat");
                            }
 
                        } else {
 
                            System.out.println("Primer has d'introduir les dades (opcio 1).");
 
                        }
 
                        break;
                    }
 
                    case 3: {
 
                        if (dadesIntroduides) {
 
                            System.out.println("Nivell d'activitat:");
                            System.out.println("1. Sedentari");
                            System.out.println("2. Lleuger (1-3 dies/setmana)");
                            System.out.println("3. Moderat (3-5 dies/setmana)");
                            System.out.println("4. Intens (6-7 dies/setmana)");
                            System.out.print("Escull: ");
                            int activitat = sc.nextInt();
                            sc.nextLine();
 
                            double factor = 0;
 
                            switch (activitat) {
                                case 1:
                                    factor = 1.2;
                                    break;
                                case 2:
                                    factor = 1.375;
                                    break;
                                case 3:
                                    factor = 1.55;
                                    break;
                                case 4:
                                    factor = 1.725;
                                    break;
                                default:
                                    factor = 0;
                            }
 
                            if (factor > 0) {
 
                                double basal = 10 * pes + 6.25 * alcada - 5 * edat;
 
                                if (sexe.equals("H")) {
                                    basal = basal + 5;
                                } else {
                                    basal = basal - 161;
                                }
 
                                caloriesDiaries = basal * factor;
 
                                System.out.println("\n--- CALORIES ---");
                                System.out.println("Metabolisme basal: " + Math.round(basal) + " kcal");
                                System.out.println("Calories diaries per mantenir el pes: "
                                        + Math.round(caloriesDiaries) + " kcal");
                                System.out.println("Per perdre pes: " + Math.round(caloriesDiaries - 500) + " kcal");
                                System.out.println("Per guanyar massa: " + Math.round(caloriesDiaries + 300) + " kcal");
 
                            } else {
 
                                System.out.println("Nivell incorrecte.");
 
                            }
 
                        } else {
 
                            System.out.println("Primer has d'introduir les dades (opcio 1).");
 
                        }
 
                        break;
                    }
 
                    case 4: {
 
                        System.out.println("Objectiu de la rutina:");
                        System.out.println("1. Forca");
                        System.out.println("2. Cardio");
                        System.out.println("3. Mixta");
                        System.out.print("Escull: ");
                        int objectiu = sc.nextInt();
 
                        System.out.print("Quants exercicis vols (1-10)? ");
                        int quantitat = sc.nextInt();
                        sc.nextLine();
 
                        if (objectiu >= 1 && objectiu <= 3 && quantitat >= 1 && quantitat <= 10) {
 
                            System.out.println("\n--- LA TEVA RUTINA ---");
 
                            for (int i = 1; i <= quantitat; i++) {
 
                                int tipus = objectiu;
 
                                if (objectiu == 3) {
                                    tipus = random.nextInt(2) + 1;
                                }
 
                                String exercici = "";
 
                                if (tipus == 1) {
 
                                    switch (random.nextInt(5)) {
                                        case 0:
                                            exercici = "Press de banca";
                                            break;
                                        case 1:
                                            exercici = "Esquats";
                                            break;
                                        case 2:
                                            exercici = "Pes mort";
                                            break;
                                        case 3:
                                            exercici = "Dominades";
                                            break;
                                        default:
                                            exercici = "Press militar";
                                    }
 
                                    int series = random.nextInt(3) + 3;
                                    int repeticions = random.nextInt(8) + 8;
 
                                    System.out.println(i + ". " + exercici + ": "
                                            + series + " series x " + repeticions + " repeticions");
 
                                } else {
 
                                    switch (random.nextInt(4)) {
                                        case 0:
                                            exercici = "Cursa";
                                            break;
                                        case 1:
                                            exercici = "Bicicleta";
                                            break;
                                        case 2:
                                            exercici = "Corda de saltar";
                                            break;
                                        default:
                                            exercici = "Eliptica";
                                    }
 
                                    int minuts = random.nextInt(21) + 10;
 
                                    System.out.println(i + ". " + exercici + ": " + minuts + " minuts");
 
                                }
 
                            }
 
                        } else {
 
                            System.out.println("Dades incorrectes.");
 
                        }
 
                        break;
                    }
 
                    case 5: {
 
                        System.out.print("Quants minuts has entrenat (1-180)? ");
                        int minutsEntrenament = sc.nextInt();
                        sc.nextLine();
 
                        if (minutsEntrenament >= 1 && minutsEntrenament <= 180) {
 
                            int caloriesPerMinut = random.nextInt(6) + 5;
                            int cremades = minutsEntrenament * caloriesPerMinut;
 
                            caloriesCremades = caloriesCremades + cremades;
                            entrenaments++;
 
                            System.out.println("\n--- ENTRENAMENT SIMULAT ---");
                            System.out.println("Intensitat: " + caloriesPerMinut + " kcal/minut");
                            System.out.println("Calories cremades: " + cremades + " kcal");
 
                        } else {
 
                            System.out.println("Minuts incorrectes.");
 
                        }
 
                        break;
                    }
 
                    case 6: {
 
                        System.out.println("\n--- RESUM ---");
 
                        if (dadesIntroduides) {
                            System.out.println("Pes: " + pes + " kg");
                            System.out.println("Alcada: " + alcada + " cm");
                            System.out.println("Edat: " + edat + " anys");
                        } else {
                            System.out.println("Dades personals: no introduides");
                        }
 
                        System.out.println("Entrenaments fets: " + entrenaments);
                        System.out.println("Calories cremades totals: " + Math.round(caloriesCremades) + " kcal");
 
                        if (caloriesDiaries > 0) {
                            System.out.println("Calories diaries recomanades: "
                                    + Math.round(caloriesDiaries) + " kcal");
                        }
 
                        break;
                    }
 
                    case 7:
 
                        System.out.println("Fins aviat, a entrenar!");
 
                        break;
 
                    default:
 
                        System.out.println("Opcio incorrecta.");
 
                }
 
            } catch (Exception e) {
 
                System.out.println("Error! Introdueix una dada valida.");
                sc.nextLine();
 
            }
 
        } while (opcio != 7);
 
        sc.close();
 
    }
}
   
    

