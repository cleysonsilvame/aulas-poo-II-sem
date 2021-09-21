import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\t\t\t---- Banco Papai do Céu -----");

        
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        System.out.println("Digite o saldo da conta: ");
        float saldo = scanner.nextFloat();
        System.out.println("Digite o tipo: ");
        char tipo = scanner.next().charAt(0);

        ContaCorrente conta1 = new ContaCorrente(nome, saldo, tipo);
        ContaCorrente conta2 = new ContaCorrente("Silva e silva", 10.4f, 1500f, 'C');

        System.out.println(conta1.imprimiDados());

        if (conta1.saldo >= 30) {
            conta1.sacar(10f);
            System.out.println(conta1.imprimiDados());
        }

        if (conta2.limite >= 1500) {
            conta2.sacar(10f);
            System.out.println(conta2.imprimiDados());
        } else {
            conta2.depositar(10f);
            System.out.println(conta2.imprimiDados());
        }

        conta2.sacar(10f);

        scanner.close();
    }
}
