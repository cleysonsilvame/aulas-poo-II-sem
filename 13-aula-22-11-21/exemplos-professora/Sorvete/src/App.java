public class App {
    public static void main(String[] args) throws Exception {
        Sorvete morango = new Sorvete();
        
        String alergico[] = {"açucar"};
        Sorvete limao = new Sorvete(2, 
                                   17, 
                                   "Limão", 
                                   "Limão, agua, açucar", 
                                   "palito",
                                    "19/10/2020",
                                     "19/11/2021", 
                                     alergico);

        String alergico1[] = new String[3];
        alergico1[0] = "leite";
        alergico1[1] = "soja";
        alergico1[2] = "morango";
        morango.setAlergicos(alergico1);  
        morango.setNome("Morango");
        morango.setId(2);
        morango.setQuantidade(1000);
        morango.setTipo("bola");
        morango.setDescricaoIngr("Morango, Leite, açucar");
        morango.setDataFab("22/11/2021");
        morango.setDataVal("22/11/2022");

        morango.imprimir();
        boolean resposta = morango.vencimento("22/11/2021");
        if(resposta == true){
            System.out.println("O sorvete de "+morango.getNome()+ "esta vencido jogue fora");
        }

        morango.atualizarQtd("bola", 3);

        morango.imprimir();

        System.out.println("\n\n\n *********************************** \n\n\n ");
        limao.imprimir();
        resposta = limao.vencimento("19/11/2021");
        if(resposta == true){
            System.out.println("O sorvete de "+limao.getNome()+ "esta vencido jogue fora");
        }

        limao.atualizarQtd("palito", 5);
        
        limao.imprimir();


    }
}
