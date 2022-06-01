import java.util.HashMap;
import java.util.HashSet;

public class ListaTelefonica {

    private HashMap<String, HashSet<Telefone>> lista;

    public ListaTelefonica() {
        this.lista = new HashMap<String, HashSet<Telefone>>();
    }

    public HashSet<Telefone> adicionarTelefone(String nome, Telefone telefone) throws Exception {
        HashSet<Telefone> listaDeTelefones = buscar(nome);

        if (listaDeTelefones == null) {
            listaDeTelefones = new HashSet<>();
        } else if (listaDeTelefones.contains(telefone)) {
            throw new Exception("Telefone jah existente para essa pessoa");
        }

        for (HashSet<Telefone> buscaTelefone : lista.values()) {
            if (buscaTelefone.contains(telefone)) {
                throw new Exception("Telefone jah pertence a outra pessoa");
            }
        }

        listaDeTelefones.add(telefone);
        lista.put(nome, listaDeTelefones);

        return listaDeTelefones;
    }

    public HashSet<Telefone> buscar(String nome) {
        return lista.get(nome);
    }
}
