import javax.swing.JOptionPane;

public class Login {
    private String nome;
    private String acesso;
    private String password;
    private String users[][] = {
        {"admin","admin","admin"},
        {"root","root","root"},
        {"user","user","user"}

    };

    public Login(){}
    public Login(String nome, String password){
        this.nome = nome;
        this.password = password;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getAcesso() {
        return acesso;
    }
    public void setAcesso(String acesso) {
        this.acesso = acesso;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String[][] getUsers() {
        return users;
    }
    public void setUsers(String[][] users) {
        this.users = users;
    }

    public boolean autentica(){

        for(int linha = 0; linha< users.length; linha++){
                if(users[linha][0].equals(nome) && users[linha][1].equals(password)){
                    return true;
                }  
        }

        return false;

        
    }

    // metodo principal para executar o conteudo da classe, cada projeto deve
    // ter um unico metodo principaL.
    // nesse de hoje é uma coleção de classes independentes
    public static void main(String[] args) {
        Login usuario;
        String nome, senha;

        nome = JOptionPane.showInputDialog(null, "Digite o nome: ");
        senha = JOptionPane.showInputDialog(null, "Digite a senha: ");
        
        // instanciar o objeto
        usuario = new Login(nome,senha);

          if(usuario.autentica()){
              JOptionPane.showMessageDialog(null," ** Bem vindo ao programa** ");
          }else{
              JOptionPane.showMessageDialog(null, "** usuario ou senha invalidos!! **");
          }



    }





}