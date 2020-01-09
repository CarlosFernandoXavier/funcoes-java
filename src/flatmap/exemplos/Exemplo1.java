package flatmap.exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo1 {
    public static void main(String[] args) {

        /*
         * A função flatMap tem como objetivo gerar uma única lista quando:
         * Tenho uma lista que abriga várias listas dentro dela (Exemplo1);
         * Tenho um array que abriga vários arrays e quero uma única lista desses elementos (Exemplo2)
         *
         * */

        List<Integer> numerosPares = Arrays.asList(26, 56, 78, 22);
        List<Integer> numerosImpares = Arrays.asList(5, 7, 103, 17);
        List<List<Integer>> listaCompleta = Arrays.asList(numerosImpares, numerosPares);
        System.out.println(listaCompleta);

        List<Integer> novaLista = listaCompleta.stream().flatMap(lista -> lista.stream()).collect(Collectors.toList());
        System.out.println(novaLista);
    }
}
