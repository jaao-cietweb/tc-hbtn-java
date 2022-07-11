import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ConsultaProdutos {

    static List<Produto> filtrar(List<Produto> produtos, Predicate<Produto> objeto){
        List<Produto> produtos1 = new ArrayList<>();

        for (Produto produto: produtos) {
            if (objeto.test(produto)){
                produtos1.add(produto);
            }
        }
        return produtos1;
    }
}
