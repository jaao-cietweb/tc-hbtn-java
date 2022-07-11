import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {
    String nome;
    double preco;
    double percentualMarkup;

    public Supplier<Double> precoComMarkup;

    public Consumer<Double> atualizarMarkup = x -> this.percentualMarkup = x;

    public Produto(double preco, String nome) {
        this.nome = nome;
        this.preco = preco;
        this.percentualMarkup = 10;

        this.precoComMarkup = () -> preco * (1+percentualMarkup/100);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
