import java.util.Locale;
import java.util.Scanner;

public class aula4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();
        // int N = sc.nextInt();

        // while
        /*
         * int soma = 0;
         * while (x != 0) {
         * soma += x;
         * x = sc.nextInt();
         * }
         * System.out.println(soma);
         */

        // do while
        char resp;
        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double c = sc.nextDouble();
            double f = 9.0 * c / 5.0 + 32.0;
            System.out.printf("em fahrenheit: %.1f%n", f);
            System.out.print("Deseja repetir (s/n)? ");
            resp = sc.next().charAt(0);
        } while (resp != 'n');

        // for
        /*
         * int soma = 0;
         * for (int i = 0; i < N; i++) {
         * int x = sc.nextInt();
         * soma = soma + x;
         * }
         * 
         * System.out.println(soma);
         */

        sc.close();
    }
}
