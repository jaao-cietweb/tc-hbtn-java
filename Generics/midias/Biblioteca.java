import java.util.ArrayList;

public class Biblioteca<T extends Midia> {
    ArrayList<T> lista = new ArrayList<T>();

    public void adicionarMidia (T generico){
        lista.add(generico);
    }

    public ArrayList<T> obterListaMidias(){
        return lista;
    }
}
