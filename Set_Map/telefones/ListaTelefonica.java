import java.util.ArrayList;
import java.util.HashMap;

public class ListaTelefonica {

    private HashMap<String, ArrayList<Telefone>> lista;

    public ListaTelefonica() {
        this.lista = new HashMap<String, ArrayList<Telefone>>();
    }

    public void adicionarTelefone(String nome, Telefone telefone) {
        ArrayList<Telefone> listaDeTelefones = new ArrayList<Telefone>();
        if (lista.containsKey(nome)) {
            listaDeTelefones = lista.get(nome);
        }
        listaDeTelefones.add(telefone);
        lista.put(nome, listaDeTelefones);
    }

    public ArrayList<Telefone> buscar(String nome) {
        return lista.get(nome);
    }
}
