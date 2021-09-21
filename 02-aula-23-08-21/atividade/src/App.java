import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("---- Classe Produto ----\n");
        Produto produto = new Produto();

        System.out.println("Digite a marca do produto: ");
        produto.setMarca(scanner.nextLine());

        System.out.println("\nDigite seu fabricante: ");
        produto.setFabricante(scanner.nextLine());

        System.out.println("\nDigite o código de barras: ");
        produto.setCod_barras(scanner.nextLine());

        System.out.println("\nPor fim, seu preço: ");
        produto.setPreco(scanner.nextFloat());

        System.out.println("\n---- Dados do produto ----");
        System.out.println("Marca: " + produto.getMarca());
        System.out.println("Fabricante: " + produto.getFabricante());
        System.out.println("Código de Barras: " + produto.getCod_barras());
        System.out.println("Preço: " + produto.getPreco());

        System.out.println("---- Obrigado! ----\n");
        System.out.println("---- Classe Paciente ----");
        Paciente paciente = new Paciente();

        // arruma um bug na minha máquina
        scanner.nextLine();

        System.out.println("Digite o nome do paciente: ");
        paciente.setNome(scanner.nextLine());

        System.out.println("\nDigite o RG dele: ");
        paciente.setRg(scanner.nextLine());

        System.out.println("\nDigite o endereço do paciente: ");
        paciente.setEndereco(scanner.nextLine());

        System.out.println("\nDigite o telefone: ");
        paciente.setTelefone(scanner.nextLine());

        System.out.println("\nDigite a data de nascimento: ");
        paciente.setDataNascimento(scanner.nextLine());

        System.out.println("\nE então, sua profissão: ");
        paciente.setProfissao(scanner.nextLine());

        System.out.println("\n---- Dados do paciente ----");
        System.out.println("Nome: " + paciente.getNome());
        System.out.println("RG: " + paciente.getRg());
        System.out.println("Endereço: " + paciente.getEndereco());
        System.out.println("Telefone: " + paciente.getTelefone());
        System.out.println("Data de nascimento: " + paciente.getDataNascimento());
        System.out.println("Profissão: " + paciente.getProfissao());

        System.out.println("---- Obrigado! ----\n");

        scanner.close();
    }
}
