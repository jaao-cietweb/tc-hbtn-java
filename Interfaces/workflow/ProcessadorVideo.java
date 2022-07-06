import java.util.ArrayList;
import java.util.List;

public class ProcessadorVideo {
    List<CanalNotificacao> canais = new ArrayList<>();

    public void registrarCanal(CanalNotificacao canalNotificacao){
        canais.add(canalNotificacao);
    }

    public void processar(Video video){
        for (CanalNotificacao canal: getCanais()) {
            Mensagem mensagem = new Mensagem(video.getArquivo()
                    + " - " + video.getFormato(), TipoMensagem.LOG);
            canal.notificar(mensagem);
        }
    }

    public List<CanalNotificacao> getCanais() {
        return canais;
    }
}
