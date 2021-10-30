package pacote;
import javax.swing.*;
public class Pessoa {
    private String nome;
    private int idade;
    private double renda;
    
    //metodo construtor
    public Pessoa() { }

    //metodo construtor  completo ou cheio
    public Pessoa(String n, int i, double r) {
        nome = n;
        idade = i;
        renda = r;
    }



    // metodos get e set
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
    public double getRenda() {
        return renda;
    }
    public void setRenda(double renda) {
        this.renda = renda;
    }

    public void imprimiDados(){
         JOptionPane.showMessageDialog(null,"Nome: "+nome+
                                        "\nIdade: "+idade+
                                        "\nRenda: "+renda);
    }

    public void atualizaRenda(double percente){
        renda = calcularNovarenda(renda, percente);

    }
    private double calcularNovarenda(double r, double percente){ 
        // somente dentro da classe é visto e acessado
      double calc;
      calc= r + (r*percente);
        return calc;
    }
}
