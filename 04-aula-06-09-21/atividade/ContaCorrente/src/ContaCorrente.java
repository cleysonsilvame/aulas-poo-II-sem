public class ContaCorrente {
    String nome;
    float saldo, limite;
    char tipo;

    ContaCorrente(String n, float s, float l, char t) {
        nome = n;
        saldo = s;
        limite = l;
        tipo = t;
    }

    ContaCorrente(String n, float s, char t) {
        nome = n;
        saldo = s;
        tipo = t;
    }

    ContaCorrente() {
    }

    void cadastraDados() {
    }

    String imprimiDados() {
        String message = "";
        message += "\t\t\t---- Banco Papai do Céu -----\n";
        message += "Correntista: " + nome;
        message += "\nSeu Saldo é: " + saldo;
        message += "\nSeu limite é: " + limite;
        message += "\nseu tipo é: " + tipo;

        return message;
    }

    void depositar(float valor) {
        saldo += valor;
    }

    void sacar(float valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("\nNão foi possivel realizar o saque!");
            System.out.println("Seu saldo é insuficiente :(");
        }
    }
}
