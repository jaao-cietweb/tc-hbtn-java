import java.util.Locale;

public class Produto {
    int codigo;
    String nome;
    CategoriaProduto categoria;
    double preco;

    @Override
    public String toString() {
        final var locale = new Locale("pt", "BR");
        Locale.setDefault(locale);
        return "[" + codigo +
                "] " + nome +
                " " + categoria +
                " R$ " + String.format("%.2f", preco);
    }

    public Produto(int codigo, String nome, CategoriaProduto categoria, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public CategoriaProduto getCategoria() {
        return categoria;
    }

    public double getPreco() {
        return preco;
    }
}
