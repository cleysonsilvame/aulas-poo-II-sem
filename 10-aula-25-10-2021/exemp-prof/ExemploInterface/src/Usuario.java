public class Usuario extends Pessoa implements Imprimivel, Seguranca{

    private String nomeusuario;
    private String senha;

    public Usuario(){}
    public Usuario(String nome, String s){
        nomeusuario = nome;
        senha = s;

    }
    public String getNomeusuario() {
        return nomeusuario;
    }
    public void setNomeusuario(String nomeusuario) {
        this.nomeusuario = nomeusuario;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNomecompleto(){
        return super.nomecompleto;
    }

    public int getIdade(){
        return super.idade;
    }

    public void setNomecompleto(String nomeC){
        super.nomecompleto = nomeC;
    }
    public void setIdade(int idade){
        super.idade = idade;
    }


    @Override
    public boolean validar(String nome, String s) {
        boolean v = false;
        if(nomeusuario.equals(nome) && senha.equals(s)){
            v = true;
        }
        return v;
    }


    @Override
    public String formatoString() {
        String texto;
        texto = "\n\t\t\t *** Meu usuario minha vida ** \n";
        texto += "Nome completo: "+getNomecompleto()+nlin+
                  "Idade: " +getIdade()+nlin+
                  "Nome usuario: "+getNomeusuario()+
                  "*********************************** "+v;
        return texto;
    }
    @Override
    public void formatoSystemOut() {
        System.out.println(formatoString());
        
    }

  
    
}
