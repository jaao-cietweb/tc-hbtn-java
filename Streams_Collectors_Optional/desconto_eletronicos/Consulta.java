import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Consulta {

    public static List<Produto> obterLivrosDoPedido (Pedido pedido) {
        List<Produto> listaProdutos = pedido.getProdutos().stream().filter
                (c -> c.getCategoria() == CategoriaProduto.LIVRO).collect(toList());
        return listaProdutos;
    }

    public static Produto obterProdutoMaiorPreco (List<Produto> produtos){
        List<Produto> produtos1 = produtos.stream().sorted(Comparator.comparing
                (Produto ::getPreco).reversed()).collect(Collectors.toList());
        return produtos1.get(0);
    }

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, int precoMinimo){
        return produtos.stream().filter(produto -> produto.getPreco() >= precoMinimo).collect(toList());
    }

    public static List<Pedido> obterPedidosComEletronicos (List<Pedido> listaPedidos){
        return listaPedidos.stream().filter(pedido ->  pedido.getProdutos().stream().anyMatch
                (produto -> produto.getCategoria() == CategoriaProduto.ELETRONICO)).collect(toList());
    }

    public static List<Produto> aplicar15PorcentoDescontoEletronicos (List<Produto> listaProdutos){
        return listaProdutos.stream().map(produto -> {
            if(produto.getCategoria().equals(CategoriaProduto.ELETRONICO)){
                produto.setPreco(produto.getPreco() * 0.85);
            }
            return produto;
        }).collect(toList());
    }
}
