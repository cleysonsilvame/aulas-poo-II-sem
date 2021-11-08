public class Vendedor{
    private float vendas, salario;
    private String nome;
    private int falta;

    //metodo construtor
    
  public Vendedor() {
    }
     
    public Vendedor(float v, float s, String n, int f) {
        vendas = v;
        salario = s;
        nome = n;
        falta = f;
    }
    
    //metodos de acesso
    public float getVendas() {
        return vendas;
    }

    public void setVendas(float vendas) {
        this.vendas = vendas;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getFalta() {
        return falta;
    }
    public void setFalta(int falta) {
        this.falta = falta;
    }


    /*especificos

     O método calcularComissao deverá retornar o valor da comissão, conforme as regras a seguir:
    i) venda igual ou acima de 1.000 e menor que 2.000 bônus de 10% sobre o valor das vendas.
    ii) venda maior ou igual a 2.000 bônus de 15% sobre o valor das vendas.

    */
    private float calcularComissao(){
        float comissao = 0;
        if (vendas>= 1000 && vendas <2000){
            comissao = vendas * 0.1f;
        }
        if (vendas >= 2000){
           comissao = vendas * 0.15f; 
        }
        return comissao;
    }

    /*
    d) O método descontoFalta deverá calcular o desconto das faltas conforme o critério: desconto=(salario/30)*falta
    */
   private  float descontoFalta(){
        float desconto;
        desconto=(salario/30)*falta;
        return desconto;
    }

    /*
    e) O método calcularSalario deverá atender ao critério: salario=(salario+comissao-descontoFalta)
    */
    public void calcularSalario(){
        float comissao = calcularComissao();
        float  desconto = descontoFalta();
        float s;
        s = salario+comissao-desconto;
        salario = s;
        }
    /*
    b) Crie um método imprimirDados que imprime o estado do objeto;

    */   
   public void imprimirDados(){
        String layout = "\t\t\t ** Demontrativo de Horas e Salario **\n\n "+
                        "O funcionario: "+nome+"\n"+
                        "Tem o salario: "+salario+"\n"+
                        "A venda: "+vendas+"\n"+
                        "A quantidades de faltas: "+falta;
        System.out.println(layout);                         
    }

    public void imprimirDados(int v){
        String layout =" ";
        if (v == 1){
             layout= "\t\t\t ** Demontrativo antes da comissao e faltas **\n\n "+
                        "O funcionario: "+nome+"\n"+
                        "Tem o salario: "+salario+"\n"+
                        "A venda: "+vendas+"\n"+
                        "A quantidades de faltas: "+falta;
        }
        else if(v == 2){
            layout= "\t\t\t ** Demontrativo do Pagamento **\n\n "+
            "O funcionario: "+nome+"\n"+
            "Tem o salario: "+salario+"\n"+
            "A venda: "+vendas+"\n"+
            "A quantidades de faltas: "+falta+
            "********************************************" ;
        }
        else{
            layout = "escolha entre as opções 1 e 2! \nErro de processamento!";
        }
        System.out.println(layout);                         
    }



}