import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // para conseguir usar o ponto como separador decimal

        Triangulo t1 = new Triangulo();
        System.out.println("Digite o valor da base do triângulo: ");
        t1.setBase(scanner.nextDouble());

        System.out.println("Digite o valor da altura do triângulo: ");
        t1.setAltura(scanner.nextDouble());

        Triangulo t2 = new Triangulo(14.2, 10.5);

        System.out.println("---- T1 ----");
        t1.imprimeDados();
        double areaT1 = t1.calculaArea();
        System.out.println("Área: " + areaT1);

        System.out.println("\n---- T2 ----");
        t2.imprimeDados();
        double areaT2 = t2.calculaArea();
        System.out.println("Área: " + areaT2);

        scanner.close();

    }
}
