public class Triangulo {
  private double base;
  private double altura;

  Triangulo() {
  }

  Triangulo(double base, double altura) {
    this.base = base;
    this.altura = altura;
  }
  

  public double getBase() {
    return base;
  }

  public void setBase(double base) {
    this.base = base;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  double calculaArea() {
    double area = (base * altura) / 2;

    return area;
  }

  void imprimeDados() {
    System.out.println("Base: " + base);
    System.out.println("Altura: " + altura);
  }

}
