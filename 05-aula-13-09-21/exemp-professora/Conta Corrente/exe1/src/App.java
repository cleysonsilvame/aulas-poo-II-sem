import javax.swing.*;
public class App {
    public static void main(String[] args) throws Exception {
       String nome =  JOptionPane.showInputDialog("Digite o nome: ");
       float saldo =Float.parseFloat(JOptionPane.showInputDialog("Digite o saldo: "));
       char tipo =  JOptionPane.showInputDialog("Digite o Tipo: ").charAt(0);
       //Integer.parseInt(JOptionPane.showInputDialog("Mensagem"));
        ContaCorrente conta1 = new ContaCorrente(nome, saldo, tipo);
        ContaCorrente conta2 = new ContaCorrente("João Ninguém", 
                                                  100f, 0, 'K');
      
       //conta1.depositar(30f); 
      
       JOptionPane.showMessageDialog(null,conta1.imprimiDados());

       // if simples
       if (conta1.saldo >= 30) {
            conta1.sacar(10f);
            JOptionPane.showMessageDialog(null,conta1.imprimiDados());
       }

       // if / else
       if(conta2.limite>=30){
           conta2.sacar(10f);
           JOptionPane.showMessageDialog(null,conta2.imprimiDados());
       }
       else{ // quando o if for falso
            conta2.depositar(10f);;
            JOptionPane.showMessageDialog(null,conta2.imprimiDados());
       }
       



    }
}
