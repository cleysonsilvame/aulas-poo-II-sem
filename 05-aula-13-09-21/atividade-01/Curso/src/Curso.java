public class Curso {
  String nome, turma;
  int quantidadeAlunos;
  float mensalidade;

  public Curso() {
  }

  public Curso(String n, int q, String t, float m) {
    nome = n;
    turma = t;
    quantidadeAlunos = q;
    mensalidade = m;
  }

  public void cadastraCurso() {
    // não implementei porque não tem como cadastrar nada sem receber parâmentros
  }

  public void imprimeDados() {
    System.out.println("Nome do curso: " + nome);
    System.out.println("Turma: " + turma);
    System.out.println("Quantidade de alunos: " + quantidadeAlunos);
    System.out.println("Mensalidade: " + mensalidade);
  }

  public float calculaTotalensalidade() {
    return quantidadeAlunos * mensalidade;
  }

}
