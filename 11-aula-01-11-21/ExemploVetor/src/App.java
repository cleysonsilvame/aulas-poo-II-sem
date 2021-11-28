import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("** Programa calcula media");
        double n1_1, n2_1, n3_1, media_1;
        double n1_2, n2_2, n3_2, media_2;
        double n1_3, n2_3, n3_3, media_3;

        n1_1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a nota 1:" ));    
        n2_1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a nota 2:" ));    
        n3_1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a nota 3:" ));    
        media_1 = (n1_1+n2_1+n3_1)/3;

        n1_2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a nota 1:" ));    
        n2_2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a nota 2:" ));    
        n3_2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a nota 3:" ));    
        media_2 = (n1_2+n2_2+n3_2)/3;

        n1_3 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a nota 1:" ));    
        n2_3 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a nota 2:" ));    
        n3_3 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a nota 3:" ));    
        media_3 = (n1_3+n2_3+n3_3)/3;

        JOptionPane.showMessageDialog(null, "A média do aluno 1 é: "+Math.round(media_1)   +"\n"+
                                            "A média do aluno 2 é: "+Math.round(media_2)+"\n"+
                                            "A média do aluno 3 é: "+Math.round(media_3)+"\n");


     // arredondar o valor Math.round()

    }
}
