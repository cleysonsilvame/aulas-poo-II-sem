public class App {
    public static void main(String[] args) throws Exception {
        // variaveis primitivas
        double n1 = 8.9;
        float n2 = 7.9f;
        char c1 = 'c';
        boolean b = true;
        int i = 10;

        System.out.println("\t\t\t** Exibindo variaveis primitivas (Stak) ** \n\n");
        System.out.println("O valor inteiro é: "+ (i-i) +"\n"+
                           "O valor double é: "+(n1+n1)+"\n"+
                           "O float é: "+(n2*n2)+"\n"+
                           "O Char é: "+c1+"\n"+
                           "O boolean é: "+b);


        // parte dos objetos
        Tst mago = new Tst(4.5f, 30.9);
        Tst cavaleiro = new Tst();
        Tst  druida = new Tst(70.4f);

        System.out.println("\n\n\t\t\t**  endereço dos objetos no Heap **");
        System.out.println("Objeto Mago: "+mago+"\n"+
                            "Objeto Cavaleiro: "+cavaleiro+"\n"+
                            "Objeto Druida: "+druida+"\n");    
                      
        System.out.println("\n\n\t\t\t** Valores dos atributos de cada objeto**");
        System.out.println("Atributos do objeto Mago: \n"+
                           "MP:" +mago.mp+"\n"+
                           "ML"+mago.ml+"\n"+
                            "vida: "+mago.vida+"\n"+
                            "bobo"+mago.bobo+"\n"+
                            "classe: "+mago.clase+"\n");
                           
        System.out.println("Atributos do objeto Cavaleiro: \n"+
                            "MP:" +cavaleiro.mp+"\n"+
                            "ML"+cavaleiro.ml+"\n"+
                             "vida: "+cavaleiro.vida+"\n"+
                             "bobo"+cavaleiro.bobo+"\n"+
                             "classe: "+cavaleiro.clase+"\n");

        System.out.println("Atributos do objeto Druida: \n"+
                             "MP:" +druida.mp+"\n"+
                             "ML"+druida.ml+"\n"+
                              "vida: "+druida.vida+"\n"+
                              "bobo"+druida.bobo+"\n"+
                              "classe: "+druida.clase+"\n");
}}
