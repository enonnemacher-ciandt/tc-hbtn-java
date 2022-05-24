import java.util.ArrayList;
import java.util.List;

public class ProcessadorVideo {

    List<CanalNotificacao> canais = new ArrayList<>();

    public void registrarCanal(CanalNotificacao notificacao) {
        canais.add(notificacao);
    }

    public void processar(Video video) {
        Mensagem mensagem = new Mensagem();
        for (CanalNotificacao item : canais) {
            mensagem.setTexto(video.getArquivo() + " - " + video.getFormato());
            mensagem.setTipoMensagem(TipoMensagem.LOG);
            item.notificar(mensagem);
        }
    }
}
