public class Livro extends Publicacao implements Teste {

    private String editora;
    private String autores[];

    public Livro(String titulo, String dataPublicacao, String editora, String[] autores) {
        super(titulo, dataPublicacao);
        this.editora = editora;
        this.autores = autores;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String[] getAutores() {
        return autores;
    }

    public void setAutores(String[] autores) {
        this.autores = autores;
    }

    public void imprimir(){

        String texto = "\n** Livro ** "+"\n"+"Titutlo: "+getTitulo()+"\n"+
        "Autor: "+getTitulo()+ "\n"+"Editora: "+getEditora()+ "\n"+
        "Data de Publicação: "+getDataPublicacao();

        System.out.println(texto);
    }

    
    public boolean verificar(){
        return true;
    }

    public void mostrar(){
        System.out.println("mostrei");
    }

    public void incluir(){
        System.out.println("incluido");
    }

    



  

    


}
