public class Pedido {

    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    double calcularTotal(){
        double somatorio = 0;
        for (ItemPedido item :itens) {
            somatorio += item.getQuantidade() * item.getProduto().obterPrecoLiquido();
        }
        return somatorio;
    }
}
