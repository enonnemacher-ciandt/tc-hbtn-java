import java.util.ArrayList;

public class ListaTodo {

    private ArrayList<Tarefa> tarefas;

    public ListaTodo() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa novaTarefa) {
        for (Tarefa listaDeTarefas : tarefas) {
            if (novaTarefa.getIdentificador() == listaDeTarefas.getIdentificador()) {
                throw new IllegalArgumentException("Tarefa com identificador " + novaTarefa.getIdentificador() + " ja existente na lista");
            }
        }
        tarefas.add(novaTarefa);
    }

    public boolean marcarTarefaFeita(int identificador) {
        boolean tarefaAlterada = false;
        for (Tarefa listaDeTarefas : tarefas) {
            if (listaDeTarefas.getIdentificador() == identificador) {
                listaDeTarefas.setEstahFeita(true);
                tarefaAlterada = true;
            }
        }
        return tarefaAlterada;
    }

    public boolean desfazerTarefa(int identificador) {
        boolean tarefaAlterada = false;
        for (Tarefa listaDeTarefas : tarefas) {
            if (listaDeTarefas.getIdentificador() == identificador) {
                listaDeTarefas.setEstahFeita(false);
                tarefaAlterada = true;
            }
        }
        return tarefaAlterada;
    }

    public void desfazerTodas() {
        for (Tarefa listaDeTarefas : tarefas) {
            listaDeTarefas.setEstahFeita(false);
        }
    }

    public void fazerTodas() {
        for (Tarefa listaDeTarefas : tarefas) {
            listaDeTarefas.setEstahFeita(true);
        }
    }

    public void listarTarefas() {
        for (Tarefa listaDeTarefas : tarefas) {
            if (listaDeTarefas.isEstahFeita()) {
                System.out.print("[X]");
            } else {
                System.out.print("[ ]");
            }
            System.out.println("  Id: " + listaDeTarefas.getIdentificador() + " - Descricao: " + listaDeTarefas.getDescricao());
        }
    }
}
