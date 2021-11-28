import java.util.Scanner;

public class LacoRepeticao {
    public static void main(String[] args) {
        System.out.println("LAÇO REPETICAO");
        String vetor[] = new String[5];
        Scanner leia = new Scanner(System.in);

        for(int cont=0; cont < vetor.length; cont++){
            System.out.print("Digite um texto: ");
            vetor[cont] = leia.next();

        }

        System.out.println("o tamanho do vetor: "+vetor.length);

        System.out.println(vetor[0]+" "+ vetor[1]+ " "+ vetor[2]+ " ");

        for(int cont = 0; cont < vetor.length; cont++){
            System.out.println(vetor[cont]);

        }

        leia.close();
    }
}
