public class ContaCorrente {
    String nome;
    float saldo, limite;
    char tipo;

    public ContaCorrente(String n, float s, float l , char t){
       // contrutor vheio ou completo com todos os atributor
        nome = n;
        saldo = s;
        limite = l;
        tipo = t;
    }


    public ContaCorrente(String n, float s, char t){
        // outro menor somente com nome saldo e tipo
        nome = n;
        saldo = s;
        tipo = t;

    }


    
}
