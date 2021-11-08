public abstract class Pessoas {
    protected String nome;

    public Pessoas(){}

    public Pessoas(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoas [nome=" + nome + "]";
    }

    

}
