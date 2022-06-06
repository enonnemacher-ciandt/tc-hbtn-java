import java.util.*;

public class Blog {

    private List<Post> listaDePostagens;

    public Blog() {
        this.listaDePostagens = new ArrayList<>();
    }

    public void adicionarPostagem(Post postagem) {
        for (Post post : listaDePostagens) {
            if (post.getAutor().equals(postagem.getAutor()) && post.getTitulo().equals(postagem.getTitulo())) {
                throw new IllegalArgumentException("Postagem jah existente");
            }
        }

        listaDePostagens.add(postagem);
    }

    public Set<Autor> obterTodosAutores() {
        Set<Autor> listaDeAutores = new TreeSet<>();

        for (Post postagem : listaDePostagens) {
            listaDeAutores.add(postagem.getAutor());
        }

        return listaDeAutores;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        Map<Categorias, Integer> contagemCategoria = new TreeMap<>();

        for (Post postagem : listaDePostagens) {
            if (contagemCategoria.containsKey(postagem.getCategoria())) {
                contagemCategoria.merge(postagem.getCategoria(), 1, Integer::sum);
            } else {
                contagemCategoria.put(postagem.getCategoria(), 1);
            }
        }

        return contagemCategoria;
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
        Set<Post> postsAutor = new TreeSet<>();

        for (Post post : listaDePostagens) {
            if (post.getAutor().equals(autor)) {
                postsAutor.add(post);
            }
        }

        return postsAutor;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria) {
        Set<Post> postsCategoria = new TreeSet<>();

        for (Post post : listaDePostagens) {
            if (post.getCategoria().equals(categoria)) {
                postsCategoria.add(post);
            }
        }

        return postsCategoria;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        Map<Categorias, Set<Post>> listaPosts = new TreeMap<>();

        for (Categorias categoriasPost : Categorias.values()) {
            listaPosts.put(categoriasPost, obterPostsPorCategoria(categoriasPost));
        }

        return listaPosts;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor, Set<Post>> listaPosts = new TreeMap<>();
        Set<Autor> listaAtores = obterTodosAutores();

        for (Autor autor : listaAtores) {
            listaPosts.put(autor, obterPostsPorAutor(autor));
        }

        return listaPosts;
    }
}
