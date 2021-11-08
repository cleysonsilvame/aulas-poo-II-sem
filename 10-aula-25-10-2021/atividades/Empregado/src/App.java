import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // para usar o ponto como separador decimal

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua matricula: ");
        String matricula = scanner.nextLine();

        System.out.println("Digite a quantidade de horas: ");
        float horas = scanner.nextFloat();

        System.out.println("Digite o valor da hora:");
        float valorHora = scanner.nextFloat();

        ArrayList<Float> valorPorProjeto = new ArrayList<>();
        while (true) {
            System.out.println("Digite o valor de um projeto: ");
            float valor = scanner.nextFloat();

            valorPorProjeto.add(valor);

            System.out.println("Deseja continuar? (s/n)");
            char continuar = scanner.next().toLowerCase().charAt(0);

            if (continuar == 'n') {
                break;
            }
        }

        Analista analista = new Analista(nome, matricula, valorPorProjeto);
        Programador programador = new Programador(nome, matricula, horas, valorHora);

        System.out.println("\nAnalista");
        System.out.println("Nome: " + analista.getNome());
        System.out.println("Matricula: " + analista.getMatricula());
        System.out.println("Salario: " + analista.calcularSalario());

        System.out.println("\nProgramador");
        System.out.println("Nome: " + programador.getNome());
        System.out.println("Matricula: " + programador.getMatricula());
        System.out.println("Salario: " + programador.calcularSalario());

        scanner.close();
    }
}
