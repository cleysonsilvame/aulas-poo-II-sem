import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int count = 10;

        String conteudo = "*** Valores ***\n";

        do {
            JOptionPane.showMessageDialog(null, "O valor do contador é: " + count);
        } while (count > 0);

        count = 0;

        do {
            conteudo += "Número: " + count + "\n";
            count++;
        } while (count > 0);

        JOptionPane.showMessageDialog(null, conteudo);
    }
}
