public class Aluno extends Pessoas {
    private String rgm;

   // public Aluno(){};

    public Aluno(String n, String r){
        super.nome = n;
        rgm = r;
    }

    public String getRgm() {
        return rgm;
    }

    public void setRgm(String rgm) {
        this.rgm = rgm;
    }

    @Override
    public String toString() {
        return "Aluno [rgm=" + rgm + "]";
    }



    
    

}
