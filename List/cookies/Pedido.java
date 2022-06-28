import java.util.ArrayList;
import java.util.Objects;

public class Pedido {
    ArrayList<PedidoCookie> cookies = new ArrayList<>();

    public Pedido() {
        this.cookies = cookies;
    }

    void adicionarPedidoCookie(PedidoCookie cookie){
        cookies.add(cookie);
    }

    int obterTotalCaixas (){
        int total = 0;
        for (int i = 0; i < cookies.size(); i++) {
            total += cookies.get(i).quantidadeCaixas;
        }
        return total;
    }

    int removerSabor(String sabor){
        int total = 0;
        for (int i = 0; i < cookies.size(); i++) {
            if (Objects.equals(cookies.get(i).getSabor(), sabor)) {
                total += cookies.get(i).getQuantidadeCaixas();
                cookies.remove(i);
            }
        }
        return total;
    }
}
