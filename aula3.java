import java.util.Scanner;

public class aula3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.println("Qual hora?");
        hora = sc.nextInt();
        int minutos = sc.nextInt();
        int x = sc.nextInt();
        String dia;

        switch (x) {
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terça";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sábado";
                break;
            default:
                dia = "valor inválido";
                break;
        }

        System.out.println("dia da semana é: " + dia);

        double conta = 50.0;
        if (minutos > 100) {
            conta += (minutos - 100) * 2.0;
        }
        System.out.printf("valor da conta = R$ %.2f%n", conta);

        if (hora < 12) {
            System.out.println("Bom dia!");
        } else if (hora < 18) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }

        sc.close();

        // ternária
        int valor = 5;
        String outro_valor = (valor > 10) ? "é menor que 10" : "não é menor";
        System.out.println(valor);
        System.out.println(outro_valor);
    }
}
