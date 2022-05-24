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

    public void apresentarResumoPedido() {
        double total = 0.0;
        System.out.println("------- RESUMO PEDIDO -------");
        for (ItemPedido itemPedido : itens) {
            total += itemPedido.getProduto().obterPrecoLiquido() * itemPedido.getQuantidade();
            System.out.printf("Tipo: %s  Titulo: %s Preco: %.2f  Quant: %d Total: %.2f \n",
                    itemPedido.getProduto().getClass().getSimpleName(),
                    itemPedido.getProduto().getTitulo(),
                    itemPedido.getProduto().obterPrecoLiquido(),
                    itemPedido.getQuantidade(),
                    itemPedido.getQuantidade() * itemPedido.getProduto().obterPrecoLiquido());
        }
        System.out.println("----------------------------");
        System.out.printf("DESCONTO: %.2f\n", total * percentualDesconto / 100);
        System.out.printf("TOTAL PRODUTOS: %.2f\n", total);
        System.out.println("----------------------------");
        System.out.printf("TOTAL PEDIDO: %.2f\n", total - (total * percentualDesconto) / 100);
        System.out.println("----------------------------");
    }
}
