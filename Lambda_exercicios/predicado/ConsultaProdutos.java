import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> listaProdutos, Predicate<Produto> criterioFiltroPredicado) {
        List<Produto> listaFilrada = new ArrayList<>();

        listaProdutos.forEach(produto -> {
            if (criterioFiltroPredicado.test(produto)) {
                listaFilrada.add(produto);
            }
        });

        return listaFilrada;
    }
}
