public class Quadrado extends Forma {
  private float base;

  public Quadrado() {
  }

  public Quadrado(float base) {
    this.base = base;
  }

  public float getBase() {
    return base;
  }

  public void setBase(float base) {
    this.base = base;
  }

  public float area() {
    return base * base;
  };

  public float perimetro() {

    return base * 4;
  };

  public void mostrar() {
    String msg = "A base do quadrado: " + base;
    msg += "\nContinua...";

    System.out.println(msg);
  };
}