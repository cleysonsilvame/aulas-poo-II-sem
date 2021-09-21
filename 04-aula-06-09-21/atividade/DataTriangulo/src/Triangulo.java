public class Triangulo {
  float base;
  float altura;

  Triangulo() {
  }

  Triangulo(float b, float a) {
    base = b;
    altura = a;
  }

  float calculaArea() {
    float area = (base * altura) / 2;

    return area;
  }

  void imprimeDados() {
    System.out.println("Base: " + base);
    System.out.println("Altura: " + altura);
  }

}
