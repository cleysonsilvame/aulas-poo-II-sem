import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String nome;
        int idade;
        double renda;
        char resp;
        Scanner leia = new Scanner(System.in);

        while(true){
            System.out.println("Digite o nome: ");
            nome = leia.next();
            
            System.out.println("Digite a idade: ");
            idade = leia.nextInt();

            System.out.println("Digite a renda: ");
            renda = leia.nextDouble();

            System.out.println("Só para confirmar os dados digitado:");
            System.out.println("O nome: "+nome+"\n"+"Idade: "+
                               idade+"\n"+"Renda: "+renda);

            System.out.println("************************************************");
            System.out.println("Deseja executar novamente? \nDigite S para Sim ou N para Não");
            resp = leia.next().charAt(0);
            while(resp != 'N' && resp != 'n' && resp != 'S' &&  resp != 's'){
                System.out.println("******* Resposta Incorreta ******** ");
                System.out.println("Deseja executar novamente?\n Digite S para Sim ou N para Não");
                resp = leia.next().charAt(0);
            }
           
            if( resp == 'N' || resp == 'n'){
                break; // encerro o laço de repetição quando o usduario desejar sair
            }
        }

        leia.close();


    }
}
