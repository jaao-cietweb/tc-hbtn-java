import java.util.ArrayList;
import java.util.List;

public class ConsultaProdutos {

    static List<Produto> filtrar(List<Produto> produtos, CriterioFiltro objeto){
        List<Produto> produtos1 = new ArrayList<>();

        for (Produto produto: produtos) {
            if (objeto.testar(produto)){
                produtos1.add(produto);
            }
        }
        return produtos1;
    }
}
