import java.util.Objects;

public class Autor implements Comparable<Autor> {

    private String nome;
    private String sobrenome;

    public Autor(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return this.nome + " " + this.sobrenome;
    }

    @Override
    public int compareTo(Autor outroAutor) {
        return this.toString().compareTo(outroAutor.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return Objects.equals(nome, autor.nome) && Objects.equals(sobrenome, autor.sobrenome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, sobrenome);
    }
}
