import java.util.Random;
public class JocCartes {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatori = random.nextInt(13);
        int palAleatori = random.nextInt(4);
        String nomCarta = "";
        String nomPal = "";
      
      if (numeroAleatori == 1) {
            nomCarta = "As";
        } else if (numeroAleatori == 10) {
            nomCarta = "Sota";
        } else if (numeroAleatori == 11) {
            nomCarta = "Cavall";
        } else if (numeroAleatori == 12) {
            nomCarta = "Rei";
        } else {
            nomCarta = String.VakueOf(numeroAleatori);
        }
      
        if (palAleatori == 0) {
            nomPal = "Ors";
        } else if (palAleatori == 1) {
            nomPal = "Copes";
        } else if (palAleatori == 2) {
            nomPal = "Espases";
        } else if (palAleatori == 3) {
            nomPal = "Bastos";
        }

      System.out.println("T'ha sortit el: " + nomCarta + " de " + nomPal);
    }
}

      
