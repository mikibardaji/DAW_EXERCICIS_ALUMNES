import java.util.Scanner;

public class AlertaPreusLlibres {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double preu;

      System.out.print("Introdueix el preu del llibre de text en crèdits: ");
      preu = scanner.nextDouble();

      if (preu < 0) {
      System.out.println("Error: preu no vàlid.");
       }
      else if (preu < 15.0) {
      System.out.println("Preu excel·lent! És una ganga.");
        } 
       
      else if (preu >= 15.0 && preu <= 35.0) {
      System.out.println("Preu estàndard i correcte per a un llibre.");
        } 
      
       else { // És a dir, preu > 35.0
        System.out.println("Atenció: Aquest llibre té un preu superior a la mitjana.");
        }}}
