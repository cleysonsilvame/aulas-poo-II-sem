public class Produto{
    private String nome;
    private char tipo;
    private double preco;
    private int quantidade;

    public Produto(){}
    public Produto(String n, char t, double p, int q){
        nome = n;
        tipo = t;
        preco = p;
        quantidade = q;
    }

    // metodos get e set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public char getTipo() {
        return tipo;
    }
    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    private boolean atualizarQuantidade(int qtd){
        boolean retorno = false;
        if(quantidade >= qtd){
            quantidade = quantidade - qtd;
            retorno = true;
        }
        return retorno;
    }

    public double venderProduto(int qtd, double valor){
        boolean quantidade = atualizarQuantidade(qtd);
        double venda = 0;
        if(quantidade == true){
            venda = valor * qtd;
         
        }else{
          System.out.println("Não foi possivel realizar a venda");
        }

        return venda;
    
    }

    public void mostrar(){
        String texto;
        texto = " \n** Produto** "+"\n"+"Nome: "+getNome()+"\n"+
                "Tipo: "+getTipo()+"\n"+"Preço: "+getPreco()+ 
                "\n"+"Quantidade: "+getQuantidade()+"\n"+
                "***********************************";
        System.out.println(texto);
    }

    

}