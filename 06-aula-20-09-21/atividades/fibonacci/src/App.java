import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de fibonacci: ");
        int numero = scanner.nextInt();

        if (numero > 1) {
            String mensagem = "\n";
            int i = 1;

            while (true) {
                int numeroAtual = fib(i);
                if (numeroAtual > numero) {
                    break;
                }
                mensagem += numeroAtual;
                mensagem += ", ";
                i++;
            }

            System.out.println(mensagem.substring(0, mensagem.length() - 2));
        } else {
            System.out.println("Digite um número maior que '1'!");
        }

        scanner.close();
    }

    static int fib(int n) {
        if (n > 1) {
            return fib(n - 1) + fib(n - 2);
        } else {
            return n;
        }
    }

}
