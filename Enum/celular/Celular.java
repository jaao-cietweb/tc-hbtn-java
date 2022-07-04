import java.util.ArrayList;

public class Celular {
    private ArrayList<Contato> contatos = new ArrayList<Contato>();

    public int obterPosicaoContato (String contatoProcurado){
        for (Contato contato: contatos) {
            if(contato.getNome().equals(contatoProcurado)){
                return contatos.indexOf(contato);
            }
        }
        return -1;
    }

    public void adicionarContato(Contato novoContato){
        if ((obterPosicaoContato(novoContato.getNome()) == -1)){
            contatos.add(novoContato);
        }
        else {
            throw new IllegalArgumentException("Nao foi possivel adicionar contato. Contato jah existente " +
                    "com esse nome");
        }
    }

    public void atualizarContato(Contato contatoAntigo, Contato novoContato){
        int posContatoAntigo = obterPosicaoContato(contatoAntigo.getNome());
        int posContatonovo = obterPosicaoContato(novoContato.getNome());
        if(posContatoAntigo == -1){
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");
        } else if (posContatonovo != -1 && posContatonovo != posContatoAntigo) {
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente " +
                    "com esse nome");
        }
        contatos.set(posContatoAntigo, novoContato);
    }

    public void removerContato(Contato contato){
        int contatoaRemover = obterPosicaoContato(contato.getNome());
        if (contatoaRemover == -1) {
            throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
        }
        contatos.remove(contatoaRemover);
    }

    public void listarContatos (){
        for (Contato contato: contatos){
            System.out.println(contato.getNome() + " -> " + contato.getNumeroTelefone() + " (" + contato.getTipo() + ")");
        }
    }

}
