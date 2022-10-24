
import java.util.Locale;
import java.util.Scanner;

public class aula9 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("valor do raio: ");
        double radius = sc.nextDouble();

        double c = calculator.circumference(radius);

        double v = calculator.volume(radius);

        System.out.printf("circunferencia: %.2f%n", c);
        System.out.printf("volume: %.2f%n", v);
        System.out.printf("valor PI: %.2f%n", calculator.PI);

        sc.close();
    }

}
