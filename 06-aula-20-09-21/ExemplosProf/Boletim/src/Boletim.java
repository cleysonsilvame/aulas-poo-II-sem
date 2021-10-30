import javax.swing.*;

public class Boletim {
    Double n1,n2,media;
     
    public Boletim(){}

    public Boletim(Double v1, Double v2) {
        n1 = v1;
        n2 = v2;
    }

    public void imprimiBoletim(){
        String mensagem;
        mensagem = "\t\t\t **** Escola Da vida ****"+"\n\n\n"+
                   "Nota 1: "+n1+"\n"+
                   "Nota 2: "+n2+"\n"+
                   "Media: "+media+"\n"+
                   "Conceito1: "+verificaConceito1(media)+"\n"+
                   "Conceito 2: "+verificaConceito2(media)+"\n"+
                   "Conceito 3: "+verificaConceito3(media);


        JOptionPane.showMessageDialog(null,mensagem);

    }
    public void calculaMedia(){
        media = (n1+n2)/2;
    }
    public String verificaConceito1(double nf){
        String conceito=" ";
        if(nf>=8 && nf <=10){
            conceito = "A";
        }
        if(nf>=6 && nf <8){
            conceito ="B";
        }
        if(nf>=4 && nf<6){
            conceito="C";
        }
        if(nf<4){
            conceito = "D";
        }
        return(conceito);
    }

    public String verificaConceito2(double nf){
        String conceito="";
        if(nf>=8 && nf<=10){ // nivel 1
            conceito = "A";
        }else{
            if(nf>=6 ){ // nivel 2
                conceito ="B";
            }else{
                if(nf>=4 ){//nivel 3
                    conceito="C";
                }else{
                   conceito = "D";
                } 
            }
        }
        return(conceito);
    }

    public String verificaConceito3(double nf){
        String conceito="";
       
        if (nf>=8){
                conceito = "A";
        }else if(nf>=6 && nf <8){
                conceito ="B";
        }else if(nf>=4 && nf<6){
            conceito="C";
        }
        else if(nf<4){
                 conceito="D";
        }else{
            conceito="Erro- tente noamente";
        }
        return(conceito);
    }

    public Boletim historico(Boletim b){
        return b;
    }

    public Boletim historico(Boletim b, float x){
        return b;
    }

    // menu de teste do sitch case
    
}
