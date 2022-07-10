import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {
    String nome;
    double preco;
    int percentualMarkup = 10;

    Supplier precoComMarkupSupplier;

    Consumer atualizarMarkup;
}
