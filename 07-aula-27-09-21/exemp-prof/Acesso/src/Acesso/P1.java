package Acesso;

public class P1 {
  public static void main(String[] args) {
    Pessoa p = new Pessoa();
    p.idade = 0;
    p.renda = 30;

    p.setNome("privadooooo");
    p.imprimiDados();
    p.atualizaRenda(0.5);
    p.imprimiDados();
    }
    
    
}
