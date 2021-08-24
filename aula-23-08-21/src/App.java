import java.util.Scanner;
import javax.swing.JOptionPane;

public class App {
  public static void main(String[] args) throws Exception {
    // não lembramos
    /*
     * comentarios de mais de uma linha
     */

    TesteTipos tst = new TesteTipos(); // eu crio o objeto na memoria

    tst.setCodigo(25);
    tst.setEscolha(false);

    System.out.println("objeto: " + tst);
    System.out.println("Codigo: " + tst.getCodigo() + " escolha " + tst.isEscolha());

    JOptionPane.showMessageDialog(null, "Codigo: " + tst.getCodigo());
    String quantidade = JOptionPane.showInputDialog("Digite seu nome:");

    tst.quantidade = Long.parseLong(quantidade);

    Scanner leia = new Scanner(System.in);

    System.out.println("Digite o valor double: ");
    tst.receber = Double.parseDouble(leia.nextLine());
    System.out.println("Digite a idade: ");
    tst.idade = Byte.parseByte(leia.nextLine());
    System.out.println("Digite um short: ");
    tst.numero = Short.parseShort(leia.nextLine());

    leia.close();
  }
}
