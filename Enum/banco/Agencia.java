import java.util.ArrayList;

public class Agencia {

    private String nome;
    private ArrayList<Cliente> clientes;

    public Agencia(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<Cliente>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public boolean novoCliente(String nomeCliente, double transacaoInicial) {
        if (buscarCliente(nomeCliente) == null) {
            clientes.add(new Cliente(nomeCliente, transacaoInicial));
            return true;
        }
        return false;
    }

    public boolean adicionarTransacaoCliente(String nomeCliente, double valorTransacao) {
        Cliente cliente = buscarCliente(nomeCliente);
        if (cliente != null) {
            cliente.adicionarTransacao(valorTransacao);
            return true;
        }
        return false;
    }

    public Cliente buscarCliente(String nomeCliente) {
        Cliente cliente = null;
        for (Cliente buscaCliente : clientes) {
            if (buscaCliente.getNome().equals(nomeCliente))
                cliente = buscaCliente;
        }
        return cliente;
    }
}
