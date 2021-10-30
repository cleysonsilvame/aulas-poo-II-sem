public class App {
    public static void main(String[] args) throws Exception {
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario(2, 5000f, "Gerente");

        f1.setCracha(1);
        f1.setCargo("Balcão");

        System.out.println("cracha do f1: " + f1.getCargo());
        System.out.println("cracha do f2: " + f2.getCargo());
        System.out.println("\n");

        f2.calculaAumento(10f);
        f2.calculaAumento(2f);
        f2.calculaAumento(3);
        System.out.println("Cargo do f2: " + f2.getCargo());
        System.out.println("Salario do f2: " + f2.getSalario());
    }
}
