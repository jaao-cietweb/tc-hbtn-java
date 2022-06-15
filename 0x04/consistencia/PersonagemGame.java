public class PersonagemGame {
    private int saudeAtual;
    private String nome;
    private String status;

    public PersonagemGame(int saudeAtual, String nome){
        this.saudeAtual = saudeAtual;
        this.nome = nome;
        if (saudeAtual > 0){
            status = "vivo";
        }
        else {
            status = "morto";
        }
    }
    public void tomarDano (int quantidadeDeDano){
        this.saudeAtual = saudeAtual - quantidadeDeDano;
        if (saudeAtual < 0) {
            saudeAtual = 0;
            status = "morto";
        }
    }

    public void receberCura (int quantidadeDeCura){
        this.saudeAtual  = saudeAtual + quantidadeDeCura;
        if (saudeAtual > 100) {
            saudeAtual = 100;
        }
        if (saudeAtual > 0){
            status = "vivo";
        }
    }

    //gettersAndSetters
    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
        if (this.saudeAtual <= 0){
            status = "morto";
        }
        else {
            status = "vivo";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(!nome.equals("") && nome != null){
            this.nome = nome;
        }
    }

    public String getStatus() {
        return status;
    }
}
