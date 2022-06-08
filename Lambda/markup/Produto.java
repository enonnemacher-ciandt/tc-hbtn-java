import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {

    private String nome;
    private double preco;
    private double percentualMarkup;

    public Produto(double preco, String nome) {
        this.nome = nome;
        this.preco = preco;
        this.percentualMarkup = 10;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    Supplier<Double> precoComMarkup = () -> this.preco + (this.preco * this.percentualMarkup) / 100;

    Consumer<Double> atualizarMarkup = markup -> this.percentualMarkup = markup;
}
