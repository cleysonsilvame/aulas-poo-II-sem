public abstract class Avo{ // agora tenho uma classe abstrata
    // essa classe não pode ser instanciada

    protected int e;

    public Avo() {
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public abstract void mostrar();

    
}
