package flatmap.exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo2 {
    public static void main (String[] args){


        /*
         * A função flatMap tem como objetivo gerar uma única lista quando:
         * Tenho uma lista que abriga várias listas dentro dela (Exemplo1);
         * Tenho um array que abriga vários arrays e quero uma única lista desses elementos (Exemplo2)
         *
         * */

        String[][] arrayLetras = new String[][]{{"a","b"}, {"c","d","e"}};
        System.out.println(arrayLetras);
        List<String> listaLetras = Arrays.stream(arrayLetras).flatMap(letras -> Arrays.stream(letras)).collect(Collectors.toList());
        System.out.println(listaLetras);
    }
}
