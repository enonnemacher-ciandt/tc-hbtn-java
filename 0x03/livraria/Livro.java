import exceptions.*;

public class Livro {

    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) throws AutorInvalidoException, LivroInvalidoException {
        this.titulo = setTitulo(titulo);
        this.autor = setAutor(autor);
        this.preco = setPreco(preco);
    }

    public String getTitulo() {
        return titulo;
    }

    public String setTitulo(String titulo) throws LivroInvalidoException {
        if (titulo.length() < 3)
            throw new LivroInvalidoException("Titulo de livro invalido");
        else
            return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String setAutor(String autor) throws AutorInvalidoException {
        String nome = autor;
        int index = nome.indexOf(" ");

        if (index <0 )
            throw new AutorInvalidoException("Nome de autor invalido");
        else
            return autor;
    }

    public double getPreco() throws LivroInvalidoException {
        return preco;
    }

    public double setPreco(double preco) throws LivroInvalidoException {
        if (preco <= 0)
            throw new LivroInvalidoException("Preco de livro invalido");
        else
            return preco;
    }
}
