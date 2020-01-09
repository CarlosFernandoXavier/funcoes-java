package flatmap.exemplos;


import sun.plugin.javascript.navig.Array;

import java.util.Arrays;
import java.util.List;

public class Exemplo1 {
    public static void main(String[] args) {
        List<Integer> inteiros = Arrays.asList(1, 45, 67, 4, 23, 2, 1);
        inteiros.stream().forEach(x -> System.out.println(x));
    }
}
