
import java.text.SimpleDateFormat;

public class aula21 {
    public static void main(String[] args) {

        order ord = new order(100, new SimpleDateFormat("dd/MM/yyyy"), order_status.PENDING_PAYMENT);
        System.out.println(ord);
    }
}
