import java.util.*;
import java.util.stream.Collectors;

public class NumerosDuplicados {

    public static TreeSet<Integer> buscar(int[] valores) {
        List<Integer> listaDeValores = new ArrayList<Integer>();

        for (int valor : valores) {
            listaDeValores.add(valor);
        }

        HashSet<Integer> integerHashSet = new HashSet<Integer>();
        TreeSet<Integer> listaDuplicados = new TreeSet<Integer>(listaDeValores.stream().filter(x -> !integerHashSet.add(x)).distinct().collect(Collectors.toList()));

        return listaDuplicados;
    }
}
