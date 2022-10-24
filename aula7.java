import java.util.Locale;
import java.util.Scanner;

public class aula7 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        triangle x, y;
        x = new triangle();
        y = new triangle();

        System.out.println("os 3 lados do primeiro triangulo: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("os 3 lados do segundo triangulo: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();

        double areaY = y.area();

        System.out.printf("area triangulo X: %.4f%n", areaX);
        System.out.printf("area triangulo Y: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("maior area e do X");
        } else {
            System.out.println("maior area e do Y");
        }

        sc.close();
    }
}
