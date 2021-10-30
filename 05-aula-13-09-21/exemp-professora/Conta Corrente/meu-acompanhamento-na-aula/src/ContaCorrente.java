import javax.swing.*;

public class ContaCorrente {
  String nome;
  float saldo, limite;
  char tipo;

  public ContaCorrente() {

  }

  public ContaCorrente(String nome, float saldo, float limite) {
    this.nome = nome;
    this.saldo = saldo;
    this.limite = limite;
  }

  public ContaCorrente(String nome, float saldo, char tipo) {
    this.nome = nome;
    this.saldo = saldo;
    this.tipo = tipo;
  }

  public void cadastraDados() {
  }

  public String imprimeDados() {
    String tudo;
    tudo = "Correntista: " + nome;
    tudo += "\nSeu Saldo é: " + saldo;
    tudo += "\nSeu limite é: " + limite;
    tudo += "\nSeu tipe é: " + tipo;

    return tudo;
  }

  public void depositar(float valor) {
    saldo += valor;
  }

  public void sacar(float valor) {
    if (saldo >= valor) {
      saldo -= valor;

    } else {
      JOptionPane.showMessageDialog(null, "Não foi possível realiar o saque \nSaldo insuficiente!");
    }

  }
}