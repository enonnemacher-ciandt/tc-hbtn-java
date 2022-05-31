import java.util.ArrayList;

public class Celular {

    private ArrayList<Contato> contatos = new ArrayList<Contato>();

    public int obterPosicaoContato(String nomeContato) {
        Contato contato = null;
        for (Contato buscaContato : contatos) {
            if (nomeContato.equals(buscaContato.getNome())) {
                contato = buscaContato;
            }
        }
        return contatos.indexOf(contato);
    }

    public void adicionarContato(Contato contato) throws Exception {
        if (obterPosicaoContato(contato.getNome()) != -1) {
            throw new Exception("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
        }
        contatos.add(contato);
    }

    public void atualizarContato(Contato contatoAntigo, Contato novoContato) throws Exception {
        if (obterPosicaoContato(contatoAntigo.getNome()) == -1) {
            throw new Exception("Nao foi possivel modificar contato. Contato nao existe");
        } else if (!contatos.get(obterPosicaoContato(novoContato.getNome())).getNome().equals(contatoAntigo.getNome())) {
            throw new Exception("Nao foi possivel modificar contato. Contato jah existente com esse nome");
        }
        contatos.set(obterPosicaoContato(contatoAntigo.getNome()), novoContato);
    }

    public void removerContato(Contato contato) throws Exception {
        if (obterPosicaoContato(contato.getNome()) == -1) {
            throw new Exception("Nao foi possivel remover contato. Contato nao existe");
        }
        contatos.remove(obterPosicaoContato(contato.getNome()));
    }

    public void listarContatos() {
        for (Contato listaDeContatos : contatos) {
            System.out.println(listaDeContatos.getNome() + " -> " + listaDeContatos.getNumeroTelefone() + " (" + listaDeContatos.getTipo() + ")");
        }
    }
}
