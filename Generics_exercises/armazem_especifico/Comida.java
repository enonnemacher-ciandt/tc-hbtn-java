public class Comida {

    private String nome;
    private int calorias;
    private double preco;

    public Comida(String nome, int calorias, double preco) {
        this.nome = nome;
        this.calorias = calorias;
        this.preco = preco;
    }

    @Override
    public String toString() {
        double valorCalorias = this.calorias;
        return String.format("[%s] %.6f R$ %.6f", this.nome, valorCalorias, this.preco);
    }
}
