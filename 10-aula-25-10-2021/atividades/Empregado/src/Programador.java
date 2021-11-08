public class Programador extends Empregado {
  private float qtdeHoras;
  private float valorHora;

  public Programador() {
  };

  public Programador(String n, String m, float qH, float vH) {
    super(n, m);
    qtdeHoras = qH;
    valorHora = vH;
  }

  public float getQtdeHoras() {
    return qtdeHoras;
  }

  public void setQtdeHoras(float qtdeHoras) {
    this.qtdeHoras = qtdeHoras;
  }

  public float getValorHora() {
    return valorHora;
  }

  public void setValorHora(float valorHora) {
    this.valorHora = valorHora;
  }

  public float calcularSalario() {
    return qtdeHoras * valorHora;
  }

}
