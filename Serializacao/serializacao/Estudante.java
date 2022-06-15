import java.io.Serializable;

public class Estudante implements Serializable {

    private int idade;
    private String nome;
    transient private String senha;

    public Estudante(int idade, String nome, String senha) {
        this.idade = idade;
        this.nome = nome;
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Estudante { nome='" + this.nome + "', idade='" + this.idade + "', senha='" + this.senha + "' }";
    }
}
