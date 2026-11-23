import java.util.Scanner;

public class LlibreriaDaniel {

    public static String PrimeraPregunta() {
        Scanner teclat = new Scanner(System.in);
        System.out.println("Contra quin equip va guanyar el Real Madrid 'La Décima' l'any 2014?");
        System.out.println("A) Juventus");
        System.out.println("B) Atlético de Madrid");
        System.out.println("C) Liverpool");
        System.out.println("D) Bayern de Múnic");
        System.out.print("Escriu la lletra: ");

        String resposta = teclat.nextLine().toUpperCase();

        return resposta;
    }
  public static void respostaPrimera(String resposta){

      switch (resposta) {
            case A
                System.out.println("¡Correcte! Al minut 93 amb aquell famós cop de cap de Sergio Ramos a Lisboa.");
                

            case B
                System.out.println("Incorrecte! A la Juventus li van guanyar 'La Duodécima' a Cardiff el 2017 (i la Setena el 1998).");
                

            case C
                System.out.println("Incorrecte! Al Liverpool li han guanyat dues finals modernes (2018 i 2022), però no va ser la desena.");
                

            case D
                System.out.println("Incorrecte! El Bayern va caure a les semifinals d'aquell mateix any (0-4 a Munic), però no va arribar a la final.");
                

            default:
                System.out.println("Opció no vàlida! Has escrit un equip que no toca o només has posat la lletra de l'opció.");
                
        }
    }
}
