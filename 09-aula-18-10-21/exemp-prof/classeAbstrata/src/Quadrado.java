public class Quadrado  extends Forma{

    private float base;


    public Quadrado(float base) {
        this.base = base;
    }


    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }


    public float area(){
        return base*base;
    }

    public void mostrar(){
        System.out.println("Esse quadrado tem a base "+base+" tem a area "
                       +area()+" e o perimetro"+perimetro());
    }

    public float perimetro(){
        return base+base+base+base;
    }
    
}
