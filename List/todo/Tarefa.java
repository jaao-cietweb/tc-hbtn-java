public class Tarefa {
    String descricao;
    boolean estahFeita;
    int identificador;

    public Tarefa(String descricao, int identificador) {
        this.descricao = descricao;
        this.identificador = identificador;
    }

    public void modificarDescricao (String descricao) {
        if (descricao == "") {
            throw new IllegalArgumentException ("Descricao de tarefa invalida");
        }
        this.descricao = descricao;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setEstahFeita(boolean estahFeita) {
        this.estahFeita = estahFeita;
    }
}
