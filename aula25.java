import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class aula25 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<employee> list = new ArrayList<>();

        System.out.print("enter the number of employees");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("employee #" + 1 + " data:");
            System.out.print("outsourced (y/n)? ");
            char ch = sc.next().charAt(0);
            System.out.print("name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("hours: ");
            int hours = sc.nextInt();
            System.out.print("valuePerHour: ");
            double valuePerHour = sc.nextDouble();

            if (ch == 'y') {
                System.out.print("additional charge: ");
                double additional = sc.nextDouble();
                employee emp = new outsourcedEmployee(name, hours, valuePerHour, additional);
                list.add(emp);
            } else {
                employee emp = new employee(name, hours, valuePerHour);
                list.add(emp);
            }
        }

        System.out.println();
        System.out.println("PAYMENTS: ");
        for (employee emp : list) {
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }
        sc.close();
    }
}
