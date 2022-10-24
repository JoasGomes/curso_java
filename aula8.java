import java.util.Locale;
import java.util.Scanner;

public class aula8 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        products product = new products();
        System.out.println("enter product data: ");
        System.out.print("name: ");
        product.name = sc.nextLine();
        System.out.print("price: ");
        product.price = sc.nextDouble();
        System.out.print("quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("product data: " + product.toString());

        System.out.println();
        System.out.print("enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("updated data: " + product.toString());

        System.out.println();
        System.out.print("enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("updated data: " + product.toString());

        sc.close();
    }
}
