public class Paciente {
    String nome, rg, endereco, telefone, datanascimento, profissao;

   
    // metodos construtores 
    public Paciente(){ 
        // contrutor vazio
    }


    public Paciente(String nome) {
        this.nome = nome;
    }

    public Paciente(String nome, String rg){
          this.nome = nome;
          this.rg = rg;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getRg() {
        return rg;
    }


    public void setRg(String rg) {
        this.rg = rg;
    }


    public String getEndereco() {
        return endereco;
    }


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public String getTelefone() {
        return telefone;
    }


    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public String getDatanascimento() {
        return datanascimento;
    }


    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }


    public String getProfissao() {
        return profissao;
    }


    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }


  
    
}
