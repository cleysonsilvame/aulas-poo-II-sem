import javax.swing.*;

public class Boletim {
    Double n1,n2,media;

    public Boletim(Double n1, Double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public void imprimiBoletim(){
        String mensagem;
        mensagem = "\t\t\t **** Escola Da vida ****"+"\n\n\n"+
                   "Nota 1: "+n1+"\n"+
                   "Nota 2: "+n2+"\n"+
                   "Media: "+media+"\n"+
                   "Conceito1: "+verificaConceito1()+"\n"+
                   "Conceito 2: "+verificaConceito2();


        JOptionPane.showMessageDialog(null,mensagem);

    }
    public void calculaMedia(){
        media = (n1+n2)/2;
    }
    public String verificaConceito1(){
        String conceito="";
        if(media>=8 && media <=10){
            conceito = "A";
        }
        if(media>=6 && media <8){
            conceito ="B";
        }
        if(media>=4 && media<6){
            conceito="C";
        }
        if(media<4){
            conceito = "D";
        }
        return(conceito);
    }

    public String verificaConceito2(){
        String conceito="";
        if(media>=8 && media<=10){ // nivel 1
            conceito = "A";
        }else{
            if(media>=6 ){ // nivel 2
                conceito ="B";
            }else{
                if(media>=4 ){//nivel 3
                    conceito="C";
                }else{
                   conceito = "D";
                } 
            }
        }
        return(conceito);
    }

    /*public String verificaConceito3(){
        String conceito="";
        int media = (int)this.media;
        switch((media)){
            case(media==8):
                conceito = "A";
                break;
            case(media>=6 && media <8):
                conceito ="B";
                break;
            case(media>=4 && media<6):
                 conceito="C";
                 break;
            case(media<4):
                 conceito="D";
            default:
                conceito="Erro- tente noamente";
            
        }
        return(conceito);
    }*/

    public Boletim historico(Boletim b){
        return b;
    }

    public Boletim historico(Boletim b, float x){
        return b;
    }
    
}
