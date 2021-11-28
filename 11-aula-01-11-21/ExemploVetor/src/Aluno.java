import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Aluno {
    private String nome;
    private int idade;
    private double media;

    public Aluno(){}
    public Aluno(String nome, double media){
        this.nome = nome;
        this.media = media;
    }

    



    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getMedia() {
        return media;
    }
    public void setMedia(double media) {
        this.media = media;
    }

    public void verificarPassou(){
        if(media > 6){
            System.out.println("Passou");
        }else{
            System.out.println("Reprovou");
        }
    }

    public static void main(String[] args) {
        ArrayList alunos = new ArrayList<Aluno>();
        Aluno a = new Aluno();
        a.setNome(JOptionPane.showInputDialog(null, "Digite o Nome:"));
        a.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade:")));
        a.setMedia(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a media:")));
        alunos.add(a); // adicionado
        alunos.add(a);

        JOptionPane.showMessageDialog(null, "tamanho da lista: "+alunos.size());

        // remoção da lista
        alunos.remove(0); // remoção pelo indice
        JOptionPane.showMessageDialog(null, "tamanho da lista: "+alunos.size());
    }
}
