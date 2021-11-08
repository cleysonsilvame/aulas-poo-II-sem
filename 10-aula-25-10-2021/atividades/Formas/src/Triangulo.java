public class Triangulo extends Forma {

    private float base;
    private float altura;

    public Triangulo(float b, float h) {
        base = b;
        altura = h;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float area() {
        return ((base * altura) / 2);
    }

    public void mostra() {
        String message = "";
        message += "A base do triangulo é: " + this.base + "\n";
        message += "A sua altura é: " + this.altura + "\n";
        message += "E sua area é: " + this.area() + "\n";

        System.out.println(message);
    }

}
