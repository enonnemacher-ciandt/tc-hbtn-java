import java.util.ArrayList;

public class Banco {

    private String nome;
    private ArrayList<Agencia> agencias;

    public Banco(String nome) {
        this.nome = nome;
        this.agencias = new ArrayList<Agencia>();
    }

    public Agencia buscarAgencia(String nomeAgencia) {
        Agencia agencia = null;
        for (Agencia listaDeAgencias : agencias) {
            if (nomeAgencia.equals(listaDeAgencias.getNome())) {
                agencia = listaDeAgencias;
            }
        }
        return agencia;
    }

    public boolean adicionarAgencia(String nomeAgencia) {
        Agencia buscaAgencia = buscarAgencia(nomeAgencia);
        if (buscaAgencia == null) {
            agencias.add(new Agencia(nomeAgencia));
            return true;
        }
        return false;
    }

    public boolean adicionarCliente(String nomeAgencia, String nomeCliente, double transacaoInicial) {
        Agencia buscaAgencia = buscarAgencia(nomeAgencia);
        Cliente cliente = buscaAgencia.buscarCliente(nomeCliente);
        if (buscaAgencia != null && cliente == null) {
            buscaAgencia.novoCliente(nomeCliente, transacaoInicial);
            buscaAgencia.adicionarTransacaoCliente(nomeCliente, transacaoInicial);
            return true;
        }
        return false;
    }

    public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeCliente, double valorTransacao) {
        Agencia buscaAgencia = buscarAgencia(nomeAgencia);
        if (buscaAgencia != null) {
            buscaAgencia.adicionarTransacaoCliente(nomeCliente, valorTransacao);
            return true;
        }
        return false;
    }

    public boolean listarClientes(String nomeAgencia, boolean imprimeTransacoes) {
        Agencia agencia = buscarAgencia(nomeAgencia);
        if (agencia != null) {
            if (!imprimeTransacoes) {
                for (int i = 0; i < agencia.getClientes().size(); i++) {
                    Cliente cliente = agencia.getClientes().get(i);
                    System.out.println("Cliente: " + cliente.getNome() + " [" + (i + 1) + "]");
                }
            } else {
                for (int i = 0; i < agencia.getClientes().size(); i++) {
                    Cliente cliente = agencia.getClientes().get(i);
                    System.out.println("Cliente: " + cliente.getNome() + " [" + (i + 1) + "]");
                    for (int j = 0; j < cliente.getTransacoes().size(); j++) {
                        System.out.printf("  [%d] valor %.2f\n", j + 1, cliente.getTransacoes().get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }
}
