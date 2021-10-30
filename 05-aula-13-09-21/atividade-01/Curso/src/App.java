public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso("Java", 20, "A", 1000f);
        Curso curso2 = new Curso();

        curso2.nome = "Javascript";
        curso2.quantidadeAlunos = 50;
        curso2.turma = "N";
        curso2.mensalidade = 900f;

        curso1.imprimeDados();
        System.out.println("A mensalidade total é: " + curso1.calculaTotalensalidade());

        System.out.println("--------------------------");
        
        curso2.imprimeDados();
        System.out.println("A mensalidade total é: " + curso2.calculaTotalensalidade());
    }
}
