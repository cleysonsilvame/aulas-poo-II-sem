public class Circunferencia extends Forma {
  private float raio;

  public Circunferencia(float r) {
    raio = r;
  }

  public float getCircunferencia() {
    return raio;
  }

  public void setCircunferencia(float r) {
    raio = r;
  }

  public float area() {
    return (float) (Math.PI * Math.pow(raio, 2));
  }

  public float perimetro() {
    return (float) (2 * Math.PI * raio);
  }

  public void mostra() {
    System.out.println("Circunferencia");
    System.out.println("Raio: " + raio);
    System.out.println("Area: " + area());
    System.out.println("Perímetro: " + perimetro());
  }

}
