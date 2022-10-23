public class aula5 {
    public static void main(String[] args) {
        // formatar: toLowerCase(), toUpperCase(), trim()
        // recortar: substring(inicio), substring(inicio, fim)
        // substituir: Replace(char, char), Replace(string, string)
        // buscar: IndexOf, LastIndexOf
        // str.Split('')
        String original = "piwdbvpwi WPOIBGPWI OWBVN wpiv   ";
        // td minúsculo
        String s1 = original.toLowerCase();
        System.out.println("-" + s1 + "-");
        // td maiúsculo
        String s2 = original.toUpperCase();
        System.out.println("-" + s2 + "-");
        // sem espaço em branco(inicio e fim)
        String s3 = original.trim();
        System.out.println("-" + s3 + "-");
        // substring do 2 até o final
        String s4 = original.substring(2);
        System.out.println("-" + s4 + "-");
        // substring do 2 até a posição 9
        String s5 = original.substring(2, 9);
        System.out.println("-" + s5 + "-");
        // substituindo a letra 'i' por '$'
        String s6 = original.replace("i", "$");
        System.out.println("-" + s6 + "-");
        // substituindo a letra 'piw' por 'AAA'
        String s7 = original.replace("piw", "AAA");
        System.out.println("-" + s7 + "-");

        // qual índice está "iwd"
        int i = original.indexOf("iwd");
        System.out.println(i);
        // qual índice do último "pi"
        int j = original.lastIndexOf("pi");
        System.out.println(j);

        // fatiando s por espaços em branco e colocando no vetor
        String s = "potato apple lemon orange";
        String[] vect = s.split(" ");
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
        System.out.println(vect[3]);
    }
}
