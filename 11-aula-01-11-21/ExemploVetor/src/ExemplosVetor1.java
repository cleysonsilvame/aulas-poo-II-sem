public class ExemplosVetor1 {
 public static void main(String[] args) {
      
    // criar vetor em branco
     String nome[] = new String[5];
     int idade[] = new int[5];

    // declarei o vetor     //instanciei o vetor
    double salario[] = new double[5];

 
  

  // criar vetor preenchido
  String qualquer[] = {"Maria","Joao", "Jose", "Jesus", "Madalena"};
  int i[] = {1, 2, 3, 4, 5, 6};

  // vetor[posicao] = valor;

  idade[0] = 30;
  idade[4] = 7;

  System.out.println("idade "+idade[1]+ " nome: "+ nome[0]);

  System.out.println(qualquer.length + " "+ i[1]);


  // copiar um vetor

  int k[] = {10, 30, 40, 50, 60, 80};
  int k1[] = new int[k.length];
  
  for(int t = 0; t < k.length; t++ ){

     k1[t] = k[t];
  }

}

  
}
