public class Autor implements Comparable<Autor> {
    String nome;
    String sobrenome;

    public Autor(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString(){
        return nome + " " + sobrenome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Autor autor = (Autor) o;

        if (!nome.equals(autor.nome)) return false;
        return sobrenome.equals(autor.sobrenome);    }

    @Override
    public int hashCode() {
        int result = nome.hashCode();
        result = 31 * result + sobrenome.hashCode();
        return result;    }

    @Override
    public int compareTo(Autor autor) {
        if (this.nome.compareTo(autor.nome) == 0) {
            return this.sobrenome.compareTo(autor.sobrenome);
        } else {
            return this.nome.compareTo(autor.nome);
        }
    }
}
