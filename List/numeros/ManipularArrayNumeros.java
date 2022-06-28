import java.util.List;

public class ManipularArrayNumeros {

    static int buscarPosicaoNumero(List<Integer> lista, int num){
        return lista.indexOf(num);
    }

    static void adicionarNumero(List<Integer> lista, int num) {
        if (buscarPosicaoNumero(lista,num) != -1){
            throw new IllegalArgumentException("Numero jah contido na lista");
        }
        lista.add(num);
    }

    static void removerNumero(List<Integer> lista, int num) {
        int pos = buscarPosicaoNumero(lista,num);
        if (pos == -1){
            throw new IllegalArgumentException("Numero nao encontrado na lista");
        }
        lista.remove(pos);
    }

    static void substituirNumero (List<Integer> lista, int numSubstituir, int numSubistituido) {
        int pos = buscarPosicaoNumero(lista,numSubstituir);
        if (pos == -1){
            throw new IllegalArgumentException("Numero nao encontrado na lista");
        }
        lista.set(pos, numSubistituido);
    }
}
