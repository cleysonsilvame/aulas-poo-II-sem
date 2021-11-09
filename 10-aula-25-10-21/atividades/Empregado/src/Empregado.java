public abstract class Empregado {
  protected String nome;
  protected String matricula;

  public Empregado() {
  };

  public Empregado(String n, String m) {
    nome = n;
    matricula = m;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public abstract float calcularSalario();
}