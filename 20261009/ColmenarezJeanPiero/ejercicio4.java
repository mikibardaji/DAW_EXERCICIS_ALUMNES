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
//ejercicio 8
        System.out.println("Cuanto vale el libro? ");
        costo_libro = teclado.nextInt();
       System.out.println("Cuanto creditos actuales tienes? ");
        creditos_actuales = teclado.nextInt();
       System.out.println(" Y en que estado està Reservado o Disponible? ");
        estado_libro = teclado.nextLine();

        
        if (estado_libro.equalsIgnoreCase ("Reservado") && (creditos_actuales < costo_libro)) {
            System.out.println("Ho sentim, el producte ja està reservat o Saldo insuficient al moneder. ");
        }
      else if (estado_libro.equalsIgnoreCase("Disponible") && creditos_actuales >= costo_libro) {
    System.out.println("Compra realitzada amb èxit! El producte és teu.");}
          
        
        
    }
        
}
