import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Consulta {

    public static List<Produto> obterLivrosDoPedido (Pedido pedido) {
        List<Produto> listaProdutos = pedido.getProdutos().stream().filter(c -> c.getCategoria() ==
                CategoriaProduto.LIVRO).collect(toList());
        return listaProdutos;
    }

    public static Produto obterProdutoMaiorPreco (List<Produto> produtos){
        List<Produto> produtos1 = produtos.stream().sorted(Comparator.comparing(Produto ::getPreco).reversed()).collect(Collectors.toList());
        return produtos1.get(0);
    }

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, int precoMinimo){
        List<Produto> produtos1 = produtos.stream().sorted(Comparator.comparing(Produto::getPreco).reversed()).takeWhile(produto -> produto.getPreco() > precoMinimo).collect(toList());
        return produtos1;
    }
}
