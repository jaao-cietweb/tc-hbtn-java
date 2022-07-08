import java.util.HashMap;

public class Armazem <T> implements Armazenavel <T> {
    HashMap<String, T> inventario = new HashMap<>();

    @Override
    public void adicionarAoInventario(String nome, T valor) {
        inventario.put(nome,valor);
    }

    @Override
    public T obterDoInventario(String nome) {
        return inventario.get(nome);
    }
}
