package flatmap.exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo4 {
    public static void main(String[] args){
        List<Integer> inteiros = Arrays.asList(2, 4, 8);
        List<Integer> dobro =  inteiros.stream().map(numero -> numero * 2).collect(Collectors.toList());
        System.out.println(dobro);
    }
}
