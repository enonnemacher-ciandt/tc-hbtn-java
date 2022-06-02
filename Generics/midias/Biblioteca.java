import java.util.ArrayList;
import java.util.List;

public class Biblioteca<T extends Midia> {

    private List<Midia> lista = new ArrayList<>();

    public void adicionarMidia(Midia valor){
        lista.add(valor);
    }

    public List<Midia> obterListaMidias(){
        return this.lista;
    }
}
