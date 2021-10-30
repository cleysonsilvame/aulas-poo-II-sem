import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int controle = 0;
        int numero;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        numero = leia.nextInt();
        while(controle <= 10){
            System.out.println(numero+" x "+controle+" = "+(numero*controle));
            controle++; // a variavel de controle precisa ser incrementada dentro do looping

        }
      

        // somatório de numeros quando atingir  10

        float somatorio=0;
        float valor;
        while(somatorio<=10){
            System.out.println("Digite um numero: ");
            valor = leia.nextFloat(); 
            somatorio +=valor;
        }
        System.out.println("O somatóerio é:"+somatorio);
        leia.close();
        
    }
}
