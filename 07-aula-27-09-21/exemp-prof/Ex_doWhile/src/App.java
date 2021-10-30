import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        int cont = 10;
        String conteudo = "*** Valores *** \n ";
        do{
            JOptionPane.showMessageDialog(null,"o valor do contador é: "+cont);
            cont++; // incremento de 1 em um

        }while(cont < 10);
        

        cont = 0;
        do{
            conteudo+= "Número: "+cont+"\n";
            cont++;
        }while(cont<10);

        JOptionPane.showMessageDialog(null, conteudo);

    }


}
