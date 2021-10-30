import javax.swing.*;
public class ContaCorrente {
    String nome;
    float saldo, limite;
    char tipo;

    //metodos contrutores 
    public ContaCorrente() {
    }

    public ContaCorrente(String nome, float saldo, float limite,char tipo) {
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
        this.tipo = tipo;
    }

    public ContaCorrente(String nome, float saldo, char tipo) {
        this.nome = nome;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    public void cadastraDados(){
        // essa aqui por enquanto não pois precisa da revisão dos parametros
    }
    public String imprimiDados(){
        String tudo;
        tudo = "\t\t\t**Bem vindo ao Banco Lero lero**\n\n\nCorrentista: "+nome+"\nSeu Saldo é: "+
                saldo+"\nSeu limite é: "+limite+"\nseu tipo é: "+tipo;
        
        return(tudo);
    }
    public void depositar(float valor){
        saldo = saldo+valor;
    }

    public void sacar(float valor){
        if(saldo >= valor )
            saldo = saldo - valor;
        else
            JOptionPane.showMessageDialog(null, "Não foi possivel realizar o saque \nSaldo Insuficiente!!!");

    }

    public float maiorSaldo(ContaCorrente c){
        float retorno;
        if(c.saldo>= 0)
            retorno = c.saldo;
        else
           retorno=0;
        return(retorno);
    }

    
    
    
}
