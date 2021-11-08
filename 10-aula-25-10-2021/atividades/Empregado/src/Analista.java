import java.util.ArrayList;

public class Analista extends Empregado {
  private ArrayList<Float> valorPorProjeto;

  public Analista() {
  };

  public Analista(String n, String m, ArrayList<Float> vP) {
    super(n, m);
    valorPorProjeto = vP;
  }


  public ArrayList<Float> getValorPorProjeto() {
    return valorPorProjeto;
  }

  public void setValorPorProjeto(ArrayList<Float> valorPorProjeto) {
    this.valorPorProjeto = valorPorProjeto;
  }

  public float calcularSalario() {
    float salario = 0;
    for (float valorProjeto : valorPorProjeto) {
      salario += valorProjeto;
    }
    return salario;
  }
}
