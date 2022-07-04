import java.util.ArrayList;

public class Agencia {
    String nome;
    ArrayList<Cliente> clientes;

    public Agencia(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<Cliente>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public boolean novoCliente (String nomeDoCliente, double valorInicial){
        Cliente cliente = (buscarCliente(nomeDoCliente));
        if (cliente == null){
            this.clientes.add(new Cliente(nomeDoCliente, valorInicial));
            return true;
        }
        return false;
    }

    public boolean adicionarTransacaoCliente(String nomeCliente, Double valorAdicionado){
        Cliente cliente = (buscarCliente(nomeCliente));
        if (!(cliente == null)){
            cliente.adicionarTransacao(valorAdicionado);
            return true;
        }
        return false;
    }

    public Cliente buscarCliente(String nomeCLiente){
        for (Cliente cliente: clientes) {
            if (cliente.getNome().equals(nomeCLiente)){
                return cliente;
            }
        }
        return null;
    }

}
