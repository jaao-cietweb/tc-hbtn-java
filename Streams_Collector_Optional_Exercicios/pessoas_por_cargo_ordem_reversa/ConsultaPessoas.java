import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ConsultaPessoas {

    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa (List<Pessoa> listaPessoas){
        TreeMap<String , TreeSet<Pessoa>> treeMap = listaPessoas.stream().collect(Collectors.groupingBy(lp ->
                lp.getCargo().));
    }
}
