import java.util.ArrayList;

public class Cliente {
    String nome;
    ArrayList<Double> transacoes;

    public Cliente(String nome, Double transacao) {
        this.nome = nome;
        this.transacoes = new ArrayList<Double>();
        this.transacoes.add(transacao);
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Double> getTransacoes() {
        return transacoes;
    }

    public void adicionarTransacao(Double transacao){
        transacoes.add(transacao);
    }
}
