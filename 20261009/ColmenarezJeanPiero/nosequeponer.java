import java.util.Scanner;

class Main {
    public static void main(String[] args) { 
        int estrellas;
        Scanner teclado = new Scanner (System.in);
        int costo_libro, creditos_actuales;
        String estado_libro;
        String modalidad, enlace, lugar;
        double preu_original, preu_final = 0.0;
        String estado;
        double preu_llibre;
        String horari_alumne, modalidad_horari;
        //Ejercicio 2
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

//Ejercicio 5
      System.out.println("El precio original en creditos: ");
preu_original = teclado.nextDouble();


 teclado.nextLine();
System.out.println("El estado del producto (Nou, Bo, Acceptable ? ");
estado = teclado.nextLine();

if (estado.equalsIgnoreCase("Nou")) {
    preu_final = preu_original;
} else if (estado.equalsIgnoreCase("Bo")) {
    preu_final = preu_original * 0.80; // 
} else if (estado.equalsIgnoreCase("Acceptable")) {
    preu_final = preu_original * 0.50; // 
} else {
    System.out.println("Estat no vàlid.");
}

if (estado.equalsIgnoreCase("Nou") || estado.equalsIgnoreCase("Bo") || estado.equalsIgnoreCase("Acceptable")) {
    System.out.println("El preu final calculat és: " + preu_final + " crèdits.");
}  

        
        
        //ejercicio 6
    System.out.println("Ahora valora el usuario del 1 al 5: ");
    estrellas = teclado.nextInt();
        
    if (estrellas ==5) {
    System.out.println("Usuari excel·lent i de total confiança."); 
} else if (estrellas ==4) {
    System.out.println("Molt bon usuari."); 
} else if (estrellas ==3) {
    System.out.println("Usuari correcte."); 
} else if (estrellas ==1 || estrellas == 2) {
    System.out.println("Atenció: Usuari amb valoracions baixes."); 
} else {
    System.out.println("Error: Nota no vàlida."); 
}
 //    System.out.println("Ahora valora el usuario del 1 al 5: ");
//estrellas = teclado.nextInt();

//switch (estrellas) {
    //case 5:
        //System.out.println("Usuari excel·lent i de total confiança.");
      //  break;
    //case 4:
        //System.out.println("Molt bon usuari."); 
      //  break;
    //case 3:
       // System.out.println("Usuari correcte."); 
      //  break;
    //case 1:
    //case 2:
  //      System.out.println("Atenció: Usuari amb valoracions baixes."); 
    //    break;
  //  default:
//        System.out.println("Error: Nota no quàlida."); 
  //      break;
//}   

//ejercicio 7
        
System.out.println("Precio del libro en creditos");
preu_llibre = teclado.nextDouble();

// un salto de linea
teclado.nextLine(); 

        //El f (preu_llibre < 0) { es para que no ponga numero entero o negativo
        
if (preu_llibre < 0) {
    System.out.println("Error preu no vàlid");
if (preu_llibre < 15.0) {
    System.out.println("Preu excel·lent! És una ganga.");
} else if (preu_llibre >= 15.0 && preu_llibre <= 35.0) {
    System.out.println("Preu estàndard i correcte per a un llibre.");
} else {
    System.out.println("El llibre té un preu adequat.");
}
        
        
//ejercicio 8
                //Error: el teclado.nextLine da problemas  al poner despues del teclado.nextInt, hay que ponerlo primero el de texto y despues de los numeros entero o poner otro teclado.nextInt vacio
       // System.out.println("Cuanto vale el libro? ");
        //costo_libro = teclado.nextInt();
       //System.out.println("Cuanto creditos actuales tienes? ");
        //creditos_actuales = teclado.nextInt();
        //teclado.nextLine();
       //System.out.println(" Y en que estado esta Reservado o Disponible? ");
        //estado_libro = teclado.nextLine();

        

        //Opcion 1
      //  if (estado_libro.equalsIgnoreCase ("Reservado") || (creditos_actuales < costo_libro)) {
//            System.out.println("Ho sentim, el producte ja està reservat o Saldo insuficient al moneder. ");
 //       }
 //     else if (estado_libro.equalsIgnoreCase("Disponible") || creditos_actuales >= costo_libro) {
  //  System.out.println("Compra realitzada amb èxit! El producte és teu.");}
          
        // opcion 2
//if (estado_libro.equalsIgnoreCase("Reservado")) {
  //  System.out.println("Ho sentim, el producte ja està reservat.");
//} 
//else if (creditos_actuales < costo_libro) {
  //  System.out.println("Saldo insuficient al moneder.");
//} 
//else if (estado_libro.equalsIgnoreCase("Disponible") && creditos_actuales >= costo_libro) {
   // System.out.println("Compra realitzada amb èxit! El producte és teu.");
//}
    //Ejercicio 9
        System.out.println("Que prefieres para encajar en el horario, Mati o tarda");
    horari_alumne = teclado.nextLine();
    System.out.println("que modalidad prefieres, Online o Presencial?");
        modalidad_horari = teclado.nextLine();
    if ((horari_alumne.equalsIgnoreCase("Mati") && modalidad_horari.equalsIgnoreCase ("Online")) || (horari_alumne.equalsIgnoreCase("Tarda") && modalidad_horari.equalsIgnoreCase("Presencial")))
    {
        System.out.println("Reserva confirmada amb l'expert.");
    }
    else {
    System.out.println("L'expert no està disponible en aquesta franja per a aquesta modalitat.");        
    }
}   
    //ejercicio 10
        
}
        
}
