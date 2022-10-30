import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class aula20 {
    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;

        LocalDate d01 = LocalDate.now();
        System.out.println(d01);
        LocalDateTime d02 = LocalDateTime.now();
        System.out.println(d02);
        Instant d03 = Instant.now();
        System.out.println(d03);

        LocalDate d04 = LocalDate.parse("2022-07-20");
        System.out.println(d04);
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T02:37:03");
        System.out.println(d05);
        Instant d06 = Instant.parse("2022-07-20T02:37:03Z");
        System.out.println(d06);
        Instant d07 = Instant.parse("2022-07-20T02:37:03-03:00");
        System.out.println(d07);

        LocalDate d08 = LocalDate.parse("29/10/2022", fmt1);
        System.out.println(d08);

        LocalDate d09 = LocalDate.of(2022, 7, 23);
        System.out.println(d09);

        System.out.println("d04 = " + d04.format(fmt1));
        System.out.println("d05 = " + d05.format(fmt2));
        System.out.println("d05 = " + d05.format(fmt4));

        System.out.println("d06 = " + fmt3.format(d06));

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        System.out.println(pastWeekLocalDate);
        LocalDate plusWeekLocalDate = d04.plusDays(7);
        System.out.println(plusWeekLocalDate);
    }
}
