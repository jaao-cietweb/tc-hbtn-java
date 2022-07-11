public class Produto {
    String nome;
    double preco;
    double peso;
    int quantidadeEmEstoque;
    TiposProduto tipo;

    public Produto(String nome, double preco, double peso, int quantidadeEmEstoque, TiposProduto tipo) {
        this.nome = nome;
        this.preco = preco;
        this.peso = peso;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return getNome() + " " + String.format("%.6f", getPreco()) + " " +
                String.format("%.6f", getPeso()) + " " + getQuantidadeEmEstoque() +
                " " + getTipo();
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getPeso() {
        return peso;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public TiposProduto getTipo() {
        return tipo;
    }
}
