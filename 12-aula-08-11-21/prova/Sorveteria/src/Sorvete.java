import java.time.LocalDate;
import java.util.ArrayList;

public class Sorvete {
  private String nome, descricaoIngr, tipo;
  private LocalDate dataFab, dataVal;
  private int quantidade;
  private ArrayList<String> alergicos;

  public Sorvete() {
  }

  public Sorvete(String nome, String descricaoIngr, LocalDate dataFab, LocalDate dataVal, String tipo, int quantidade,
      ArrayList<String> alergicos) {
    this.nome = nome;
    this.descricaoIngr = descricaoIngr;
    this.dataFab = dataFab;
    this.dataVal = dataVal;
    this.tipo = tipo;
    this.quantidade = quantidade;
    this.alergicos = alergicos;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDescricaoIngr() {
    return descricaoIngr;
  }

  public void setDescricaoIngr(String descricaoIngr) {
    this.descricaoIngr = descricaoIngr;
  }

  public LocalDate getDataFab() {
    return dataFab;
  }

  public void setDataFab(LocalDate dataFab) {
    this.dataFab = dataFab;
  }

  public LocalDate getDataVal() {
    return dataVal;
  }

  public void setDataVal(LocalDate dataVal) {
    this.dataVal = dataVal;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  public ArrayList<String> getAlergicos() {
    return alergicos;
  }

  public void setAlergicos(ArrayList<String> alergicos) {
    this.alergicos = alergicos;
  }

  public void atualizarQtd(String tipo, int qtd) {
    if (tipo.equals("palito") || tipo.equals("pote")) {
      this.quantidade = this.quantidade - qtd;
    } else if (tipo.equals("bola")) {
      this.quantidade = this.quantidade - (50 * qtd);
    } else {
      System.out.println("Digite um sorvete válido (palito, pote ou bola)");
    }

  }

  public void imprimir() {
    System.out.println("Nome: " + this.nome);
    System.out.println("Descrição dos ingredientes: " + this.descricaoIngr);
    System.out.println("Data de fabricação: " + this.dataFab);
    System.out.println("Data de validade: " + this.dataVal);
    System.out.println("Tipo: " + this.tipo);
    System.out.println("Quantidade: " + this.quantidade);
  }

  public boolean vencimento(LocalDate data) {
    return data.isAfter(this.dataVal);
  }

  public void listarAlergicos() {
    System.out.println("Alérgicos:");
    for (String alergico : this.alergicos) {
      System.out.println("\t" + alergico);
    }
  }

}