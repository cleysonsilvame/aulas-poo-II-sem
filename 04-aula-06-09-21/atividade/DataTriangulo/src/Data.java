public class Data {
  int dia;
  int mes;
  int ano;

  Data() {
  }

  Data(int d, int n, int a) {
    dia = d;
    mes = n;
    ano = a;
  }

  void cadastraDados(int d, int n, int a) {
    dia = d;
    mes = n;
    ano = a;
  }

  void imprimeDados() {
    System.out.println(dia + "/" + mes + "/" + ano);
  }

}
