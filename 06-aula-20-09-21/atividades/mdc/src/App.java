import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int valor1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int valor2 = scanner.nextInt();

        int resto;
        while (valor2 != 0) {
            resto = valor1 % valor2;
            valor1 = valor2;
            valor2 = resto;
        }

        System.out.println("O MDC é: " + valor1);

        scanner.close();
    }
}
