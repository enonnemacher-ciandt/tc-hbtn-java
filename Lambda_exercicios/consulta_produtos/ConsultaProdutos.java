import java.util.ArrayList;
import java.util.List;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> listaProdutos, CriterioFiltro criterioFiltro) {
        List<Produto> listaFilrada = new ArrayList<>();

        listaProdutos.forEach(produto -> {
            if (criterioFiltro.testar(produto)) {
                listaFilrada.add(produto);
            }
        });

        return listaFilrada;
    }
}
