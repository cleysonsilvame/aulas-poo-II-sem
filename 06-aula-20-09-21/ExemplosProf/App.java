import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        int numero;

        System.out.println("Digite um número para checar sua tabuada:\n");

        Scanner input = new Scanner(System.in);

        numero = Integer.parseInt(input.nextLine());

        System.out.println("Veja abaixo a tabuada do número inserido:");
        for (int i = 1; i <= 10; i++){
            System.out.println(numero * i);8
            
        }
        
    }
}
