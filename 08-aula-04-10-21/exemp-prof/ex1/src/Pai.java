public class Pai extends Avo{
    public int a;
    protected int b;
    private int c;
    
    public Pai() {
        a=10;
        b=20;
        c=30;
    }


    public Pai(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int getC() {
        return c;
    }
    public void setC(int c) {
        this.c = c;
    }

    public void print(){
        System.out.println("Ihiiiii");
    }

    public void mostrar(){
        System.out.print("Implementação do metodo abstrato");
    }

    
}
