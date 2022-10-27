import java.util.Locale;
import java.util.Scanner;

public class aula17 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        rent[] vect = new rent[10];

        System.out.print("how many rooms will be rented? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("rent #" + i + ":");
            System.out.print("name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("email: ");
            String email = sc.next();
            System.out.print("room: ");
            int roomNumber = sc.nextInt();

            rent rent = new rent(name, email);

            vect[roomNumber] = rent;
        }

        System.out.println("busy rooms:");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}
