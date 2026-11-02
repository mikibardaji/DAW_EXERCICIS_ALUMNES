/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exia;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author andca
 */
public class ExIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random aleatori = new Random();

 

        int opcio = 0;

        int punts = 0;

        int rondes = 0;

 

        System.out.println("==================================");

        System.out.println("     REPTE DE CALCUL MENTAL");

        System.out.println("==================================");

 

        while (opcio != 2) {

            System.out.println("MENU");

            System.out.println("1. Jugar");

            System.out.println("2. Sortir");

            System.out.print("Tria una opcio: ");

 

            try {

                opcio = Integer.parseInt(sc.nextLine());

 

                if (opcio == 1) {

                    punts = 0;

                    rondes = 0;

 

                    System.out.println("Comenca el repte! Resol 5 operacions.");

 

                    while (rondes < 5) {

                        int a = aleatori.nextInt(10) + 1;

                        int b = aleatori.nextInt(10) + 1;

                        int tipus = aleatori.nextInt(3);

                        int resultat = 0;

                        String simbol = "";

 

                        if (tipus == 0) {

                            resultat = a + b;

                            simbol = "+";

                        } else if (tipus == 1) {

                            if (a < b) {

                                int temporal = a;

                                a = b;

                                b = temporal;

                            }

                            resultat = a - b;

                            simbol = "-";

                        } else {

                            resultat = a * b;

                            simbol = "*";

                        }

 

                        System.out.print("Pregunta " + (rondes + 1) + ": "

                                + a + " " + simbol + " " + b + " = ");

 

                        try {

                            int resposta = Integer.parseInt(sc.nextLine());

 

                            if (resposta == resultat) {

                                System.out.println("Correcte! +1 punt.");

                                punts++;

                            } else {

                                System.out.println("Incorrecte. La resposta era " + resultat + ".");

                            }

                        } catch (NumberFormatException e) {

                            System.out.println("Entrada no valida. Aquesta pregunta compta com a incorrecta.");

                            System.out.println("La resposta era " + resultat + ".");

                        }

 

                        rondes++;

                    }

 

                    System.out.println("RESULTAT FINAL");

                    System.out.println("Puntuacio: " + punts + " de 5");

 

                    if (punts == 5) {

                        System.out.println("Excel·lent! Has encertat totes les preguntes.");

                    } else if (punts >= 3) {

                        System.out.println("Molt be! Continua practicant.");

                    } else {

                        System.out.println("Segueix practicant i ho faras millor!");

                    }

 

                } else if (opcio == 2) {

                    System.out.println("Gracies per jugar. Fins aviat!");

                } else {

                    System.out.println("Opcio no valida. Tria 1 o 2.");

                }

 

            } catch (NumberFormatException e) {

                System.out.println("Error: has d'introduir un numero de menu.");

            }

        }

 

        sc.close();
    }
    
}
