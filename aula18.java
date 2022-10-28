import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class aula18 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        // adiconar elementos
        list.add("maria");
        list.add("junior");
        list.add("mateus");
        list.add("joas");
        list.add("vitor");
        list.add("paulo");

        // adiconar no índice desejado
        list.add(2, "marcos");

        // mostra tomanho da lista
        System.out.println(list.size());

        // remove da lista
        list.remove("joas");

        // remove atraves de um predicado
        list.removeIf(x -> x.charAt(0) == 'm');

        for (String x : list) {
            System.out.println(x);
        }

        // mostra em que indice está
        System.out.println("index of paulo: " + list.indexOf("paulo"));
        // quando não existir retorna -1
        System.out.println("index of julio: " + list.indexOf("julio"));

        // filtrar a lista e criar uma nova com valores desejados
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'v').collect(Collectors.toList());

        System.out.println(result);

        String name = list.stream().filter(x -> x.charAt(0) == 'v').findFirst().orElse(null);
        System.out.println(name);

        /*
         * FOR EACH
         * String[] vect = new String[] { "maria", "joao", "vitor" };
         * 
         * for (int i = 0; i < vect.length; i++) {
         * System.out.println(vect[i]);
         * }
         * 
         * for (String obj : vect) {
         * System.out.println(obj);
         * }
         */

    }
}
