public class Pedido {

    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    private double calcularDesconto(double total){
        return total * (percentualDesconto / 100);
    }

    double calcularTotal(){
        double somatorio = 0;
        double desconto = 0;
        for (ItemPedido item :itens) {
            somatorio += (item.getProduto().obterPrecoLiquido() * item.getQuantidade());
        }
        if (percentualDesconto != 0) {
             desconto = calcularDesconto(somatorio);
        }
        return somatorio - desconto;
    }

    void apresentarResumoPedido(){
        double somatorio = 0;
        System.out.println("------- RESUMO PEDIDO -------");
        for (ItemPedido item: itens) {
            String st1 = String.format("%.2f", item.getProduto().obterPrecoLiquido());
            String st2 = String.format("%.2f", (item.getProduto().obterPrecoLiquido() * item.getQuantidade()));
            System.out.println("Tipo: " + item.getProduto().getClass().getSimpleName() + "  Titulo: " +
                    item.getProduto().getTitulo() + "  Preco: " + st1 +
                    "  Quant: " +  item.getQuantidade() + "  Total: " +
                    st2);
            somatorio += item.getProduto().obterPrecoLiquido() * item.getQuantidade();
        }
        String st3 = String.format("%.2f", calcularDesconto(somatorio));
        String st4 = String.format("%.2f", somatorio);
        String st5 = String.format("%.2f", (somatorio - calcularDesconto(somatorio)));
        System.out.println("----------------------------");
        System.out.println("DESCONTO: " + st3);
        System.out.println("TOTAL PRODUTOS: " + st4);
        System.out.println("----------------------------");
        System.out.println("TOTAL PEDIDO: " + st5);
        System.out.println("----------------------------");

    }
}
