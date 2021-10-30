import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println(("Digite o número desejado: "));

        int numeroDoUser = Integer.parseInt(scanner.nextLine());

        Tabuada tabuada = new Tabuada(numeroDoUser);

        tabuada.gerar();
        scanner.close();
    }
}
