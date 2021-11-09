public class Retangulo extends Triangulo {
  public Retangulo(float b, float a) {
    super(b, a);
  }

  public float area() {
    return super.getBase() * super.getAltura();
  }

  public float perimetro() {
    return 2 * (super.getBase() + super.getAltura());
  }

  public void mostra() {
    System.out.println("Retângulo: ");
    System.out.println("Base: " + super.getBase());
    System.out.println("Altura: " + super.getAltura());
    System.out.println("Area: " + area());
    System.out.println("Perimetro: " + perimetro());
  }
}
