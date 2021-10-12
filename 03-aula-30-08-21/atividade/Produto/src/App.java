import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("---- Classe Produto ----\n");
        Produto produto1 = new Produto();

        System.out.println("Digite a marca do 1º produto: ");
        produto1.marca = scanner.nextLine();

        System.out.println("\nDigite seu fabricante: ");
        produto1.fabricante = scanner.nextLine();

        System.out.println("\nDigite o código de barras: ");
        produto1.cod_barras = scanner.nextLine();

        System.out.println("\nPor fim, seu preço: ");
        produto1.preco = scanner.nextFloat();

        System.out.println("\n\nDigite a marca do 2º produto: ");
        String marca = scanner.next();

        System.out.println("\nDigite seu fabricante: ");
        String fabricante = scanner.next();

        System.out.println("\nDigite o código de barras: ");
        String cod_barras = scanner.next();

        System.out.println("\nPor fim, seu preço: ");
        float preco = scanner.nextFloat();

        Produto produto2 = new Produto(marca, fabricante, cod_barras, preco);

        System.out.println("\n---- Dados do 1º produto ----");
        System.out.println("Marca: " + produto1.marca);
        System.out.println("Fabricante: " + produto1.fabricante);
        System.out.println("Código de Barras: " + produto1.cod_barras);
        System.out.println("Preço: " + produto1.preco);

        System.out.println("\n---- Dados do 2º produto ----");
        System.out.println("Marca: " + produto2.marca);
        System.out.println("Fabricante: " + produto2.fabricante);
        System.out.println("Código de Barras: " + produto2.cod_barras);
        System.out.println("Preço: " + produto2.preco);

        System.out.println("---- Obrigado! ----\n");
        scanner.close();
    }
}
