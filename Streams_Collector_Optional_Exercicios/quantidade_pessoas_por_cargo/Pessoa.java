import java.util.Locale;

public class Pessoa implements Comparable<Pessoa> {

    int codigo;
    String nome;
    String cargo;
    int idade;
    double salario;

    public Pessoa(int codigo, String nome, String cargo, int idade, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.salario = salario;
    }

    @Override
    public String toString() {
        final var locale = new Locale("pt", "BR");
        Locale.setDefault(locale);
        return "[" + codigo +
                "] " + nome +
                " " + cargo +
                " " + idade +
                " R$ " + String.format("%.6f" , getSalario());
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        return getNome().compareTo(pessoa.nome);
    }
}
