public class App {
    public static void main(String[] args) throws Exception {
        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            int counter = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    ++counter;
                }
            }
            if (counter == 2) {
                soma += i;
            }
        }

        System.out.println("A soma dos números primos no intervalo de 1 à 100 é: " + soma);
    }
}
