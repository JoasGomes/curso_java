import java.util.Scanner;

public class aula6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a, b, c);

        System.out.println("maior e: " + higher);
        showResult(higher);
        /*
         * if (a > b && a > c) {
         * System.out.println("maior e: " + a);
         * } else if (b > c) {
         * System.out.println("maior e: " + b);
         * } else {
         * System.out.println("maior e: " + c);
         * }
         */

        sc.close();
    }

    public static int max(int a, int b, int c) {
        int aux;
        if (a > b && a > c) {
            aux = a;
        } else if (b > c) {
            aux = b;
        } else {
            aux = c;
        }
        return aux;
    }

    public static void showResult(int x) {
        System.out.println("o valor de higher e: " + x);
    }
}
