public class Principal {
     public static void main(String[] args) {
        Pessoa p = new Pessoa();
        System.out.println(p + "\n"+
        "nome:" + p.nome);
        
        // passagem de valore direto
        // pelos atributos

        p.nome = "Lala";
        p.idade = 7;
        p.peso = 20;
        p.altura = 1;
        
        System.out.println(p + "\n"+
        "nome:" + p.nome);



    }
}
