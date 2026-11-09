import java.util.*;

public class Main {
    public static void main(String[] args) {
        double[] dimensiones = Pedir();
        double area = areaRectangulo(ancho, alto);
        double perimetro = perimetroRectangulo(ancho, alto);
        System.out.println(area);
        System.out.println(perimetro);
    }
    public static double perimetroRectangulo(double ancho,double alto){
        return 2 * ancho + 2 * alto;
       
    }
   
    public static double areaRectangulo(double ancho,double alto){
        double area=ancho*alto;
        return area;
    }
    public static double Pedir() {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el ancho");
        double ancho = sc.nextDouble();
        System.out.println("introduce el alto");
        double alto = sc.nextDouble();
        return pedir();
    }
}
