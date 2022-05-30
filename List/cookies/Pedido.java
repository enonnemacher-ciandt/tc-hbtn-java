import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private ArrayList<PedidoCookie> cookies;

    public Pedido() {
        this.cookies = new ArrayList<>();
    }

    public void adicionarPedidoCookie(PedidoCookie pedidoCookie) {
        cookies.add(pedidoCookie);
    }

    public int obterTotalCaixas() {
        int quantidade = 0;
        for (PedidoCookie pedido : cookies) {
            quantidade += pedido.getQuantidadeCaixas();
        }
        return quantidade;
    }

    public int removerSabor(String sabor) {
        int quantidade = 0;
        for (PedidoCookie pedido : cookies) {
            if (pedido.getSabor().equalsIgnoreCase(sabor)) {
                quantidade += pedido.getQuantidadeCaixas();
            }
        }

        cookies.removeIf(pedidoCookie -> pedidoCookie.getSabor().equalsIgnoreCase(sabor));

        return quantidade;
    }
}
