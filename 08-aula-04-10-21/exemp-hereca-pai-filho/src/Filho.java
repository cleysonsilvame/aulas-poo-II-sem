public class Filho  extends Pai{

    // pai deve estar no mesmo pacote do filho
   public void imprimiFilho(){
       System.out.println("Esse atributo veio do pai"+a);
       System.out.println("Esse atributo veio do pai"+b);
       System.out.println("Esse é o c"+getC());
    }

    public Filho() {
        }

    public Filho(int a, int b, int c) {
    super(a, b, c); // super para falar  dos atributos da superclasse ou classe pai
    //this para falar dos atributos da classe atual
    }
    
    
}
