public class Curso {
  String nome;
  String assunto;
  String dataCurso;

  public String assistirCurso(String nomeCurso) {
    this.nome = nomeCurso;

    String msg = "Você está assistindo o curso: " + nome;

    return msg;
  }

  public String getDataCurso(String nomeCurso) {

    String msg = "O curso " + nome + " é de " + dataCurso;
    
    return msg;
  }
  
  public String getAssuntoCurso(String nomeCurso) {
    
    String msg = "O curso " + nome + " é sobre " + assunto;

    return msg;
  }
}
