import java.util.HashMap;
import java.util.HashSet;

public class ListaTelefonica {
    HashMap <String, HashSet<Telefone>> contatos;

    public ListaTelefonica() {
        contatos = new HashMap<String, HashSet<Telefone>>();
    }

    public void adicionarTelefone (String nome, Telefone telefone){
        HashSet<Telefone> array = contatos.get(nome);

        contatos.forEach((chave, valor) ->{
            if (chave.equals(nome) && valor.contains(telefone)) {
                throw new IllegalArgumentException("Telefone jah existente para essa pessoa");
            } else if (valor.contains(telefone)) {
                throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
            }
        });

        if(array == null){
            array = new HashSet<Telefone>();
        } else if (contatos.containsKey(nome)) {
            array.add(telefone);
            contatos.put(nome, array);
        }
        array.add(telefone);
        contatos.put(nome,array);
    }

    public HashSet<Telefone> buscar (String nome){
        return contatos.get(nome);
    }
}
