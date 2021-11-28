public class Sorvete {
    private int id, quantidade;
    private String nome, descricaoIngr, tipo;
    private String dataFab, dataVal, alergicos[];
    
    
    public Sorvete() {
    }


    public Sorvete(int id, int quantidade, String nome, String descricaoIngr, String tipo, String dataFab,
            String dataVal, String[] alergicos) {
        this.id = id;
        this.quantidade = quantidade;
        this.nome = nome;
        this.descricaoIngr = descricaoIngr;
        this.tipo = tipo;
        this.dataFab = dataFab;
        this.dataVal = dataVal;
        this.alergicos = alergicos;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public int getQuantidade() {
        return quantidade;
    }


    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getDescricaoIngr() {
        return descricaoIngr;
    }


    public void setDescricaoIngr(String descricaoIngr) {
        this.descricaoIngr = descricaoIngr;
    }


    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public String getDataFab() {
        return dataFab;
    }


    public void setDataFab(String dataFab) {
        this.dataFab = dataFab;
    }


    public String getDataVal() {
        return dataVal;
    }


    public void setDataVal(String dataVal) {
        this.dataVal = dataVal;
    }


    public String[] getAlergicos() {
        return alergicos;
    }


    public void setAlergicos(String[] alergicos) {
        this.alergicos = alergicos;
    }

    void atualizarQtd(String tipo, int qtd){
        if(tipo.toUpperCase() == "PALITO" || tipo.toUpperCase() == "POTE"){
            if(quantidade > qtd){
                quantidade = quantidade - qtd;
            }else{
                System.out.println("Não temos estoque suficiente temos"+ quantidade);
            }
        }else { //if(tipo.toUpperCase() == "MASSA")
            if(quantidade > (qtd*50)){
                quantidade = quantidade - (qtd* 50);
            } else{
                System.out.println("Não temos estoque suficiente temos"+ quantidade);
            }         
        }
    }

    boolean vencimento(String dataV){
        boolean retorno = false;

        if(dataVal.equals(dataV)){ 
            //comparação de objetos use o metodo equals
            retorno = true;
        }

        return retorno;
    }

    void imprimir(){
        String texto = "\t\t\t *** Olha o sorvete *** \n\n\n";
        texto += "id: "+ id+ "\n"+ "nome: "+nome+"\n"+
        "tipo: "+ tipo +"\n"+ "Ingredientes: "+descricaoIngr+"\n"+
        "quantidade: "+quantidade+ "\n"+"Data Fabricação: "+dataFab+"\n"+
        "Data Validade: "+dataVal;

        System.out.println(texto);
        listarAlergicos();
        
    }

    void listarAlergicos(){
        int tamanho = alergicos.length;

        if(tamanho> 0){
             System.out.println("**** ALERGICOS CUIDADO ESSE ALIMENTO CONTÉM:");
            for(int i = 0; i < tamanho; i++){
               System.out.print(alergicos[i]+ ",");
            }
        }

    }


    

    
    
}
