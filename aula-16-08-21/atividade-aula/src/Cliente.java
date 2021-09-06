public class Cliente {
  String nome, email, dataNasc;

  public String comprarCurso(String nomeCurso) {

    String msg = "Olá " + nome + ", você comprou o curso: " + nomeCurso;

    return msg;
  }

  public String avaliarCurso(String nomeCurso, int nota) {

    String msg = "Olá " + nome + "!\nA nota " + nota + " foi atribuida ao curso: " + nomeCurso;

    return msg;
  }
}
