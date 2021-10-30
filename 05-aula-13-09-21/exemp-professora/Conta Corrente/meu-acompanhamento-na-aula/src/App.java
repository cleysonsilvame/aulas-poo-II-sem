import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        float saldo = Float.parseFloat(JOptionPane.showInputDialog("Digite o seu saldo inicial: "));
        char tipo = JOptionPane.showInputDialog("Digite o tipo desejado: ").charAt(0);

        ContaCorrente conta1 = new ContaCorrente(nome, saldo, tipo);
        ContaCorrente conta2 = new ContaCorrente("O nome", 100f, 100f);

        if (conta1.saldo >= 30) {
            conta1.sacar(10f);
            JOptionPane.showMessageDialog(null, conta1.imprimeDados());
        }

        if (conta2.limite >= 30) {
            conta2.sacar(10f);
            JOptionPane.showMessageDialog(null, conta2.imprimeDados());
        } else {
            conta2.depositar(10f);
            JOptionPane.showMessageDialog(null, conta2.imprimeDados());
        }

    }
}
