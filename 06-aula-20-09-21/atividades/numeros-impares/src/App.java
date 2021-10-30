import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primero número");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número");
        int num2 = scanner.nextInt();

        int inicio = num1 < num2 ? num1 : num2;
        int fim = num1 > num2 ? num1 : num2;

        int soma = 0;
        int qtdImpares = 0;

        for (int i = inicio; i <= fim; i++) {
            if (i % 2 != 0) {
                soma += i;
                qtdImpares++;
            }
        }

        float media = (float) soma / qtdImpares;

        System.out.println("A média dos números impares é: " + media);

        scanner.close();
    }
}
