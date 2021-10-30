import javax.swing.*;

;public class Principal {
    public static void main(String args[]){
       int retorno =  menu();
       double nota1, nota2;
       Boletim b1 = new Boletim();
       switch(retorno){
        case(1):
            nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1: "));
            nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2: "));
            b1.n1 = nota1; 
            b1.n2 = nota2;
            b1.calculaMedia();
            break;
        case(2):
             b1.imprimiBoletim();
             break;
        default:
            JOptionPane.showMessageDialog(null,"Valor incorreto!!!");

       }

        
        
       
        //System.out.println(b1.historico(b1));
    }

    public static int menu(){
      int resp; 
     resp= Integer.parseInt(JOptionPane.showInputDialog("**Bem vindo a Escola da Vida**\n"+
                                                        "Escolha a opção desejada\n"+
                                                         "1 - cadastrar aluno\n"+
                                                         "2 - visualizar Boletim")) ; 
    
    return(resp);
    }

}
