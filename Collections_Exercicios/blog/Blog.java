import java.util.*;

public class Blog {

    private List<Post> listaDePostagens;

    public Blog() {
        this.listaDePostagens = new ArrayList<>();
    }

    public void adicionarPostagem(Post postagem) {
        listaDePostagens.add(postagem);
    }

    public Set<String> obterTodosAutores() {
        Set<String> listaDeAutores = new TreeSet<>();

        for (Post postagem : listaDePostagens) {
            listaDeAutores.add(postagem.getAutor());
        }

        return listaDeAutores;
    }

    public Map<String, Integer> obterContagemPorCategoria() {
        Map<String, Integer> contagemCategoria = new TreeMap<>();

        for (Post postagem : listaDePostagens) {
            if (contagemCategoria.containsKey(postagem.getCategoria())) {
                contagemCategoria.merge(postagem.getCategoria(), 1, Integer::sum);
            } else {
                contagemCategoria.put(postagem.getCategoria(), 1);
            }
        }

        return contagemCategoria;
    }
}
