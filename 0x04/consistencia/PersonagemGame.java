public class PersonagemGame {

    private String nome;
    private int saudeAtual;
    private String status;

    public PersonagemGame(int saudeAtual, String nome) {
        this.nome = nome;
        setSaudeAtual(saudeAtual);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            this.nome = getNome();
        } else {
            this.nome = nome;
        }
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
        if (this.saudeAtual > 0) {
            this.status = "vivo";
        } else if (this.saudeAtual == 0) {
            this.status = "morto";
        }
    }

    public String getStatus() {
        return status;
    }

    public void tomarDano(int quantidadeDeDano) {
        setSaudeAtual(getSaudeAtual() - quantidadeDeDano);
        if (getSaudeAtual() < 0)
            setSaudeAtual(0);
    }

    public void receberCura(int quantidadeDeCura) {
        setSaudeAtual(getSaudeAtual() + quantidadeDeCura);
        if (getSaudeAtual() > 100)
            setSaudeAtual(100);
    }
}
