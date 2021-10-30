public class App {
    public static void main(String[] args) throws Exception {
        Torneio torneio1 = new Torneio("Pequeno Padawan", 14);
        Torneio torneio2 = new Torneio("Grande Padawan", 25);

        System.out.println("------------ T1 ------------");
        torneio1.imprimeDados();
        System.out.println("------------ T2 ------------");
        torneio2.imprimeDados();
    }
}
