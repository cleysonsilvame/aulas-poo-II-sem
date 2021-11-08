public interface Imprimivel {
    // final ou static atributos
    final char nlin = '\n'; 
    static int v =0;

    // metodos eles não podem ser implementados na interface
    public String formatoString();
    public void formatoSystemOut();

}
