import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> produtos, Predicate<Produto> objeto){
        final var locale = new Locale("pt", "BR");
        Locale.setDefault(locale);
        List<Produto> produtos1 = new ArrayList<>();

        for (Produto produto: produtos) {
            if (objeto.test(produto)){
                produtos1.add(produto);
            }
        }
        return produtos1;
    }
}
