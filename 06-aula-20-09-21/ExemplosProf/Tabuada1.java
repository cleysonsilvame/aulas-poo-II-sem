import java.util.Scanner;

public class Tabuada1{

    public static void main(String[] args) throws Exception {

        int numero;

        System.out.println("Digite um número para checar sua tabuada:\n");

        Scanner input = new Scanner(System.in);

        numero = Integer.parseInt(input.nextLine());

        System.out.println("Veja abaixo a tabuada do número inserido:");
       
            System.out.println(numero+"x 0 = "+(numero * 0));
            System.out.println(numero+"x 1 = "+(numero * 1));
            System.out.println(numero+"x 2 = "+ (numero * 2));
            System.out.println(numero+"x 3 = "+(numero * 3));
            System.out.println(numero+"x 4 = "+(numero * 4));
            System.out.println(numero+"x 5 = "+(numero * 5));
            System.out.println(numero+"x 6 = "+(numero * 6));
            System.out.println(numero+"x 7 = "+(numero * 7));
            System.out.println(numero+"x 8 = "+(numero * 8));
            System.out.println(numero+"x 9 = "+(numero * 9));
            System.out.println(numero+"x 10 = "+(numero * 10));
        
        
    }
}