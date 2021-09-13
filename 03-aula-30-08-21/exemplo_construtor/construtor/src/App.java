public class App {
    public static void main(String[] args) throws Exception {
     
        float b = (float) 12.6;
        float a = (float) 8.6;
        
         // instanciar os objetos na memoria
        Triangulo t1 =  new Triangulo();
        Triangulo t2 = new Triangulo(b, a);
        Triangulo t3 = new Triangulo(3.7f, 9.7f);

        Data d1 = new Data();
        Data d2 = new Data(3,6,88);

        System.out.print("Meu primeiro tem a base = "+ t1.base);
        System.out.println("sua altura é = "+ t1.altura);

        System.out.println("A area do segundo traingulo em cm é " + 
                           ( (t2.base*t2.altura)/2));
       
       System.out.println("a base do triangulo 3 é: "+ t3.base +
                           "Sua altura é: "+t3.altura);

        System.out.println("A primeira data é: "+ d1.dia+"/"+d1.mes+"/"+d1.ano);

        System.out.println("A primeira data é: "+ d2.dia+"/"+d2.mes+"/"+d2.ano);



        


    }
}
