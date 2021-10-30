public class Paciente {
  String nome, rg, endereco, telefone, profissao;
  int anoNascimento;

  public Paciente() {
  }

  public Paciente(String n) {
    nome = n;
  }

  public void cadastraCurso() {
    // não implementei porque não tem como cadastrar nada sem receber parâmentros
  }

  public void imprimeDados() {
    System.out.println("Nome: " + nome);
    System.out.println("RG: " + rg);
    System.out.println("Endereço: " + endereco);
    System.out.println("Telefone: " + telefone);
    System.out.println("Profissão: " + profissao);
    System.out.println("Ano de Nascimento: " + anoNascimento);
  }

  public int calculaIdade(int anoAtual) {
    return anoAtual - anoNascimento;
  }
}
