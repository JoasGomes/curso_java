import java.util.Locale;
import java.util.Scanner;

public class aula2 {
    public static void main(String[] args) {
        // setando localidade para funcionar com pontos(double)
        Locale.setDefault(Locale.US);
        // criando nova instância do scanner
        Scanner sc = new Scanner(System.in);
        // declarando variável para serem preenchidas
        String x;
        int y;
        double z;
        char w;
        String s1, s2, s3;
        // preenchendo as variável com os dados obtidos do scanner
        z = sc.nextDouble();
        y = sc.nextInt();
        x = sc.next();
        // esse servirá para consumir a quebra de linha pendente
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        // charAt pegará o caractere do índice desejado
        w = sc.next().charAt(0);
        // printando na tela os valores
        System.out.println("voce digitou: " + z);
        System.out.println("voce digitou: " + y);
        System.out.println("voce digitou: " + x);
        System.out.println("voce digitou: " + w);
        System.out.println("");
        System.out.println("DADOS");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        // fechando a instância do scanner
        sc.close();

        // funções matemáticas
        double a, b, c;
        // sqrt -> retorna a raiz quadrada de um número
        a = Math.sqrt(3.0);
        // pow -> retorna a potenciação de um com o outro
        b = Math.pow(3.0, 4.0);
        // abs -> retorna o valor absoluto do número(módulo)
        c = Math.abs(-5.0);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
