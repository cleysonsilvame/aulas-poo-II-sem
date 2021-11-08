import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        Vendedor v1 = new Vendedor();
        char resp;
        while(true){
            System.out.print("Digite o nome do vendedor: ");
            // estou salvando o que foi digitado no atributo do objeto
            v1.setNome(leia.next());
            System.out.print("Digite seu salario: ");
            v1.setSalario(leia.nextFloat());
            System.out.print("Digite suas vendas: ");
            v1.setVendas(leia.nextFloat());
            System.out.print("Digite suas faltas: ");
            v1.setFalta(leia.nextInt());
            v1.imprimirDados(1);
            v1.calcularSalario();
            System.out.println("\n********************************************\n");
            v1.imprimirDados(2);
            
            System.out.println("Deseja executar novamente? (S/N)");
            resp = leia.next().charAt(0); // conversão de string next() para caracter next.charAt()
            while(resp != 's' && resp !='S' && resp != 'n'&& resp != 'N' ){
                System.out.println("\nRESPOSTA INCORRETA!!!");
                System.out.println("\nDeseja executar novamente? (S/N)");
                resp = leia.next().charAt(0);
            }

            if (resp == 'N' || resp == 'n'){
                break;
            }

        }
        leia.close();
    }
}
