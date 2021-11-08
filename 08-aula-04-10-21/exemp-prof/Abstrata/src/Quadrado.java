public class Quadrado extends Forma{
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



    public float area(){
      float a ;
      a =  base*base;
      return a;

    }
    public void mostrar(){
      System.out.println("A base do quadrado: "+base+"\n"+
               "tem a area: "+area()+" e o perimetro"+perimetro() );
    }
    public float perimetro(){
        float p;
        p =  base+base+base+base;
        return p;

    }
    
}
