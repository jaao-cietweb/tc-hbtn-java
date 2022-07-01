import java.util.ArrayList;
import java.util.HashMap;

public class ListaTelefonica {
    HashMap <String, ArrayList<Telefone>> contatos;

    public ListaTelefonica() {
        contatos = new HashMap<>();
    }

    public void adicionarTelefone (String nome, Telefone telefone){
        ArrayList<Telefone> array = contatos.get(nome);

        if(array == null){
            array = new ArrayList<Telefone>();
        }
        array.add(telefone);
        contatos.put(nome,array);
    }

    public ArrayList<Telefone> buscar (String nome){
        return contatos.get(nome);
    }
}
