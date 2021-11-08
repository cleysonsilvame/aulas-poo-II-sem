/*
@autor: Jessica Ribas 

*/
public class Produto implements Seguranca, Imprimivel{
    
    private String descricao;
    private int quantidade;

    public Produto(String d, int q){
        descricao = d;
        quantidade =q;
    }



    public String getDescricao() {
        return descricao;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public int getQuantidade() {
        return quantidade;
    }



    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    @Override
    public String formatoString() {
        String texto = "\n\t\t\t *** Produto *** \n"+
                       "Produto: "+getDescricao()+"\n"+
                       "Quantidade: "+getQuantidade()+"\n"+
                       "*********************************";
        return texto;
    }

    @Override
    public void formatoSystemOut() {
        System.out.println(formatoString());
        
    }

    @Override
    public boolean validar(String nome, String s) {
        // TODO Auto-generated method stub
        return false;
    }
    
}
