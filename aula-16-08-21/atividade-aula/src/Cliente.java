public class Cliente {
  String nome;
  String email;
  String dataNasc;

  public String comprarCurso(String nomeCurso) {

    String msg = "Olá " + nome + ", você comprou o curso: " + nomeCurso;

    return msg;
  }

  public String avaliarCurso(String nomeCurso, int nota) {

    String msg = "Olá " + nome + "!\n A nota " + nota + " foi atribuida ao curso: " + nomeCurso;

    return msg;
  }
}
