public class Produto {
  String marca, fabricante, cod_barras;
  float preco;

  public Produto() {}

  public Produto(String m, String f, String c, float p) {
    marca = m;
    fabricante = f;
    cod_barras = c;
    preco = p;
  }
}