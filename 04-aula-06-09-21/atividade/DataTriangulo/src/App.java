public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("---- Classe Triangulo ----\n");

        Triangulo t1 = new Triangulo();
        Triangulo t2 = new Triangulo(14.2f, 10.5f);

        System.out.println("---- T1 ----");
        t1.imprimeDados();
        t1.base = 4f;
        t1.altura = 6f;
        float areaT1 = t1.calculaArea();
        t1.imprimeDados();
        System.out.println("Área: " + areaT1);

        System.out.println("\n---- T2 ----");
        t2.imprimeDados();
        float areaT2 = t2.calculaArea();
        System.out.println("Área: " + areaT2);

        System.out.println("\n\n---- Classe Data ----\n");

        Data data1 = new Data();
        Data data2 = new Data(14, 5, 2008);

        System.out.println("---- data1 ----");
        data1.imprimeDados();
        data1.dia = 4;
        data1.mes = 6;
        data1.ano = 1998;
        data1.cadastraDados(4, 6, 1998);
        data1.imprimeDados();

        System.out.println("\n---- data2 ----");
        data2.imprimeDados();
    }
}
