import java.util.HashMap;
import java.util.Map;

public abstract class Armazem<T> implements Armazenavel<T> {

    private Map<String, T> listaDeItens;

    public Armazem() {
        this.listaDeItens = new HashMap<>();
    }

    @Override
    public void adicionarAoInventario(String nome, T item) {
        this.listaDeItens.put(nome, item);
    }

    @Override
    public T obterDoInventario(String nome) {
        return this.listaDeItens.get(nome);
    }
}
