class Funcionario {
  private int cracha;
  private Float salario;
  private String cargo;

  Funcionario() {
  }

  Funcionario(int c, Float s, String cargo) {
    this.cracha = c;
    this.salario = s;
    this.cargo = cargo;
  }

  public int getCracha() {
    return cracha;
  }

  public void setCracha(int cracha) {
    this.cracha = cracha;
  }

  public Float getSalario() {
    return salario;
  }

  public void setSalario(Float salario) {
    this.salario = salario;
  }

  public String getCargo() {
    return cargo;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }

  void calculaAumento(Float porcentagem) {
    this.salario += salario * (porcentagem / 100);
  }

  void calculaAumento(int tempo) {
    salario += 150 * tempo;
  }

}