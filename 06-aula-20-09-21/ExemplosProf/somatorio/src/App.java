import javax.swing.*;
public class App {
    public static void main(String[] args) throws Exception {
        int cont = Integer.parseInt( JOptionPane.showInputDialog("**Somátorio**\n\n"+
                                      "Digite a quantidade de termos no somátório"));
        float soma = 0;
        float valor;
        for(int i=0;i<cont; i++){
            valor = Float.parseFloat( JOptionPane.showInputDialog( "Digite o numero"));
            soma = soma+valor;
            //soma+=valor
        }
        JOptionPane.showMessageDialog(null,"O total do somátorio é: "+soma);                                    }
}
