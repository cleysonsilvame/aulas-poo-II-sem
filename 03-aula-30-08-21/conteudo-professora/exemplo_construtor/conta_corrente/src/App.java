public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("*** Conta Corrente **** ");
        
        ContaCorrente conta1 = new ContaCorrente("prof. Jessica",
                                                   1000.00f,
                                                    'k') ;
        
        ContaCorrente conta2 = new ContaCorrente("Larissa",
                                                 -20.00f,  
                                                  0f , 
                                                  'x' );

        System.out.println("A conta 1 pertence a: " + conta1.nome+
                           "\nTem o saldo de: "+ conta1.saldo +
                           "\nTem o limite de: "+ conta1.limite +
                           "\nSeu tipo é: "+conta1.tipo);

        System.out.println("************************************");
        System.out.println("A conta 1 pertence a: " + conta2.nome+
                           "\nTem o saldo de: "+ conta2.saldo +
                           "\nTem o limite de: "+ conta2.limite +
                           "\nSeu tipo é: "+conta2.tipo);


    }
}
