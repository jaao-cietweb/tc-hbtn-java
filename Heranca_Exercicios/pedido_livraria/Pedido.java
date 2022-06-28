public class Pedido {

    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    double calcularTotal(){
        double somatorio = 0;
        double desconto = 0;
        for (ItemPedido item :itens) {
            somatorio += (item.getProduto().obterPrecoLiquido() * item.getQuantidade());
        }
        if (percentualDesconto != 0) {
             desconto = somatorio * (percentualDesconto / 100);
        }
        return somatorio - desconto;
    }
}
