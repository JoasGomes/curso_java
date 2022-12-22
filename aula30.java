import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class aula30 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // melhor solução com tratamento de erros
        try {
            System.out.print("Room number: ");
            int number = sc.nextInt();
            System.out.print("Check-in date(dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date(dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());

            // testando se é posterior ao checkin
            /*
             * if (!checkOut.after(checkIn)) {
             * System.out.println("Error in reservation!!");
             * } else {
             */
            reservation reserve = new reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reserve);

            System.out.println();
            System.out.println("enter data to update the reservation:");
            System.out.print("Check-in date(dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date(dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            // solução ruim -> está no programa principal
            /*
             * Date now = new Date();
             * if (checkIn.before(now) || checkOut.before(now)) {
             * System.out.println("Error in reservation!!");
             * } else if (!checkOut.after(checkIn)) {
             * System.out.println("Error in reservation!!");
             * } else {
             */
            // solução menos pior, mas tbm não é boa
            // String error = reserve.updateDates(checkIn, checkOut);
            reserve.updateDates(checkIn, checkOut);

            /*
             * if (error != null) {
             * System.out.println("algo deu errado..." + error);
             * } else {
             */
            System.out.println("Reservation: " + reserve);
        } catch (ParseException e) {
            System.out.println("Invalid date format");
        } catch (IllegalArgumentException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error!");
        }
        // }
        // }

        // }

        sc.close();
    }
}
