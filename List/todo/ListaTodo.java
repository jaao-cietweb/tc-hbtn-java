import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListaTodo {
    List<Tarefa> tarefas;

    public ListaTodo() {
        tarefas = new ArrayList<Tarefa>();
    }

    public void adicionarTarefa (Tarefa tarefa){
        for (Tarefa tarefa1: tarefas) {
            if (tarefa.identificador == tarefa1.identificador) {
                throw new IllegalArgumentException("Tarefa com identificador "+ tarefa1.getIdentificador()+ " ja existente na lista");
            }
        }
        if (Objects.equals(tarefa.descricao, "")) {
            throw new IllegalArgumentException ("Descricao de tarefa invalida");
        }
        tarefas.add(tarefa);
    }

    public boolean marcarTarefaFeita(int id){
        for (Tarefa tarefa2: tarefas) {
            if (tarefa2.getIdentificador() == id) {
                tarefa2.setEstahFeita(true);
                return true;
            }
        }
        return false;
    }

    public boolean desfazerTarefa(int id){
        for (Tarefa tarefa2: tarefas) {
            if (tarefa2.identificador == id) {
                tarefa2.setEstahFeita(false);
                return true;
            }
        }
        return false;
    }

    public void desfazerTodas(){
        for (Tarefa tarefa3: tarefas) {
            tarefa3.setEstahFeita(false);
        }
    }

    public void fazerTodas(){
        for (Tarefa tarefa3: tarefas) {
            tarefa3.setEstahFeita(true);
        }
    }

    public void listarTarefas(){
        for (Tarefa tarefa4: tarefas) {
            System.out.print("[");
            if (tarefa4.estahFeita == true) {
                System.out.print("X");
            }
            else {
                System.out.print(" ");
            }
            System.out.println("]  Id: " + tarefa4.getIdentificador() + " - Descricao: " +
                    tarefa4.getDescricao());
        }
    }
}
