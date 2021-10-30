import pacote.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p = new Pessoa();
        p.setNome("Lero lero");
        p.setIdade(30);
        p.setRenda(35);
        p.imprimiDados();
        p.atualizaRenda(0.04);
        p.imprimiDados();

        Pessoa p1 = new Pessoa("Maria", 15, 4);
        p1.imprimiDados();
        p1.atualizaRenda(1);
        p1.imprimiDados();
        p1.setNome("Maria Aparecida dos Santos");
        p1.setIdade(16);
        p1.imprimiDados();

    }
}
