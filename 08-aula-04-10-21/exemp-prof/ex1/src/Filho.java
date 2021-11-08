public class Filho  extends Pai{
       private int d;
       private int c;
    // pai deve estar no mesmo pacote do filho
   public void imprimiFilho(){
       System.out.println("Esse atributo veio do pai"+a);
       System.out.println("Esse atributo veio do pai"+b);
       System.out.println("Esse é o c "+getC());
       System.out.println("esse é o d do filho" +d);
    }

    public Filho() {
        }

    public Filho(int a, int b, int c) {
    super(a, b, c); // super para falar  dos atributos da superclasse ou classe pai
    //this para falar dos atributos da classe atual
    }

    public void print(){
        System.out.println("Veja bem que esse aqui matou o outro");
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    
    
    
}
