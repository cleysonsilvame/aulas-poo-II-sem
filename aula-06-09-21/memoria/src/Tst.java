public class Tst {
    // atributos
    float mp = 10.4f;
    double ml = 78.99;
    int vida = 100;
    char clase = 'p';
    boolean bobo = false;

   // 3 construtores  
    public Tst(){ 
        // construtor vazio
    }
    public Tst(float p){
        mp = p;
    }
    public Tst(float p, double m){
        mp = p;
        ml = m;
    }
    public float getMp() {
        return mp;
    }
    public void setMp(float mp) {
        this.mp = mp;
    }
    public double getMl() {
        return ml;
    }
    public void setMl(double ml) {
        this.ml = ml;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public char getClase() {
        return clase;
    }
    public void setClase(char clase) {
        this.clase = clase;
    }
    public boolean isBobo() {
        return bobo;
    }
    public void setBobo(boolean bobo) {
        this.bobo = bobo;
    }

    

}

