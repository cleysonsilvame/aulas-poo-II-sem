public class App {
    public static void main(String[] args) throws Exception {
        Paciente p1 = new Paciente("Roberto");
        Paciente p2 = new Paciente();

        p1.rg = "123456789";
        p1.endereco = "Rua Adonis";
        p1.telefone = "220010101";
        p1.anoNascimento = 1976;
        p1.profissao = "Analista de TI";

        p2.nome = "Babel";
        p2.rg = "312312312312";
        p2.endereco = "Rua ABC";
        p2.telefone = "2333131313";
        p2.anoNascimento = 1988;
        p2.profissao = "Caminhoneiro";

        p1.imprimeDados();
        System.out.println("Sua idade é: " + p1.calculaIdade(2021));

        System.out.println("--------------------------");

        p2.imprimeDados();
        System.out.println("Sua idade é: " + p2.calculaIdade(2021));
    }
}
