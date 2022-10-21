import java.util.Locale;

public class aula1 {
    public static void main(String[] args) {
        System.out.println("olá mundo!"); // printa com uma quebra de linha
        System.out.print("oi"); // não tem quebra de linha no final
        System.out.print("bom dia!");

        int numero = 44;
        double x = 10.455678;

        System.out.printf("%.2f%n", x); // para printar formatado
        System.out.println(numero);
        System.out.println(x);

        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", x);

        // concatenação
        System.out.println("RESULTADO = " + x);
        System.out.printf("RESULTADO = %.2f metros%n", x);

        String nome = "maria";
        int idade = 30;
        double renda = 3000;
        System.out.printf("%s tem %d anos e tem %.2f de renda.", nome, idade, renda);
    }
}
