public class Triangulo extends Forma{
    
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

    public float area(){
        return ((base*altura)/2);
    }
    public void mostrar(){
        System.out.println("A base do triangulo é "+base+" a altura é "+altura+
         "a area do traingulo é "+area());

    }
  

}
