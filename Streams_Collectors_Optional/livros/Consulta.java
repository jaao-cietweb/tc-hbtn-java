import java.util.List;

import static java.util.stream.Collectors.toList;

public class Consulta {

    public static List<Produto> obterLivrosDoPedido (Pedido pedido) {
        List<Produto> listaProdutos = pedido.getProdutos().stream().filter(c -> c.getCategoria() ==
                CategoriaProduto.LIVRO).collect(toList());
        return listaProdutos;
    }
}
