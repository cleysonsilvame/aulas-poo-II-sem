public class App {
    public static void main(String[] args) throws Exception {

       // tipo do pai mas instancia o objeto usando o construtor do filho
        Forma f = new Quadrado();

        f.setNome(" estou usando o construtor do quadrado");
       System.out.println( f.getNome());

       // instanceof serve para verificar se o objeto é 
       // do tipo polimorfico para uma determinada classe
       // e evitar apresentar erros em tempo de execução
       // para realizar conversão de tipos
       if (f instanceof Quadrado){
            //casting  ou conversão de tipos
            // do objeto do tipo pai parav o tipo filho
            //da instancia
            ((Quadrado) f).setLado(5); 
            System.out.println(((Quadrado) f).area());

       }


       

    }
}
