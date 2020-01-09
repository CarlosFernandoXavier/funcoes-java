package flatmap.exemplos;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo3 {
    public static void main(String[] args) {
        List<Integer> numerosImpares = Arrays.asList(1, 3, 5);
        List<Integer> numerosPares = Arrays.asList(2, 4, 42, 98, 70);
        List<List<Integer>> listaNumeros = Arrays.asList(numerosImpares, numerosPares);

        List<Integer> listaNova = listaNumeros.stream().flatMap(lista -> lista.stream()).collect(Collectors.toList());

        System.out.println(listaNova);


        System.out.println(listaNumeros);

    }
}
