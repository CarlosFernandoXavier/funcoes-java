package flatmap.exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Exemplo2 {
    public static void main(String[] args){
        List<String> nomes = Arrays.asList("Geeks", "GFG",
                "GeeksforGeeks", "gfg");

        nomes.stream().flatMap(nome -> Stream.of(nome.charAt(2))).forEach(System.out::println);
        System.out.println();
        nomes.stream().map(nome -> nome.charAt(2)).forEach(System.out::println);
    }
}
