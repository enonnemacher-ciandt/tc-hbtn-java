import produtos.*;
public class Pedido {

    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal() {
        double total = 0.0;
        for (ItemPedido itemPedido : itens) {
            total += itemPedido.getProduto().obterPrecoLiquido() * itemPedido.getQuantidade();
        }
        return total - (total * percentualDesconto) / 100;
    }
}
