import java.util.Locale;
import java.util.Scanner;

public class aula16 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("dados da" + (i + 1) + "a pessoa: ");
            System.out.print("nome: ");
            nomes[i] = sc.next();
            System.out.print("idade: ");
            idades[i] = sc.nextInt();
            System.out.print("altura: ");
            alturas[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma = soma + alturas[i];
        }
        double mediaAlturas = soma / n;

        System.out.println();
        System.out.print("altura media: " + mediaAlturas);

        int cont = 0;
        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                cont += 1;
            }
        }

        double percent = cont * 100.0 / n;

        System.out.printf("porcentagem de pessoas menor de 16 anos: %.1f%%%n", percent);
        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }
}
