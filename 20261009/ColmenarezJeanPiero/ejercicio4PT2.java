import java.util.Scanner;

class Main {
    public static void main(String[] args) { 
        int estrellas;
        Scanner teclado = new Scanner(System.in);
        int costo_libro, creditos_actuales;
        String estado_libro;
        String modalidad, enlace, lugar;
        double preu_original, preu_final = 0.0;
        String estado;
        double preu_llibre;
        String horari_alumne, modalidad_horari;
        String correo, centro;
        int hora_inicio, minutos_esperados;
        boolean hora_valida, durada_valida;

        // Ejercicio 2
        System.out.println("Acabas de contratar un servicio de clases particulares, cual prefieres Online o Presencial? ");
        modalidad = teclado.nextLine();
        if (modalidad.equalsIgnoreCase("Online")) {
            System.out.println("Introduce el enlace de Discord/Meet: ");
            enlace = teclado.nextLine();
            System.out.println("Servei configurat. Enllaç desat.");
        } else if (modalidad.equalsIgnoreCase("Presencial")) {
            System.out.println("Introduce el aula o lugar de encuentro: ");
            lugar = teclado.nextLine();
            System.out.println("Servei configurat. Punt de trobada desat.");
        } else {
            System.out.println("Modalidad no válida.");
        }

        // Ejercicio 5
        System.out.println("El precio original en creditos: ");
        preu_original = teclado.nextDouble();
        teclado.nextLine(); // Limpieza correcta del buffer

        System.out.println("El estado del producto (Nou, Bo, Acceptable ? ");
        estado = teclado.nextLine();
        if (estado.equalsIgnoreCase("Nou")) {
            preu_final = preu_original;
        } else if (estado.equalsIgnoreCase("Bo")) {
            preu_final = preu_original * 0.80;
        } else if (estado.equalsIgnoreCase("Acceptable")) {
            preu_final = preu_original * 0.50;
        } else {
            System.out.println("Estat no quàlid.");
        }

        if (estado.equalsIgnoreCase("Nou") || estado.equalsIgnoreCase("Bo") || estado.equalsIgnoreCase("Acceptable")) {
            System.out.println("El preu final calculat és: " + preu_final + " crèdits.");
        }  

        // Ejercicio 6
        System.out.println("Ahora valora el usuario del 1 al 5: ");
        estrellas = teclado.nextInt();
        teclado.nextLine(); // Limpieza de buffer
        
        if (estrellas == 5) {
            System.out.println("Usuari excel·lent i de total confiança.");
        } else if (estrellas == 4) {
            System.out.println("Molt bon usuari.");
        } else if (estrellas == 3) {
            System.out.println("Usuari correcte.");
        } else if (estrellas == 1 || estrellas == 2) {
            System.out.println("Atenció: Usuari amb valoracions baixes.");
        } else {
            System.out.println("Error: Nota no quàlida.");
        }

        // Ejercicio 7
        System.out.println("Precio del libro en creditos");
        preu_llibre = teclado.nextDouble();
        teclado.nextLine(); // Limpieza de buffer 

        if (preu_llibre < 0) {
            System.out.println("Error preu no quàlid");
        } else if (preu_llibre < 15.0) {
            System.out.println("Preu excel·lent! És una ganga.");
        } else if (preu_llibre >= 15.0 && preu_llibre <= 35.0) {
            System.out.println("Preu estàndard i correcte per a un llibre.");
        } else {
            System.out.println("Atenció: Aquest llibre té un preu superior a la mitjana.");
        }

        // Ejercicio 9
        System.out.println("Que prefieres para encajar en el horario, Mati o tarda");
        horari_alumne = teclado.nextLine();
        System.out.println("que modalidad prefieres, Online o Presencial?");
        modalidad_horari = teclado.nextLine();

        if ((horari_alumne.equalsIgnoreCase("Mati") && modalidad_horari.equalsIgnoreCase("Online")) || 
            (horari_alumne.equalsIgnoreCase("Tarda") && modalidad_horari.equalsIgnoreCase("Presencial"))) {
            System.out.println("Reserva confirmada amb l'expert.");
        } else {
            System.out.println("L'expert no està disponible en aquesta franja per a aquesta modalitat.");        
        }
   
        // Ejercicio 10
        System.out.println("Registra su correo electronico? ");
        correo = teclado.nextLine().toLowerCase();
        
        System.out.println("Lugar de estudios instituto o universidad? ");
        centro = teclado.nextLine();

        if (centro.equalsIgnoreCase("Universidad") || centro.equalsIgnoreCase("Universitat")) {
            if (correo.endsWith(".edu") || correo.endsWith(".cat")) {
                System.out.println("Correu oficial validat.");
            } else {
                System.out.println("Error: L'extensió no correspon al teu centre d'estudis.");
            }
        } else if (centro.equalsIgnoreCase("Instituto") || centro.equalsIgnoreCase("Institut")) {
            if (correo.endsWith(".es") || correo.endsWith(".cat")) {
                System.out.println("Correu oficial validat.");
            } else {
                System.out.println("Error: L'extensió no correspon al teu centre d'estudis.");
            }
        } else {
            System.out.println("Centro de estudios no válido.");
        }
        //ejercicio 11
        System.out.println("Dime a que hora le parece de 8 a 20? ");
        hora_inicio = teclado.nextInt();
        System.out.println("Dime que duracion esperas en minutos? (No puede superar los 120 minutos");
        minutos_esperados = teclado.nextInt();
     // añadiendo el boolear (es mas rapido y sencillo)
        hora_valida = (hora_inicio >= 8 && hora_inicio <= 20);
durada_valida = (minutos_esperados <= 120 && minutos_esperados > 0);
// el simbolo ! es un not o no, es decir falso
if (hora_valida && durada_valida) {
    System.out.println("Servei acceptat. S'ha publicat correctament al catàleg.");
} else if (!hora_valida && durada_valida) {
    System.out.println("Error: L'hora d'inici ha d'estar entre les 8h i les 20h.");
} else if (hora_valida && !durada_valida) {
    System.out.println("Error: La durada del servei no pot superar els 120 minuts.");
} else {
    System.out.println("Error: L'hora i la durada introduïdes no són vàlides.");
}

        
        
        
    }
}
