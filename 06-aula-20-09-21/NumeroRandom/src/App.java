import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println(("Número de 0 a 20"));
        System.out.println(("**"));
        System.out.println(("Tente acertar o número: "));

        int numeroDoUser = -1;

        Random aleatorio = new Random();
        int key = aleatorio.nextInt(20);

        while (key != numeroDoUser) {
            numeroDoUser = scanner.nextInt();

            if (numeroDoUser > key) {
                System.out.println("O número é menor viu?");
                System.out.println("Tente novamente");

            } else if (numeroDoUser < key) {
                System.out.println("O número é maior meu!");
                System.out.println("Tente novamente");
            } else {
                System.out.println("Vamo mermão!!!");
            }
        }

        System.out.println("É isso mesmo, o número é: " + key);

        scanner.close();
    }
}
