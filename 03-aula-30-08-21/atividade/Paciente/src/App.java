import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---- Classe Paciente ----");
        Paciente paciente1 = new Paciente();

        System.out.println("Digite o nome do 1º paciente: ");
        paciente1.nome = scanner.nextLine();

        System.out.println("Digite o nome do 2º paciente: ");
        Paciente paciente2 = new Paciente(scanner.nextLine());

        System.out.println("\nDigite o RG do primeiro: ");
        paciente1.rg = scanner.nextLine();

        System.out.println("\nDigite o RG do segundo: ");
        paciente2.rg = scanner.nextLine();

        System.out.println("\nDigite o endereço do 1º paciente: ");
        paciente1.endereco = scanner.nextLine();

        System.out.println("\nDigite o endereço do 2º paciente: ");
        paciente2.endereco = scanner.nextLine();

        System.out.println("\nDigite o telefone do primeiro: ");
        paciente1.telefone = scanner.nextLine();

        System.out.println("\nDigite o telefone do segundo: ");
        paciente2.telefone = scanner.nextLine();

        System.out.println("\nDigite a data de nascimento 1º paciente: ");
        paciente1.dataNascimento = scanner.nextLine();

        System.out.println("\nDigite a data de nascimento 2º paciente: ");
        paciente2.dataNascimento = scanner.nextLine();

        System.out.println("\nE então, a profissão do primeiro: ");
        paciente1.profissao = scanner.nextLine();

        System.out.println("\nAgora, a profissão do segundo: ");
        paciente2.profissao = scanner.nextLine();

        System.out.println("\n---- Dados do primeiro paciente ----");
        System.out.println("Nome: " + paciente1.nome);
        System.out.println("RG: " + paciente1.rg);
        System.out.println("Endereço: " + paciente1.endereco);
        System.out.println("Telefone: " + paciente1.telefone);
        System.out.println("Data de nascimento: " + paciente1.dataNascimento);
        System.out.println("Profissão: " + paciente1.profissao);

        System.out.println("\n---- Dados do segundo paciente ----");
        System.out.println("Nome: " + paciente2.nome);
        System.out.println("RG: " + paciente2.rg);
        System.out.println("Endereço: " + paciente2.endereco);
        System.out.println("Telefone: " + paciente2.telefone);
        System.out.println("Data de nascimento: " + paciente2.dataNascimento);
        System.out.println("Profissão: " + paciente2.profissao);

        System.out.println("---- Obrigado! ----\n");

        scanner.close();
    }
}
