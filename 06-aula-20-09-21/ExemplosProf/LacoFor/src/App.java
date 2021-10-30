import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int num;
        Scanner leia = new Scanner(System.in);
        System.out.println("\t\t\t** Programa calculo Tabuada ** ");
        System.out.println("Digite um numero inteiro");
        num = leia.nextInt();
        // for(variavel de controle; condição; regra de incremento ou decremento)
        for(int cont=0; cont <=10; cont++){
            System.out.println(cont+" x "+num+" = "+(cont*num));

        }
        leia.close();
        /*
            QUANDO PRECISAMOS DA VARIAVEL DE CONTROLE FORA DO LAÇO
        */

        int n;
        System.out.println("\n\n\t\t\tSegundo Looping");
        for(n=10; n>=0; n-=2){ //n-- = n-=1
            System.out.println(n);     
        }
        System.out.println("fora do looping"+ n);     


    }
}
