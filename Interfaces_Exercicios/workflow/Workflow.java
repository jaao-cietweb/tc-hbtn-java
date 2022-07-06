import atividades.Atividade;

import java.util.ArrayList;
import java.util.List;

public class Workflow {
    List<Atividade> atividades = new ArrayList<Atividade>();
    void registrarAtividade(Atividade atividade){
        atividades.add(atividade);
    }
}
