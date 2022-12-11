import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class aula26 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<shape> list = new ArrayList<>();

        System.out.print("enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("shapes #" + i + " data:");
            System.out.print("rectangle or circle (r/c)?");
            char ch = sc.next().charAt(0);
            System.out.print("color (BLACK/BLUE/RED): ");
            color cor = color.valueOf(sc.next());
            if (ch == 'r') {
                System.out.print("width: ");
                double width = sc.nextDouble();
                System.out.print("height: ");
                double height = sc.nextDouble();
                list.add(new rectangle(cor, width, height));
            } else {
                System.out.print("radius: ");
                double radius = sc.nextDouble();
                list.add(new circle(cor, radius));
            }
        }
        System.out.println();
        System.out.println("shape areas: ");
        for (shape shape : list) {
            System.out.println(String.format("%.2f", shape.area()));
        }

        sc.close();
    }
}
