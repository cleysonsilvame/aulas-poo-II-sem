import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Random numAleatorio = new Random();
        Scanner leia = new Scanner(System.in);
        int valor,ad, cont;
        ad  = numAleatorio.nextInt(20);  
        cont=0;
        while(true){
            System.out.println("Digite um numero");
            valor = leia.nextInt();
            if(valor==ad){
                System.out.println("Parabéns, você acertou o numero em"+
                                   cont+"tentativas");
                break;
            }else if(valor>ad){
                System.out.println("O valor digitado é maior");
                cont++;
            }else{
                System.out.println("O valor digitado é menor");
                cont++;
            }
        }
        leia.close();
    
    }
}
