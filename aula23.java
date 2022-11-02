import java.text.ParseException;
import java.text.SimpleDateFormat;

public class aula23 {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        coment c1 = new coment("have a nice trip!");
        coment c2 = new coment("wow thats awesome!");

        post p1 = new post(
                sdf.parse("21/06/2018 12:34:34"),
                "traveling to new zealand",
                "im going to visit this country",
                12);

        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);
    }
}
