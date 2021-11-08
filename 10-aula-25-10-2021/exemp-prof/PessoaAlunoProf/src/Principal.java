public class Principal {
    public static void main(String[] args) throws Exception {
       Pessoas pessoa = new Aluno("Nome","3333");
       System.out.print(pessoa.toString());
       
       //casting conversão de tipos de super classe
       // subclasse
        ((Aluno) pessoa).setRgm("36594-8");
        System.out.println("\n\n estou no casting "+((Aluno) pessoa).getRgm()+"\n");

        Pessoas k = new Pessoas("João") {};
        
        if (k instanceof Aluno){ // se o objeto criado é uma instancia de aluno
            // foi criado com o contrutor de aluno então
            //da para afzer o casting
        ((Aluno) k).setRgm("8529-3");
        System.out.print("\n\n estou no casting "+((Aluno) k).getRgm());
        }else{
            System.out.println("Não faz o casting");
        }











    }
}
