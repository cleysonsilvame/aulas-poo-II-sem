import java.time.LocalDate;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Sorvete s1 = new Sorvete();
        s1.setNome("Chocolate");
        s1.setDescricaoIngr("Sorvete de leite saboroso");
        s1.setDataFab(LocalDate.parse("2020-01-01"));
        s1.setDataVal(LocalDate.parse("2021-01-01"));
        s1.setQuantidade(500);
        s1.setTipo("bola");
        ArrayList<String> alergicosS1 = new ArrayList<String>();
        alergicosS1.add("leite");
        alergicosS1.add("cacau");
        s1.setAlergicos(alergicosS1);

        ArrayList<String> alergicosS2 = new ArrayList<String>();
        alergicosS2.add("leite");

        Sorvete s2 = new Sorvete("Morango", "O famoso da ilha", LocalDate.parse("2020-12-01"),
                LocalDate.parse("2021-05-01"), "palito", 5, alergicosS2);

        System.out.println("*********** SORVETE 01 ***********\n");
        s1.atualizarQtd("bola", 3);
        s1.imprimir();
        if (s1.vencimento(LocalDate.parse("2021-12-01"))) {
            System.out.println("\nSorvete vencido\n");
        }
        s1.listarAlergicos();

        System.out.println("\n*********** SORVETE 02 ***********\n");
        s2.atualizarQtd("palito", 2);
        s2.imprimir();
        if (s2.vencimento(LocalDate.parse("2021-04-01"))) {
            System.out.println("\nSorvete vencido\n");
        }
        s2.listarAlergicos();

    }
}
