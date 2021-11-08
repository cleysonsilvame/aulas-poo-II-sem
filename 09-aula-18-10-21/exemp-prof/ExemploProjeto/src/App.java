import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
      /* double vet[] = new double[10];
       vet[0] = 8;
       vet[1] = 7.5;
       vet[2] = 6.3;
       System.out.println("os valores do meu vetor"+ vet[0]+"\n"+
       vet[1]+"\n"+vet[2]+"\n"+vet[9]);

       int num[] = new int[5];
       String palavras[] = new String[30];

       // vetores de objeto

       

       int valor;
      
       System.out.println("Digite a quantidade de registros a ser cadastrado");
       valor = leia.nextInt();
       char letras[] = new char[valor];*/
       
       int controle = 3;
       Produto prod[] = new Produto[500];
       for(int i = 0; i< controle; i++){
           prod[i] = new Produto(); // quando eu crio o objeto aqui 
           System.out.print("Digite o nome do produto: ");
           prod[i].setNome(leia.next());

           System.out.print("Digite o tipo do produto: ");
           prod[i].setTipo(leia.next().charAt(0));

           System.out.print("Digite o preço: ");
           prod[i].setPreco(Double.parseDouble(leia.next()));

           System.out.print("Digite a quantidade: ");
           prod[i].setQuantidade(leia.nextInt());

           System.out.print("****************************\n");

       }

       

       // listar todos
       for(int i = 0; i<3; i++){
            prod[i].mostrar();
       }



    }
}
