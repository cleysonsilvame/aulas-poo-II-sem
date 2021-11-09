import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // para usar o ponto como separador decimal

        System.out.println("Digite o valor do raio: ");
        float raio = scanner.nextFloat();

        System.out.println("Digite o valor do base: ");
        float base = scanner.nextFloat();

        System.out.println("Digite o valor do altura: ");
        float altura = scanner.nextFloat();

        Circunferencia c1 = new Circunferencia(raio);
        Retangulo r1 = new Retangulo(base, altura);

        System.out.println();
        c1.mostra();
        System.out.println();
        r1.mostra();

        scanner.close();
    }
}
