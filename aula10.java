import java.util.Locale;
import java.util.Scanner;

public class aula10 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // atributos e métodos vazios
        /*
         * System.out.println(prod2.name);
         * System.out.println(prod2.price);
         * System.out.println(prod2.quantity);
         */

        System.out.println("enter product data: ");
        System.out.print("name: ");
        String name = sc.nextLine();
        System.out.print("price: ");
        double price = sc.nextDouble();
        System.out.print("quantity in stock: ");
        int quantity = sc.nextInt();

        products2 prod2 = new products2(name, price, quantity);

        System.out.println();
        System.out.println("product data: " + prod2.toString());

        System.out.println();
        System.out.print("enter the number of products to be added in stock: ");
        int quantity1 = sc.nextInt();
        prod2.addProducts(quantity1);

        System.out.println();
        System.out.println("updated data: " + prod2.toString());

        System.out.println();
        System.out.print("enter the number of products to be removed from stock: ");
        quantity1 = sc.nextInt();
        prod2.removeProducts(quantity1);

        System.out.println();
        System.out.println("updated data: " + prod2.toString());

        sc.close();
    }
}
